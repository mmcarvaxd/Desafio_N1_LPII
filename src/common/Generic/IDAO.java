package common.Generic;

import java.util.List;

public interface IDAO<E extends Model> {
    public List<E> list();
    public E read();
    public E create();
    public E update();
    public void delete();
}