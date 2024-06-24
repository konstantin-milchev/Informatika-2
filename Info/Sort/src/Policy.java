
public class Policy {
	
	private Boolean timeIsImportant;
	
	private Boolean spaceIsImportant;
	
	private Contex ArraySorter;
	
	public Policy(Contex a){
		this.ArraySorter=a;
	}
	
	public void configure(Boolean a,Boolean b){
		
		this.timeIsImportant=a;
		this.spaceIsImportant=b;
		
		if((timeIsImportant)&&(spaceIsImportant))
			ArraySorter.SetSortAlgorithm(new MergeSort(ArraySorter));
		
		
		if((timeIsImportant)&&(!spaceIsImportant))
			ArraySorter.SetSortAlgorithm(new QuickSort(ArraySorter));
	}
	
	

}
