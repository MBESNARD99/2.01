package exo1;

public class person {

	private int age;
	private boolean minor = true;
	
	public void setAge(int age) {
		this.age = age;
		minor = age < 10;
	}
	public int getAge() {
		return age;
	}
	public boolean isMinor() {
		return minor;
	}
}
