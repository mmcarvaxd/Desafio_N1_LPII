package front;

import front.enums.EnumStateConsole;
import front.enums.MachineStateConsole;

public class App {
    public static MachineStateConsole actualStateMachine;

    public static void main(String[] args) {
        InitMenu();
    }

    public static void InitMenu() {
        boolean exit = false;
        actualStateMachine = EnumStateConsole.WELCOME.getMachineState();
        while (!exit) {
            exit = actualStateMachine.execute();
        }
    }
}
