public class Helloworld27 {
    public static void main(String[] args) {
          // 折叠次数
	  int count=0;
	  // 珠穆拉玛峰高度（毫米）
	  int qomolangma=8844430;
	  // 纸张的厚度
	  double page=0.1;
	  while(page<=qomolangma){
	    page*=2;
		count++;
	  }
	  System.out.println("需要折叠:"+count+"次");	
    }
}
