package Instance;

/**
 * 简单实用，推荐实用！饿汉式
 * 唯一缺点：不管用到与否类装载时就完成实例化
 * Class.forName("")
 */
public class Singleton {
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {};

    public static Singleton getInstance(){
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Singleton m1 = Singleton.getInstance();
        Singleton m2 = Singleton.getInstance();
        System.out.println(m1 == m2);
    }
}
