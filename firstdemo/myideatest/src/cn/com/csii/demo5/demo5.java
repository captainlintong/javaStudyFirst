package cn.com.csii.demo5;

public class demo5 {
    public static void main(String[] args) {
        System.out.println(10 / 3);
        System.out.println(10 / 2);
        System.out.println(10.0 / 3);
        System.out.println(10 / 3.0);

        System.out.println("'------------------------------'");

        int a = 1;
        char b = 'a';
        System.out.println(a + b); // 98

        int c = 12;
        c++;
        System.out.println(c);

        int d = 12;
        ++d;
        System.out.println(d);




    }
}
/**
 * 运算符
 *
 * 整数相除只能得到整数，如果想要得到小数，必须加入小数（浮点类型）的运算
 *
 * 字符的"+"操作
 *
 * ASCII码表 American Standard Code Information Interchange 美国信息交换标准代码
 * 'a' 97
 * 'A' 65
 * '0' 48
 *
 * char 提升为 int 就是查码表中 字符所对应的数值
 *
 * 字符串的"+"操作  和js一样
 *
 * 自增自减运算符  只能操作变量； ++ --  （和js一样）var b = a++ ; ++ 在前 先自增在赋值， ++ 在后先赋值在自增； 独自使用a++时 ++a，没有区别
 */
