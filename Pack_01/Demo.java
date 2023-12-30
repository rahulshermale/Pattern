package Pack_01;

class Animal {

	 void disp() {
		System.out.println("Animal");
	}

}

class Dog extends Animal {

	 void disp() {
		System.out.println("Dog");
	}

}

class Cat {
	 void run() {
		System.out.println("Dog");
	}
}

public class Demo extends Dog {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.disp();

		Cat c = new Cat();
		c.run();

	}

}
