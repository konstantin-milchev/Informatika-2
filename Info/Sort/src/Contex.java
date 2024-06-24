
public class Contex {
	
	public int[] elements;
	
	public SortStrategy sortStrategy;
	
	public Contex(int[] e){
		
		this.elements=e;
	}
	
	public void SetSortAlgorithm(SortStrategy a){
		
		this.sortStrategy=a;
	}
	
	public void sort(){
		
		sortStrategy.performSort(elements);
	}

}
