import java.util.Scanner;
public class Helloworld21 {
    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);
    int number = foo.nextInt();
    switch (number) {
        case 1:
        System.out.println("月曜日");
        break;
        case 2:
        System.out.println("火曜日");
        break;
        case 3:
        System.out.println("水曜日");
        break;
        case 4:
        System.out.println("木曜日");
        break;
        case 5:
        System.out.println("土曜日");
        break;
        case 6:
        System.out.println("日曜日");
        break;
        case 7:
        System.out.println("月曜日");
        break;


    
        default:
        System.out.println("違う");
        break;
    }
    }
    
    
    
    
}
