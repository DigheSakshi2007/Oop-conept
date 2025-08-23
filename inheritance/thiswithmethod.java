package inheritance;
class Answer{
	int a=13;
	int b=7; 
	void add() {
		this.sub();
		System.out.println("addition is:"+(a+b));
		
		}
	void sub() {
		this.multiplay();
		System.out.println("substraction is:"+(a-b));
		
		}
	void multiplay() {
		this.division();
		System.out.println("multipliation is:"+(a*b));
		
		}
	void division() {
		this.moduls();
		System.out.println("division is:"+(a/b));
		
		}
	void moduls() {
		System.out.println("moduls is:"+(a+b));
		
		}
}
public class Thiswithmethod {
public static void main(String[] args) {
	Answer a1 = new Answer();
    a1.add();
}
}
