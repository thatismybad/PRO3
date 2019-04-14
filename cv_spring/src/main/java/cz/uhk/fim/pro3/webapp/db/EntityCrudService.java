package cz.uhk.fim.pro3.webapp.db;

import java.util.List;

public interface EntityCrudService<T> {
    T create(T t);
    T read(long id);
    T update(T t);
    void delete(T t);
    void delete(long id);
    List<T> loadAll();
}
