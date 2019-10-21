import java.util.*;

public class HomeworkThree {
    public List<String> startWithA (List<String> list){
        list.removeIf(next -> ! next.startsWith("A"));
//        for (Iterator<String> iterator = list.iterator();iterator.hasNext();){
//            String next = iterator.next();
//            if(! next.startsWith("A")){
//                iterator.remove();
//            }
//        }
        return list;
    }

    public static <T> List<T> mapToList(T...st){
        List<T> list=new ArrayList<>();
        for(T t:st){
            list.add(t);
        }
        return list;
    }
    public List<String> dataProcessing (List<String> list){
        for (int k=0;k<list.size();k++){
            for (int i=0;i<list.size()-k-1;i++){
                if (list.get(i).length()>list.get(i+1).length()){
                String str = list.get(i+1);
                list.set(i+1,list.get(i));
                list.set(i,str);
                }
            }
            list.set(list.size()-1-k,list.get(list.size()-1-k)+list.get(list.size()-1-k).length());
        }
        return list;
    }
    public <T> List<T> deduplicate(List<T> list){
        HashSet<T> set=new HashSet<>(list);
        return new ArrayList<>(set);
    }

//    测试数据
//    public static void main(String[] args) {
//        HomeworkThree homeworkThree = new HomeworkThree();
//        List<String> testList = new ArrayList<>();
//        testList.add("A1234");
//        testList.add("A1");
//        testList.add("12");
//        testList.add("A1");
//        testList.add("1");
//        System.out.println(startWithA(testList));
//        System.out.println(dataProcessing(testList));
//        System.out.println(deduplicate(testList));
//        System.out.println(mapToList("a","b","c",5));
//    }
}