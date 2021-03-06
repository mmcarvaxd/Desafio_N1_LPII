package common.Generic;

import java.util.List;
import java.io.File;

public abstract class DAO<E extends Model> {
    private String name;
    private String pathName;

    public String getPathName() {
        return pathName;
    }

    public abstract List<E> list();

    public abstract E read(int id);

    public abstract E create(E item);

    public abstract E update(E item);

    public abstract void delete(int id);

    public void verifyDB() {
        try {
            //Create db folder if not exists
            File currentDirFile = new File("db");
            String helper = currentDirFile.getAbsolutePath();
            currentDirFile.mkdir();
            
            //Create db file if not exists
            String fileName = helper + "\\" + name + ".tft";
            pathName = fileName;
            File file = new File(fileName);
            boolean exists = file.exists();

            if (!exists) {
                file.createNewFile();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public DAO(String nameDB) {
        name = nameDB;
        verifyDB();
    }
}