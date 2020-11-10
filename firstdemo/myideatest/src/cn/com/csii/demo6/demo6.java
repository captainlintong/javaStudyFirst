package cn.com.csii.demo6;
import java.util.Scanner;
public class demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ge = num % 10;
        System.out.println(ge);
        int shi = num / 10 % 10;
        System.out.println(shi);
        int bai = num / 100;
        System.out.println(bai);
    }
}
