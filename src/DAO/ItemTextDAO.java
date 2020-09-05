package DAO;

import common.VO.*;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import common.Generic.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ItemTextDAO extends DAO<Item> {

    public ItemTextDAO() {
        super("Itens");
    }

    @Override
    public List<Item> list() {
        try {
            File file = new File(this.getPathName());
            Scanner sc = new Scanner(file);

            String json = "";
            while (sc.hasNextLine()) {
                json += sc.nextLine();
            }
            sc.close();

            List<Item> itens = new ArrayList<Item>();
            Gson gson = new Gson();
            itens = gson.fromJson(json, new TypeToken<List<Item>>() {
            }.getType());

            return itens;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Item read(int id) {
        List<Item> itens = this.list();
        if (itens == null) {
            return null;
        }

        for (Item item : itens) {
            //if
        }


        return null;
    }

    @Override
    public Item create(Item item) {
        try {
            List<Item> itens = this.list();
            if (itens == null) {
                itens = new ArrayList<Item>();
            }

            itens.add(item);

            Gson gson = new Gson();
            String json = gson.toJson(itens);
            FileWriter writter = new FileWriter(this.getPathName());
            writter.write(json);
            writter.close();

            return item;
        } catch (Exception e) {
            return null;
        }
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