package inheritance;
class Abc{
	int a;
	int b;
void display(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println("Addition is:"+(a+b
			));
	
}
}
public class Thiswithvariable {
      public static void main(String[] args) {
    	  Abc a1 = new Abc();
    	  a1.display(12,3);
    	  }
     
}
