package day15;
class Animal{
	void eat() {
		System.out.println("Animal is eating.....");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog is barking");
	}
}

class Cat extends Animal {
	void meow(){
		System.out.println("Cat is meowing ");
	}
}
public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		
		Cat c=new Cat();
		c.eat();
		c.meow();
		
		Dog d=new Dog();
		d.eat();
		d.bark();
	}
}
