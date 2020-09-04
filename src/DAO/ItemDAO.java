package DAO;

import common.VO.*;
import java.util.List;
import common.Generic.*;
import com.google.gson.Gson;

public class ItemDAO extends DAO<Item> {

    public ItemDAO(String nameDB) {
        super(nameDB);
    }

    @Override
    public List<Item> list() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Item read() {

        //String  jsonString = //doSthToGetJson(); //Get the Json
        Item data =new Item() ; 
        Gson gson = new Gson();  
        //data= gson.fromJson(jsonString,MyData.class); 
        return null;
    }

    @Override
    public Item create(Item Item) {
        Gson gson = new Gson();  
        String Json = gson.toJson(Item);

        return null;
    }

    @Override
    public Item update() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub

    }
    
}