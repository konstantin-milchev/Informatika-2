
public class Line extends Shape {

	private String color;
	   
	   public Line(String color){
		   
		   this.color=color;
	   }
	   
	   public void draw(){
			
			System.out.print("I draw" + color + "Line");
		}
}
