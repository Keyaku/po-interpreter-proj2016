package pex.core.instruction;

// FIXME: remove these if we're to put Expression right under core/
import pex.core.expression.*;


public class Eq extends BinaryExpression {
	public Eq(Expression arg1, Expression arg2) {
		super(arg1, arg2);
	}

	public String getAsText() {
		return "Eq(" +
			getFirstArgument().getAsText()  + ", " +
			getSecondArgument().getAsText() +
			")";
	}

	public String evaluate() {
		// FIXME
		return "";
	}
}