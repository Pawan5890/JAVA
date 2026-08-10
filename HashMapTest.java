
import java.util.*;


public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> cls = new HashMap<>();
        cls.put(1, "Rahul" );
        cls.put(2, "Rohit");
        cls.put(3, "Ramesh");

        Map<Integer, String> cls2 = new HashMap<>();
        cls2.put(4, "Rakesh");
        cls2.put(5, "Rohit");
        cls.putAll(cls2);
        System.out.println(cls);
        System.out.print(cls.get(2));
        System.out.print(cls.getOrDefault(6, "Not Found"));
        cls.remove(3);
        System.out.println(cls);
        System.out.println(cls.containsValue("Rohit"));

    }
    
}
