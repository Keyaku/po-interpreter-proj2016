package pex.core.function;

public class While extends BinaryExpression {
	public While(Expression arg1, Expression arg2) {
		super(arg1, arg2);
	}

	public String getAsText() {
		return "While(" +
			getFirstArgument().getAsText()  + ", " +
			getSecondArgument().getAsText() +
			")";
	}

	public String evaluate() {
		// FIXME
		return "";
	}
}
