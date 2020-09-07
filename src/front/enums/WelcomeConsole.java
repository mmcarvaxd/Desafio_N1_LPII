package front.enums;

import java.util.Scanner;

import front.App;

public class WelcomeConsole extends MachineStateConsole {

    @Override
    public boolean execute() {
        boolean exit = false;
        System.out.println("Bem vindo ao Sistema nacional de estoque!");
        System.out.println("Indique a opção desejada!");
        System.out.println("0 - Sair");
        System.out.println("1 - Listar");
        System.out.println("2 - Criar");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        switch (option) {
            case 0:
                exit = true;
                break;
            case 1:
                App.actualStateMachine = EnumStateConsole.LIST.getMachineState();
                break;
            case 2:
                App.actualStateMachine = EnumStateConsole.CREATE.getMachineState();
                break;
        }
        return exit;
    }

}