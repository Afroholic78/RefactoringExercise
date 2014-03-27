package cmput301.animal;

public class Dog extends Pet {

	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void speak() {
		System.out.println("The dog says: Well, well, well... We meet again Master. Will you or will you not throw my ball around?");
	}
}
