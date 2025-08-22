package inheritance;
class shape {
	int radius=3;
	float Pi=3.1415f;
	int height=2;
	int base= 4;
	int a =15;
	void Display() {
		float  circle;
		long triangle;
		long square;
		 circle = Pi*(radius*radius);
		 triangle = (base*height)/2;
		 square = a*a;
		 System.out.println("The area of circle is: "+ circle);
		 System.out.println("The area of triangle is: "+ triangle);
		 System.out.println("The area of square is: "+ square);

	}
	
}
class Circle extends shape {
	void display1() {

	}
}
class Triangle extends shape{
	void display2() {

	}
	}
class Square extends shape{
	void display3() {

	}
}
class shape1 extends Circle{
	
}
class shape2 extends Triangle{
	
}	
class shape3 extends Square{
	
}
public class Shapes {
public static void main(String[] args) {
	shape1 s1 = new shape1();
    s1.Display();
    s1.display1();
    System.out.println(" ");
    shape2 s2 = new shape2();
    s2.Display();
    s2.display2();
    System.out.println(" ");
    shape3 s3 = new shape3();
    s3.Display();
    s3.display3();
    System.out.println(" ");
}
}
