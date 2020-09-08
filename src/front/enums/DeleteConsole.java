package front.enums;

import java.util.Scanner;

import business.Business;
import common.VO.Item;
import front.App;

public class DeleteConsole extends MachineStateConsole {

    @Override
    public boolean execute() {
        boolean exit = false;
        
        System.out.print("Selecione o produto pelo ID, ou digite 0 para voltar: ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        switch (option) {
            case 0:
                App.actualStateMachine = EnumStateConsole.LIST.getMachineState();
                break;
            default:
                Business business = new Business();
                Item item = business.getSelectedItem(option);
                
                if(item == null){
                    System.out.println("Não existe um item cm esse ID!!!");
                    App.actualStateMachine = EnumStateConsole.EDIT.getMachineState();
                    break;
                } else {
                    deleteItem(item);
                    App.actualStateMachine = EnumStateConsole.LIST.getMachineState();
                    break;
                }
        }
        return exit;
    }
    
    private void deleteItem(Item item) {
        Business business = new Business();
        business.deleteItem(item);
        System.out.println("Item apagado com sucesso!");
    }
}