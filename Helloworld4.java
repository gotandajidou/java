public class Helloworld4 {
    public static void main(String[] args) {
        int a=20;
        char c='B';//'a'底层数值类型97，'A'底层数值类型65.
        System.out.println(a+c);
        short s=20;
        byte b=1;
        int j=c+s+b;
        System.out.println(j);
        double j2=89.99+s+c;
        System.out.println(j2);
    }
}
