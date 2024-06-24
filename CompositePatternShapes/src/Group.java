import java.util.ArrayList;

public class Group extends Shape {

	private ArrayList<Shape> shapeList = new ArrayList<Shape>();

	public void addGraphic(Shape graphic) {
		shapeList.add(graphic);
	}

	public void removeGraphic(Shape graphic) {
		shapeList.remove(graphic);
	}

	public void draw() {
		System.out.println("Drawing elements of group");
		for (int i = 0; i < shapeList.size(); i++) {
			shapeList.get(i).draw();
		}
		System.out.println("Finished drawing elements of group");
	}
}
