package cmput301.animal;

public class Cat extends Pet {

	public Cat(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void speak() {
		System.out.println("The Cat says moooo");
	}
}
