
public class animal {
	protected String name;

	public animal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("ăn ăn");
	}

	public void makeSound() {
		System.out.println("...........");
	}

	public void sleep() {
		System.out.println("zzz z z z zz z  z");
	}
}
