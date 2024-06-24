public class Rectangle extends Shape {

	private String color = "no";

	public Rectangle(String color) {
		super();
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("I draw Rectangle with " + color + " color.");
	}
}
