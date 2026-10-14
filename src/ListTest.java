import java.util.*;
public class ListTest {
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Git");
        arrayList.add("MySQL");

        List<String> linkList = new LinkedList<>();
        linkList.add("Java");
        linkList.add("Git");
        linkList.add("MySQL");

        //三种遍历方式
        for(int i=0;i< arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }

        for (String s :arrayList){
            System.out.println(s);
        }

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext())
        {
            String s= iterator.next();
            System.out.println(s);
        }
        int n =100000;

        List<Integer> al = new ArrayList<>();
        long start = System.nanoTime();
        for(int i=0;i<n;i++){
            al.add(0,i);
        }
        long end=System.nanoTime();
        System.out.println("ArrayList 头部插入"+n+"次："+(end-start)/1000000+"ms");

        List<Integer> ll = new LinkedList<>();
        start=System.nanoTime();
        for(int i=0;i<n;i++){
            ll.add(0,i);
        }
        end=System.nanoTime();
        System.out.println("LinkedList 头部插入"+n+"次："+(end-start)/1000000+"ms");
    }
}
