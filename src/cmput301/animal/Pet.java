package cmput301.animal;

public class Pet {

	protected String name;
	protected int age;

	public Pet() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void breathe() {
		System.out.println("Lung Breathes");
	}

}