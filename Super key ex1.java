package inheritance;
class Arithemati{
	int a =10;
	int b= 20;
	int c=30;
	int d=40;
	int e =50;
}
class print extends Arithemati{
	int a=100;
	int b=200;
	int c=300;
	int d=400;
	int e=500;
	void display() {
		System.out.println(this.a);
		System.out.println(super.a + 10);
		System.out.println(this.b);
		System.out.println(super.b - 10);
		System.out.println(this.c);
		System.out.println(super.c * 3 );
		System.out.println(this.d);
		System.out.println(super.d / 2);
		System.out.println(this.e);
		System.out.println(super.e % 2);
}
	}

public class Arithmatic5 {
public static void main(String[] args){
	print p1 = new print();
	p1.display();
}
}


// output

// 100
// 20
// 200
// 10
// 300
// 90
// 400
// 20
// 500
// 0
