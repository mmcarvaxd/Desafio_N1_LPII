package front.enums;

import java.util.Scanner;

import business.Business;
import common.VO.Item;
import front.App;

public class CreateConsole extends MachineStateConsole {

    @Override
    public boolean execute() {
        boolean exit = false;
        createItem();
        return exit;
    }

    private void createItem() {
        Scanner scan = new Scanner(System.in);
        Business business = new Business();
        Item item = new Item();
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Digite o nome do produto: ");
            String name = scan.nextLine();

            if (!name.isBlank() || !name.isEmpty()) {
                item.SetName(name);
                isValid = true;
            }
        }

        isValid = false;
        while (!isValid) {
            System.out.print("Digite a descrição do produto: ");
            String description = scan.nextLine();

            if (!description.isBlank() || !description.isEmpty()) {
                item.SetDescription(description);
                isValid = true;
            }
        }

        isValid = false;
        while (!isValid) {
            System.out.print("Digite o local de compra do produto: ");
            String purchasePlace = scan.nextLine();
            if (!purchasePlace.isBlank() || !purchasePlace.isEmpty()) {
                item.SetPurchasePlace(purchasePlace);
                isValid = true;
            }
        }

        isValid = false;
        while (!isValid) {
            System.out.print("Digite o valor de etiqueta do produto: ");
            double tagValue = scan.nextDouble();
            if (tagValue > 0) {
                item.SetTagValue(tagValue);
                isValid = true;
            }
        }

        isValid = false;
        while (!isValid) {
            System.out.print("Digite o valor de compra do produto: ");
            double purchaseValue = scan.nextDouble();
            if (purchaseValue > 0) {
                item.SetPurchaseValue(purchaseValue);
                isValid = true;
            }
        }

        isValid = false;
        while (!isValid) {
            System.out.print("Digite o valor sugerido do produto: ");
            double suggestedValue = scan.nextDouble();
            if (suggestedValue > 0) {
                item.SetSuggestedValue(suggestedValue);
                isValid = true;
            }
        }

        business.createItem(item);
        System.out.println("Item criado com sucesso!");
        App.actualStateMachine = EnumStateConsole.LIST.getMachineState();
    }
}