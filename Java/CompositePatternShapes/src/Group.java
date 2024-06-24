import java.util.ArrayList;


public class Group extends Shape{
	
	protected ArrayList<Shape> shapes = new ArrayList<Shape>();

	public void addGraphic(Shape graphic) {
		shapes.add(graphic);
	}

	public void removeGraphic(Shape graphic) {
		shapes.remove(graphic);
	}

	public void draw(){
		System.out.println("Drawing elements of group");
		for(Shape graphic : shapes)
			graphic.draw();
		System.out.println("Finished drawing elements of group");
	}
}
