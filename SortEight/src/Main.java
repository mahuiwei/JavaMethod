import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Map<String,String> map = new HashMap<String,String>();
        ConcurrentHashMap<String,String> map2 = new ConcurrentHashMap();

        List<String> list = new ArrayList<String>();
        list = Collections.emptyList();
        System.out.println("list" + list);
    }
}
