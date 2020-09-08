package front.enums;

import java.util.Scanner;

import business.Business;
import common.VO.Item;
import front.App;

public class EditConsole extends MachineStateConsole {

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
                    editItem(item);
                    break;
                }
        }
        return exit;
    }

    public void editItem(Item item) {
        Scanner scan = new Scanner(System.in);
        Business business = new Business();
        
        System.out.print("Digite o nome do produto ou aperte enter para manter o mesmo (" + item.GetName() + "):" );
        String name = scan.nextLine();
        if(!name.isBlank() || !name.isEmpty()) {
            item.SetName(name);
        }

        System.out.print("Digite a descrição do produto ou aperte enter para manter o mesmo (" + item.GetDescription() + "):" );
        String description = scan.nextLine();
        if(!description.isBlank() || !description.isEmpty()) {
            item.SetDescription(description);
        }

        System.out.print("Digite o local de compra do produto ou aperte enter para manter o mesmo (" + item.GetPurchasePlace() + "):" );
        String purchasePlace = scan.nextLine();
        if(!purchasePlace.isBlank() || !purchasePlace.isEmpty()) {
            item.SetPurchasePlace(purchasePlace);
        }

        System.out.print("Digite o valor de etiqueta do produto ou digite 0 para manter o mesmo (" + item.GetTagValue() + "):" );
        double tagValue = scan.nextDouble();
        if(tagValue > 0) {
            item.SetTagValue(tagValue);
        }

        System.out.print("Digite o valor de compra do produto ou digite 0 para manter o mesmo (" + item.GetPurchaseValue() + "):" );
        double purchaseValue = scan.nextDouble();
        if(purchaseValue > 0) {
            item.SetPurchaseValue(purchaseValue);
        }

        System.out.print("Digite o valor sugerido do produto ou digite 0 para manter o mesmo (" + item.GetSuggestedValue() + "):" );
        double suggestedValue = scan.nextDouble();
        if(suggestedValue > 0) {
            item.SetSuggestedValue(suggestedValue);
        }

        business.editItem(item);
        System.out.println("Item salvo com sucesso!");
    }
}