package de.tum.ls1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SQLFileParser {

	public static String[] parseSQLFile(String filename) throws IOException {
		InputStream is = SQLFileParser.class.getResourceAsStream(filename);
		String inputStreamString = new Scanner(is,"UTF-8").useDelimiter("\\A").next();
		is.close();
		
		//begin the sql file parser to separate the sql commands into  
		//separate array entries. This parser requires that your  
		//sql statements be typed in uppercase because that is the   
		//convention of the author.  
		
		//Step 1: Assume that every SQL statement ends with a semi colon  
		String[] stmts = inputStreamString.split(";");  
		
		//Step 2: Put Transactions back into a single statement.  
		for(int i=0;i<stmts.length;i++){  
		    //if the current statement starts a transaction  
		    if(stmts[i].contains("BEGIN")){  
		        int tInt = i;  
		        //find the end of the transaction or the end of the file  
		        //whichever comes first  
		        while(tInt<stmts.length && !stmts[tInt].contains("END")) {  
		            tInt++;  
		        } //end while  
		
		        //add a semicolon to the first sql entry in the transaction  
		        //which will be in the same array entry as the BEGIN  
		        //statement  
		        stmts[i] += ";";  
		
		        //loop through the remaining transaction and place them  
		        //into the transaction start entry appending semicolons  
		        //at the end of each statement  
		        for(int j = (i+1); j< tInt; j++) {  
		            stmts[i] += "\n" + stmts[j] + ";";  
		            //blank out the current transaction entry so that the  
		            //executer skips it  
		            stmts[j] = " ";  
		        } //end for  
		
		        //and the end statement to the end of the transaction  
		        stmts[i] += "\nEND";  
		
		        //remove the END transaction from the statement it is  
		        //currently embedded in  
		        String tStr[] = stmts[tInt].split("END");  
		        stmts[tInt] = tStr[1];  
		        //skip the statements blanked out earlier, actually pointing  
		        //to the last transaction entry so that the for statement  
		        //points to the first statement after the transaction  
		        i = tInt - 1;  
		    } //end if  
		
		} //end for
		
		//end sql file parsers
		return stmts;
	}
	
}

