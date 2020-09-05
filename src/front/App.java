package front;

import common.VO.*;
import DAO.ItemTextDAO;
import business.business;

public class App {
    public static void main(String[] args) {
        ItemTextDAO a = new ItemTextDAO();
        Item x = a.read(1);

        
    }
}