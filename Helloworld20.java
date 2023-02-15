import java.util.Scanner;
public class Helloworld20 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
    System.out.println("请输入成绩:");	
    // 获取到键盘录入的数据
    int result=sc.nextInt();
    if(result>90&&result<=100){
	   System.out.println("成绩为优秀");	
	}else if(result>=80&&result<=90){
	   System.out.println("成绩为良");		
	}else if(result>=70&&result<80){
	   System.out.println("成绩为中等");		
	}else if(result>=60&&result<70){
	   System.out.println("成绩为及格");		
	}else {
	   System.out.println("成绩为不及格");		
	}

    }
}
