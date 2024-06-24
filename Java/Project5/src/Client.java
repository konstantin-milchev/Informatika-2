
public class Client {

	
	public static void main(String[] args){
		
		Directory directory=new Directory();
		
		File f1=new File("File1");
		File f2=new File("File2");
		File f3=new File("File3");
		File f4=new File("File4");
		
		directory.addFileSystemElement(f1);
		directory.addFileSystemElement(f2);
		directory.addFileSystemElement(f3);
		directory.addFileSystemElement(f4);
		
		directory.removeFileSystemElement(0);
		
		directory.printInformation();
		
	}
	
}
