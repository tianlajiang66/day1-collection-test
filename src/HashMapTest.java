import java.util.*;
public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 100);
        map.put("Git", 90);
        map.put("MySQL", 80);

        System.out.println("Java=" + map.get("Java"));
        System.out.println("containskey Git" + map.containsKey("Git"));
        map.remove("MySQL");
        System.out.println("remove后" + map);

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println((entry.getKey() + "=" + entry.getValue()));
        }
    }
}
