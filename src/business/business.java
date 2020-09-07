package business;

import DAO.ItemTextDAO;
import common.VO.*;
import java.util.List;

public class Business {

    ItemTextDAO context;

    public Business() {
        context = new ItemTextDAO();
    }

    public List<Item> getAllSavedData() {
        var items = context.list();

        if (items.size() == 0) {
            return null;
        }
        return items;
    }

    public Item getSelectedItem(int id) {
        return context.read(id);
    }

    public void editItem(Item item) {
       context.update(item); 
    }

    public void deleteItem(Item item) {
        context.delete(item.getId()); 
    }

    public void createItem(Item item) {
        context.create(item); 
    }
}