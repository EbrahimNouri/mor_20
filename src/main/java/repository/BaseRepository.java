package repository;

public interface BaseRepository <T> {
    void create(T t);
    T read();
    T update(T t);
    void delete(T t);
}
