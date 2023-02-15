public class Helloworld13 {
    public static void main(String[] args) {
        int height1=150;
        int height2=210;
        int height3=165;
        int tempheight= height1>height2?height1:height2;
        int maxHeight =tempheight>height3?tempheight:height3;
        System.out.println(maxHeight);
    }
}
