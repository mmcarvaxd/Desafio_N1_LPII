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

       if(items.size() == 0)
       {
        return null;
       }
       return items;
   }

}