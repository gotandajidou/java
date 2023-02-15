import java.util.Scanner;
public class Helloworld18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("请您输入一个数值类型的值");
        int a=sc.nextInt();
        if(a%2==0){
        System.out.println(a+"该数是偶数");
        }else{
            System.out.println(a+"该数是奇数");
        }


    }
}
