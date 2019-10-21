import java.util.Iterator;

public class Queue<T> extends AbstractQueue {
    @Override
    public  void clearQueue(){
        list.clear();
    }

    @Override
    public  boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public  int length(){
        return list.size();

    }
    @Override
    public Object poll(){
        return list.get(0);
    }

    @Override
    public void enQueue (Object t){
        list.add(t);
    }

    @Override
    public  Object deQueue(){
        return list.remove(0);
    }

    @Override
    public void traverse(Visit visit){
        for (Iterator<String> iterator = list.iterator();iterator.hasNext();){
            visit.operate(iterator.next());
        }
    }

//        测试
//        public static void main(String[] args) {
//        Queue queue = new Queue();
//        queue.list=new LinkedList<>();
//        queue.list.add("a");
//        queue.list.add("c");
//        queue.list.add("b");
//        queue.list.add("d");
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.length());
//        System.out.println(queue.deQueue());
//        System.out.println(queue.poll());
//        queue.enQueue("e");
//        System.out.println(queue.length());
//        queue.clearQueue();
//        System.out.println(queue.isEmpty());
//    }
}

