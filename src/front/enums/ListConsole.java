package front.enums;

import java.util.List;
import java.util.Scanner;

import business.Business;
import common.VO.Item;
import front.App;

public class ListConsole extends MachineStateConsole {

    @Override
    public boolean execute() {
        boolean exit = false;
        Business business = new Business();

        List<Item> itens = business.getAllSavedData();
        if(itens == null) {
            System.out.println("Não há item para listar!!!");
            App.actualStateMachine = EnumStateConsole.WELCOME.getMachineState();
            return exit;
        }

        for (Item item : itens) {
            System.out.println("--------------------------------------------");
            System.out.println(item);
        }
        System.out.println("--------------------------------------------");
        System.out.println("0 - Voltar");
        System.out.println("1 - Editar");
        System.out.println("2 - Excluir");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        switch (option) {
            case 0:
                App.actualStateMachine = EnumStateConsole.WELCOME.getMachineState();
                break;
            case 1:
                App.actualStateMachine = EnumStateConsole.EDIT.getMachineState();
                break;
            case 2:
                App.actualStateMachine = EnumStateConsole.DELETE.getMachineState();
                break;
        }
        return exit;
    }

}