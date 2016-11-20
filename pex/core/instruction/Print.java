package pex.core.instruction;

import java.util.List;

import pex.AppIO;

// FIXME: remove these if we're to put Expression right under core/
import pex.core.expression.*;

public class Print extends VariadicExpression {
	private AppIO _io; // FIXME: what to do with this?

	public Print(List<Expression> args) {
		super(args);
	}

	public String getAsText() {
		String result = "Print(";
		for (Expression exp : getArguments()) {
			result += exp.getAsText() + ", ";
		}
		return result + ")";
	}

	public Literal evaluate() {
		// FIXME
		return null;
	}
}
