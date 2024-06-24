

public class Client {
	
	public static void main(String[] args) {

		Group group = new Group();
		
		Line line1 = new Line();
		Line line2 = new Line();
		Oval oval1 = new Oval();
		Rectangle rect1 = new Rectangle();
		
		Rectangle rect2 = new Rectangle();

		group.addGraphic(line1);
		group.addGraphic(oval1);
		group.addGraphic(rect1);
		group.addGraphic(rect2);
		group.removeGraphic(rect2);
		
		group.draw();
		
		rect2.draw();
	}

}
