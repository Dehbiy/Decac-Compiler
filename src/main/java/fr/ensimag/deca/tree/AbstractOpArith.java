package fr.ensimag.deca.tree;

import fr.ensimag.deca.context.*;
import fr.ensimag.deca.DecacCompiler;

/**
 * Arithmetic binary operations (+, -, /, ...)
 * 
 * @author gl22
 * @date 01/01/2024
 */
public abstract class AbstractOpArith extends AbstractBinaryExpr {

    public AbstractOpArith(AbstractExpr leftOperand, AbstractExpr rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public Type verifyExpr(DecacCompiler compiler, EnvironmentExp localEnv,
            ClassDefinition currentClass) throws ContextualError {
//        throw new UnsupportedOperationException("not yet implemented");
        String opName = this.getOperatorName();
        switch (opName) {
            case "%":
                Type typeMod =  this.verifyExpr(compiler, localEnv, currentClass);
                return typeMod;
            default:
                AbstractExpr left = this.getLeftOperand();
                AbstractExpr right = this.getRightOperand();
                Type type1 = left.verifyExpr(compiler, localEnv, currentClass);
                Type type2 = right.verifyExpr(compiler, localEnv, currentClass);
                Type syntType = verifyArithOp(compiler, opName, type1, type2);
                return syntType;
        }
    }

    public Type verifyArithOp(DecacCompiler compiler, String op, Type type1, Type type2) throws ContextualError {
        if ((type1 instanceof IntType) && (type2 instanceof IntType)) {
            return compiler.environmentType.INT;
        }
        if ((type1 instanceof IntType) && (type2 instanceof FloatType)) {
            return compiler.environmentType.FLOAT;
        }
        if ((type1 instanceof FloatType) && (type2 instanceof IntType)) {
            return compiler.environmentType.FLOAT;
        }
        if ((type1 instanceof FloatType) && (type2 instanceof FloatType)) {
            return compiler.environmentType.FLOAT;
        }
        throw new ContextualError(op + " operation cannot occur between " + type1 + " and " + type2 + " !", this.getLocation());
    }

}