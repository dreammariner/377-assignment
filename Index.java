//Dan Gereb
//Michael Herbert 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Semaphore; //using Semaphore


public class Index {
	
	public int m = 0; //shared counter variable m
	public Semaphore sem = new Semaphore(1);
	
	
	public void readFile(String file){
		int lineNumber = 0;
		String currentLine = null;
		
		try  
		{  
			FileReader fr = new FileReader(file);  
			BufferedReader myReader = new BufferedReader(fr);
		}
		catch(IOException e){
			System.out.println("IO Exception!");
		}
		while (myReader.readLine() != null) {
			lineNumber++;
	        currentLine = myReader.readLine();
	        currentLine.replaceAll("[^A-Za-z0-9 ]").toLowerCase();
	        String[] lineWords = currentLine.split(" ");
	        /*
	         * Line is now split up into seperate words.
	         */
	        //Iterate through lineWords, add lineWords[current index], lineNumber to queue
		}
	}
	/*
	 * Mapper Thread class
	 * override run() to add functionality
	 * 
	 * Constructor passed file to open and
	 */
	class Map implements Runnable{
		
		private final String file;
		private final int SIZE = 10; //size of bounded buffer
		
		public Map(String file){
			this.file = file;
			
		}
		/*	OVERRIDE METHOD
		 * 
		 */
		public void run(){ 
			synchronized(m){
				m++;
			}
			
			
			synchronized(m){
				m--;
			}
		}
	}
	/*
	 * Reduce Thread class
	 * override run() to add reducer functionality
	 * 
	 * Constructor passed
	 */
	class Reduce implements Runnable{
		public Reduce(){
			
		}
		
		/*	OVERRIDE METHOD
		 * if m = 0 && boundedBuffer.empty() then Reduce thread print out inverted index
		 */
		public void run(){ 

		}
	}
	
	public static void main(String[] args){
		
		int numOfReducer = Integer.parseInt(args[0]); //first command-line parameter
		int numOfMapper = Integer.parseInt(args.length - 1); //number of command-line parameters, ignoring the first
		//using a LinkedList as our BoundedBuffer
		for(int i = 1; i < numOfMapper; i++){
			Thread mapThread = new Thread(new Map(args[i]));

		}
		for(int i = 0; i < numOfReducer; i++){
			Thread reduceThread = new Thread(new Reduce());
		}
		
				
	}
}
