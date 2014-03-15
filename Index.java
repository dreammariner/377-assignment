//Dan Gereb
//Michael Herbert 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Semaphore; //using Semaphore


public class Index {
	
	public int m = 0; //shared counter variable m
	public Semaphore sem = new Semaphore(1);
	

	public static void main(String[] args){
		
		int numOfReducer = Integer.parseInt(args[0]); //first command-line parameter
		int numOfMapper = Integer.parseInt(args.length - 1); //number of command-line parameters, ignoring the first
		//using a LinkedList as our BoundedBuffer
		for(int i = 1; i < numOfMapper; i++){
			Thread mapThread = new Thread(new Map(args[i])); //new thread, passing in file names
		}
		
		for(int i = 0; i < numOfReducer; i++){
			Thread reduceThread = new Thread(new Reduce());
		}
		
				
	}
}