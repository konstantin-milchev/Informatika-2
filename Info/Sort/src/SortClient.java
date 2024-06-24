
public class SortClient {
	
	public static void main(){
		
		int [] elements=new int[3];
		elements[0]=0;
		elements[1]=1;
		elements[2]=2;
		Contex contex=new Contex(elements);
		Policy policy=new Policy(contex);
		
		policy.configure(true, false);
		contex.sort();
	}

}
