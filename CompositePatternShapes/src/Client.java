public class Client {

	public static void main(String[] args) {

		Group group = new Group();

		Line line1 = new Line();
		Oval oval1 = new Oval("red");
		Text text1 = new Text();
		Rectangle rect1 = new Rectangle("green");

		// ------
		Group group2 = new Group();

		Line line2 = new Line();
		Oval oval2 = new Oval("yellow");
		Text text2 = new Text();

		group2.addGraphic(line2);
		group2.addGraphic(oval2);
		group2.addGraphic(text2);
		// ------

		group.addGraphic(line1);
		group.addGraphic(rect1);
		group.addGraphic(oval1);
		group.addGraphic(text1);
		group.addGraphic(group2);

		// -----
		group.draw();
	}

}
