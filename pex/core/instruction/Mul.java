package pex.core.instruction;

import pex.core.expression.*;


public class Mul extends BinaryExpression {
	public Mul(Expression arg1, Expression arg2) {
		super(arg1, arg2);
	}

	public String getInstructionName() {
		return "mul";
	}

	public Literal evaluate() {
		IntegerLiteral lit1 = (IntegerLiteral) getFirstArgument().evaluate();
		IntegerLiteral lit2 = (IntegerLiteral) getSecondArgument().evaluate();
		int result = lit1.intValue() * lit2.intValue();
		return new IntegerLiteral(result);
	}
}
