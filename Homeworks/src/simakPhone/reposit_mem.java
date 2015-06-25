package simakPhone;

import java.util.List;

/**
 * Created by LSimak on 23.06.2015.
 */
public interface reposit_mem <T> {
    T get(int id);
    List<T> getAll();
    void add(T entity);
    void remove(T entity);
    void update(T entity);
    List<T> sort(T entity);
}
