package pex.app.main;

import pex.core.Interpreter;

import pex.app.evaluator.EvaluatorMenu;
import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.InputString;
import pt.utl.ist.po.ui.Menu;
import pt.utl.ist.po.ui.Display;
import pt.utl.ist.po.ui.Form;


/**
 * Open menu for managing programs.
 */
public class EditProgram extends Command<Interpreter> {

    /**
     * @param receiver
     */
    public EditProgram(Interpreter receiver) {
        super(Label.MANAGE_PROGRAM, receiver);
    }

    /** @see pt.utl.ist.po.ui.Command#execute() */
    @Override
    public final void execute() {
        //FIXME implement
    }

}
