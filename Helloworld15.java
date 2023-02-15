import java.util.Scanner;
public class Helloworld15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("请您输入一个数值类型的值");
        int a=sc.nextInt();
        System.out.println("请您输入第二个个数值类型的值");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("您输入a+b的值=c:"+c);


    }
}
