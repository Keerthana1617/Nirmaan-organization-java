package Day13;

class Animal{
	public void makeSound() {
		System.out.println("This animal makes a Sound");
		
	}

}
class Dog extends Animal{

	public void makeSound() {
		System.out.println("The Dog Barks");
		
	}
}


class Cat extends Animal{
	
	public void makeSound() {
		System.out.println("The cat Meows");
		
	}
}


public class Inheritance {

	public static void main(String args[]) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.makeSound();
		cat.makeSound();
	}
}



