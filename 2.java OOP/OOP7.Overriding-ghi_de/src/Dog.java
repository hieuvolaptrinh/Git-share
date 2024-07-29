
public class Dog  extends animal{

	public Dog() {
		super("Dog");
	}

//	@Override là ghi đè đó
	public void makeSound() {
		System.out.println("gâu gâu");
	}

	@Override
	public void eat() {
		System.out.println("xuong xương");
	}
	

}
