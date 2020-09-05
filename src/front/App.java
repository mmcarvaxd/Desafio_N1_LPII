package front;

import common.VO.*;
import DAO.ItemTextDAO;
import business.business;

public class App {
    public static void main(String[] args) {
        
        ItemTextDAO po = new ItemTextDAO();
        System.out.println(po.read(3));
    }
}