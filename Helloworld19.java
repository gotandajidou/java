import java.util.Scanner;
public class Helloworld19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("何曜日");
        int number=sc.nextInt();
        if(number==１){
        System.out.println("月曜日");
        }else if(number==2){
            System.out.println("火曜日");
        }else if(number==3){
            System.out.println("水曜日");
        }else if(number==4){
            System.out.println("木曜日");
        }else if(number==5){
            System.out.println("金曜日");
        }else if(number==6){
            System.out.println("土曜日");
        }else if(number==7){
            System.out.println("日曜日");
        }else{
            System.out.println("違う");
        }





    }
}
