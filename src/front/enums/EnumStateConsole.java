package front.enums;

public enum EnumStateConsole {
    WELCOME(new WelcomeConsole()),
    LIST(new ListConsole());

    private final MachineStateConsole machineState;
    EnumStateConsole(MachineStateConsole machineState) {
        this.machineState = machineState;
    }

    public MachineStateConsole getMachineState() {
        return machineState;
    }
}
