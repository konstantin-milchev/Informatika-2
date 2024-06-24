
public class File extends FileSystemElement{
	
	private String info;
	
	public File(String str){
		
		this.info=new String();
		this.info=str;
	}
	
	
	public void printInformation(){
		
		System.out.print(info + " ");
		
	}

}
