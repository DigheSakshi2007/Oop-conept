package inheritance;
class Animal{
	String Animalname;
	String Animalcolor="White";
	String Animalstructure;
	String Animalfood="Omnivores";
	String Animalhabitat="anywhere";
	void Display() {
		System.out.println("The animal name "+Animalname);
		System.out.println("The animal color is : "+Animalcolor);
		System.out.println("The animal structure "+Animalstructure);
		System.out.println("The animal food is : "+Animalfood);
		System.out.println("The animal habitat is : "+Animalhabitat);
}
}
class Aquatic extends Animal{
	void Display1() {
		System.out.println("Animal that live in water ");
}
}
class Aerial extends Animal{
	void Display2() {
	System.out.println("Animal that live in air");
	}
}
class Terrestrial extends Animal{
	void Display3() {
	System.out.println("Animal that live in land ");
	}
}
class Reptiles extends Animal{
	void Display4() {
	System.out.println("Animal that live in water and land ");
	}
}
class Tiger  extends Terrestrial{
	}
class Fish extends Aquatic{
	}
class Parrot extends Aerial{
	}
class Snacks extends Reptiles{
	}
public class Public {
	public static void main(String[] args) {
     Tiger t1 = new Tiger();
     t1.Display();
     t1.Display3();
     System.out.println(" ");
     Fish f1 = new Fish();
     f1.Display();
     f1.Display1();
     System.out.println(" ");
     Parrot p1 = new Parrot();
     p1.Display();
     p1.Display2();
     System.out.println(" ");
     Snacks s1 = new Snacks();
     s1.Display();
     s1.Display4();
     System.out.println(" ");
     }    
}
