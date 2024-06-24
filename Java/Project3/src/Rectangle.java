
public class Rectangle extends Shape{

	private String color;
	   
	   public Rectangle(String color){
		   
		   this.color=color;
	   }
	   
	   public void draw(){
			
			System.out.print("I draw" + color + "Rectangle");
		}
}
