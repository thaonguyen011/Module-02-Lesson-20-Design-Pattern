import java.util.LinkedList;

public abstract class MemoryPool<T> {
    private LinkedList<T> free_items = new LinkedList<>();

    public void freeItem(T items) {
        free_items.add(items);
    }

    protected abstract T allocate();

    public T newItem(){
        if (free_items.isEmpty()) {
            return allocate() ;
        } else {
           return free_items.removeFirst();
        }
    }
}
