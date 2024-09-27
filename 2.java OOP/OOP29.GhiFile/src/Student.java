
public class Student {
private String id;
private String name;
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
public Student(String id, String name) {
	super();
	this.id = id;
	this.name = name;
}

}
