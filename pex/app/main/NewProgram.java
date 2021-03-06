package pex.app.main;

import pex.app.App;
import pex.core.Program;

import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Form;
import pt.utl.ist.po.ui.InputString;

/**
 * Create new program.
 */
public class NewProgram extends Command<App> {

    /**
     * @param receiver
     */
    public NewProgram(App receiver) {
        super(Label.NEW_PROGRAM, receiver);
    }

    /** @see pt.utl.ist.po.ui.Command#execute() */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {
		String programName = entity().readString(title(), Message.requestProgramId());
        entity().getInterpreter().addProgram(new Program(programName));
    }
}
