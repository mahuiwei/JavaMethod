package sort;

import bean.User;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Map<String,String> map = new HashMap<String,String>();
        ConcurrentHashMap<String,String> map2 = new ConcurrentHashMap();

        List<String> list = new ArrayList<String>();
        list = Collections.emptyList();
        System.out.println("list" + list);

        Object o = new Object();

       // Iterator<String> iterator


        List<String> list1 = new ArrayList<String>();
        list1.add("abc");
        list1.add("123");
         //list = () -> System.out.println(list1);
        list1.forEach(String -> System.out.println("1" +list1));
        list1.forEach(System.out::println);
        System.out.println(list1);

        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext() == true){
            //iterator.remove();
            if (iterator.next() == "abc"){
                iterator.remove();
            }
            System.out.println("迭代器" + iterator.next());
        }

        List<User> userList = new ArrayList<User>();
        Map<String,List<User>> map1 = new HashMap<String,List<User>>();

        User user = new User();
        user.setAge("13");
        user.setId("1");
        user.setName("mahuiwei");
        user.setSex("女");
        userList.add(user);
        User user1 = new User();
        user1.setAge("13");
        user1.setId("2");
        user1.setName("weizhongxue");
        user1.setSex("女");
        userList.add(user1);

        User user2 = new User();
        user2.setAge("14");
        user2.setId("2");
        user2.setName("weizhongxue");
        user2.setSex("女");
        userList.add(user2);

        map1.put("1",userList);

        Map<String,List<User>> groupByAge =
                userList.stream().collect(Collectors.groupingBy(User :: getAge));
        for (Map.Entry<String, List<User>> entry : groupByAge.entrySet()) {
            String age = entry.getKey();
            List<User> userList1 = entry.getValue();
            System.out.println("过滤中：" + age + userList1);
        }

    }
}
