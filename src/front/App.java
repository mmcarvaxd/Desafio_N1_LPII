package front;

import common.VO.*;
import DAO.ItemTextDAO;
import business.business;

public class App {
    public static void main(String[] args) {
        ItemTextDAO a = new ItemTextDAO();
        Item item = new Item();

        item.SetDescription("Teste");
        item.SetName("Teste");

        a.create(item);
    }
}