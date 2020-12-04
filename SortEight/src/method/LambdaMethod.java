package method;

import bean.User;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaMethod {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("abc");
        list1.add("123");
        //list = () -> System.out.println(list1);
        //使用lamda表达式以及函数操作
        list1.forEach(String -> System.out.println("1" +list1));
        //在java8中使用双冒号操作符
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

        //foreach遍历Map
        map1.forEach((key,value) -> {
            System.out.println("key:" + key + "value:" + value);
        });
        Map<String,List<User>> groupByAge =
                userList.stream().collect(Collectors.groupingBy(User :: getAge));
        for (Map.Entry<String, List<User>> entry : groupByAge.entrySet()) {
            String age = entry.getKey();
            List<User> userList1 = entry.getValue();
            System.out.println("过滤中（按照年龄分组）：" + age + userList1);
        }

        //在多线程中使用Lambda表达式
        System.out.print("多线程中使用：");
        new Thread(()-> {
            System.out.println("创建新线程");
        }).start();

        //自定义Lambda表达式
        System.out.println("自定义Lambda表达式：");
        MathOperator add = (x,y) -> x + y;
        calc(3,5,add);

    }
    //自定义Lambda表达式
    public static void calc(int a,int b, MathOperator operator){
        System.out.println("自定义Lambda结果：" + operator.operator(3,4));
    }
    interface MathOperator{
        int operator(int a, int b);
    }
}
