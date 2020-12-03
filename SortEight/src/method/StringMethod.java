package method;

public class StringMethod {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "123";
        "abc".concat("123");
        String s = s1.concat("123");
        System.out.println("abc".concat("123"));
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat("123"));
        System.out.println("追加之后的字符串为：" + s);

        s1.indexOf(1);
        System.out.println("获取索引值" + s1.indexOf("b"));

        s1.charAt(1);
        System.out.println("截取一个字符" + s1.charAt(2));//截取一个字符

        s1.substring(0,1);
        System.out.println("截取字符串" + s1.substring(0,1));//截取字符串

        byte b[] = s1.getBytes();
        System.out.println(new String(b));//将字符串变成一个byte数组

        // byte b1[] = new byte[3];
        char b1[] = s1.toCharArray();
        System.out.println(b1[1]);//将字符串变成一个字符数组

        String s3 = " abc ";
        System.out.println(s3);
        System.out.println(s3.trim());//去掉开始和结束的空格

        //根据某个特殊的字符切割字符串
        String s4[] = s1.split("b");
        System.out.println("切割之后的字符串为:");
        for (int i = 0;i < s4.length; i++){
            System.out.println(s4[i]);
        }
    }


}
