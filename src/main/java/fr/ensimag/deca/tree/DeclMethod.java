package fr.ensimag.deca.tree;

import fr.ensimag.deca.DecacCompiler;
import fr.ensimag.deca.context.*;
import fr.ensimag.deca.tools.IndentPrintStream;

import java.io.PrintStream;

import org.apache.commons.lang.Validate;

public class DeclMethod extends AbstractDeclMethod{
    final private AbstractIdentifier type;
    final private AbstractIdentifier methodName;
    final private ListDeclParam list_param;
    final private MethodBody methodBody;

    public DeclMethod(AbstractIdentifier type, AbstractIdentifier methodName, ListDeclParam list_param,MethodBody methodBody) {
        Validate.notNull(type);
        Validate.notNull(list_param);
        Validate.notNull(methodName);
        this.type=type;
        this.methodName = methodName;
        this.list_param=list_param;
        this.methodBody=methodBody;

    }
    @Override
    public void decompile(IndentPrintStream s) {

    }

    @Override
    protected void prettyPrintChildren(PrintStream s, String prefix) {
        type.prettyPrint(s, prefix, false);
        methodName.prettyPrint(s, prefix, false);
        list_param.prettyPrint(s, prefix, false);
        methodBody.prettyPrint(s, prefix, true);
    }

    @Override
    protected void iterChildren(TreeFunction f) {
        type.iter(f);
        methodName.iter(f);
        list_param.iter(f);
        methodBody.iter(f);
    }






    @Override
    protected EnvironmentExp verifyMethod(DecacCompiler compiler, AbstractIdentifier superId) throws ContextualError {
        ClassDefinition envSup = superId.getClassDefinition();
        Type typeM = type.verifyType(compiler);
        if(envSup == null){
            throw new ContextualError("Super class"+superId.getName()+"is not defined !", superId.getLocation());
        }
        ExpDefinition envExpSuper= envSup.getMembers().getExpDefinitionMap().get(methodName.getName());
        if(envExpSuper != null){
            MethodDefinition methDef =superId.getMethodDefinition();
            Signature sig2=methDef.getSignature();
            Type type2=methDef.getType();
            Signature signature = list_param.verifyListDeclParam(compiler);
            if(!sig2.equals(signature)){
                throw new ContextualError(methodName.getName()+" not same signature", getLocation());
            }
            if(! type2.isSubType( compiler.environmentType,typeM)){
                throw new ContextualError(methodName.getName()+" not subtype ", getLocation());
            }
        }
        EnvironmentExp envExp=new EnvironmentExp(null);
        envSup.incNumberOfMethods();
        MethodDefinition methDefReturned= new MethodDefinition(typeM, getLocation(), list_param.getSignature(),envSup.getNumberOfMethods());
        envExp.declare(methodName.getName(), methDefReturned);
        methodName.setDefinition(methDefReturned);
        return envExp;
    }

    @Override
    protected void verifyMethodBody(DecacCompiler compiler, EnvironmentExp localEnv, ClassDefinition classId) throws ContextualError {
        Type returnType=type.verifyType(compiler);
        list_param.verifyListParamName(compiler);
        methodBody.verifyMethodBody(compiler, localEnv, classId, returnType);

    }

    @Override
    protected AbstractIdentifier getMethodName() {
        return this.methodName;
    }

    @Override
    protected AbstractIdentifier getMethodType() {
        return this.type;
    }

}