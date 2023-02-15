public class Helloworld9 {
    public static void main(String[] args) {
        System.out.println(true&true);
        System.out.println(true&false);
        System.out.println(false&false);
        int a=10;
        int b=20;
        int c=30;
        System.out.println(a>b&b>c);
        System.out.println(a<b&b<c);
        System.out.println(a<b&b>c);
        System.out.println(true|true);
        System.out.println(true|false);
        System.out.println(false|false);
        System.out.println(a>b|b>c);
        System.out.println(a<b|b<c);
        System.out.println(a<b|b>c);
        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^false);
        System.out.println(!true);
    }  
}
