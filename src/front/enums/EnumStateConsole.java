package front.enums;

public enum EnumStateConsole {
    WELCOME(new WelcomeConsole()),
    EDIT(new EditConsole()),
    CREATE(new CreateConsole()),
    DELETE(new DeleteConsole()),
    LIST(new ListConsole());

    private final MachineStateConsole machineState;
    EnumStateConsole(MachineStateConsole machineState) {
        this.machineState = machineState;
    }

    public MachineStateConsole getMachineState() {
        return machineState;
    }
}
