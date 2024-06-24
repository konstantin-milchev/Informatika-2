import java.util.ArrayList;


public class Directory extends FileSystemElement{

	
	private ArrayList<FileSystemElement> list;
	
	
	public Directory(){
		
		this.list=new ArrayList<FileSystemElement>();
	}
	
	public void printInformation(){
		
		for(FileSystemElement f: list)
			f.printInformation();
	}
	
	public void removeFileSystemElement(int index){
		
		list.remove(index);
	}
	
	public void addFileSystemElement(FileSystemElement f){
		
		list.add(f);
	}
}
