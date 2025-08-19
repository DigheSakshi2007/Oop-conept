package inheritance;
class Family{
	int familymember=7;
	int familychildernmember=1;
	int familyyoungermember=4;
	int familyoldmember=2;
	int familygirlsmember=4;
	int familyboysmember=3;
void Display() {
		System.out.println("The family member is "+familymember);
		System.out.println("The family childern member is : "+familychildernmember);
		System.out.println("The family younger member is "+familyyoungermember);
		System.out.println("The family old member is : "+familyoldmember);
		System.out.println("The family girls member is : "+familygirlsmember);
		System.out.println("The family boys member is : "+familyboysmember);

}
}
class myfamily extends Family{
	void Display1() {
		System.out.println("It is my family ");
}
}
class friend extends Family{
	void Display2() {
		System.out.println("It is friend family");
	}
}

class family2  extends myfamily{
	}
class family1 extends friend{
	}
public class Demo31 {
	public static void main(String[] args) {
	     family2 f1 = new family2();
	     f1.Display();
	     f1.Display1();
	     System.out.println(" ");
	     family1 f2 = new family1();
	     f2.Display();
	     f2.Display2();
	     System.out.println(" ");
	}     
}
