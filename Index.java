//Dan Gereb
//Michael Herbert 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Semaphore; //using Semaphore

/*
 * str.replaceAll("[^A-Za-z0-9 ]").toLowerCase()
 * Convert all words to lowercase while ignoring non-alphanumeric characters
*/

public class Index {
	public int m = 0; //shared counter variable m
	public Semaphore sem = new Semaphore(1);
	public void readFile(String file){
		int lineNumber=0;
		String currentLine=null;
		try  
		{  
		FileReader fr = new FileReader(file);  
		BufferedReader myReader = new BufferedReader(fr);
		}
		catch(IOException e){System.out.println("IO Exception!");}
		while (myReader.readLine() != null) {
			lineNumber++;
	        currentLine=myRead.readLine();
	        currentLine.replaceAll("[^A-Za-z0-9 ]").toLowerCase();
	        String[] lineWords=currentLine.split(" ");
	        /*
	         * Line is now split up into seperate words.
	         */

		}
	}
	
	public static void main(String[] args){
		
		int numOfReducer = Integer.parseInt(args[0]); //first command-line parameter
		int numOfMapper = Integer.parseInt(args.length - 1); //number of command-line parameters, ignoring the first

		for(int i = 1; i < numOfMapper; i++){
			//Map thread open file at args[i]
			//str.replaceAll("[^A-Za-z0-9 ]").toLowerCase() //Convert all words to lowercase while ignoring non-alphanumeric characters
		}
		
	}
}
