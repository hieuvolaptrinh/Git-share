
public class Cat extends animal {

	public Cat() {
		super("cat");
	}

	public void makeSound() {
		System.out.println("meo");
	}

	@Override
	public void eat() {
		System.out.println("CÁ CÁ");
	}

}
