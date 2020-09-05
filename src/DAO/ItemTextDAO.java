package DAO;

import common.VO.*;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
            return new ArrayList<Item>();
        }
    }

    @Override
    public Item read(int id) {
        List<Item> itens = this.list();
        if (itens == null) {
            return null;
        }
        Predicate<Item> predict = item -> item.getId() == id;

        var x = itens.stream().filter(predict).collect(Collectors.toList());
        try {
            if (x.get(0) == null) {
                return null;
            }

            return x.get(0);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public Item create(Item item) {
        try {
            List<Item> itens = this.list();

            int id = itens.size() + 1;
            item.setId(id);

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
    public Item update(Item item) {
        this.delete(item.getId());
        return this.create(item);
    }

    @Override
    public void delete(int id) {
        try {
            List<Item> itemList = this.list();

            Item itemToExclude = new Item();
            for (Item currentItem : itemList) {
                if (id == currentItem.getId()) {
                    itemToExclude = currentItem;
                }
            }

            itemList.remove(itemToExclude);

            Gson gson = new Gson();
            String json = gson.toJson(itemList);

            FileWriter writter = new FileWriter(this.getPathName());
            writter.write(json);
            writter.close();

            return;
        } catch (Exception e) {
            return;
        }
    }

}