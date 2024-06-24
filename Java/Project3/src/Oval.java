
public class Oval extends Shape {

   private String color;
   
   public Oval(String color){
	   
	   this.color=color;
   }
   
   public void draw(){
		
		System.out.print("I draw" + color + "Oval");
	}
}
