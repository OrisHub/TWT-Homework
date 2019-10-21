import java.util.LinkedList;
public abstract class AbstractQueue<T>{
    protected LinkedList<T> list;
    public abstract void clearQueue();
    public abstract boolean isEmpty();
    public abstract int length();
    public abstract T poll();
    public abstract void enQueue(T t);
    public abstract T deQueue();
    public abstract void traverse(Visit visit);

}