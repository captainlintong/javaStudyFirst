package cn.com.csii.demo4;

public class demo4 {
    public static void main(String[] args) {
        int a = 10; // int 4个字节
        double b = a; // double 8个字节
        System.out.println(b);
        System.out.println(a);

        byte c = 10; // byte 1个字节
        byte d = 20;
        int e = c + d;

        System.out.println(e);

       // byte f = a; // java: 不兼容的类型: 从int转换到byte可能会有损失
       // System.out.println(f);

        byte f = (byte)a; // 强制转换 格式 '目标数据类 变量名 = （目标数据类型）值或者变量名'
        System.out.println(f);

        byte g = 3 +4;
        System.out.println(g);
    }

}
/**
 *类型转换
 * 一、隐式转换：1\将数据类型中，取值范围小的数据，给取值范围大的类型赋值，可以直接赋值。
 * 2、byte short char 三种数据在进行运算的时候，不管是否有更高的数据类型，都会提升为int，然后在进行运算
 *
 * 二、强制转换 有可能会发生精度损失
 * 1、把一个表示数据范围大的数值或者变量赋值给另一个数据范围小的变量
 *
 *
 * 三、java存在常量优化机制
 * byte g = 3 +4; java存在常量优化机制 会在编译的时候让3和4 进行相加，然后自动判断7是否在byte的取值范围
 * 不在范围：编译出错
 * 在范围： 通过编译
 */