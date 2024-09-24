import java.util.ArrayList;

public interface IDAO<T> {
    public ArrayList<T> getAll();
    public T getItemById(int id);
    public void insert(T t);
}
