public class Oval extends Shape {

	private String color = "no";

	public Oval(String color) {
		super();
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("I draw Oval with " + color + " color.");
	}
}
