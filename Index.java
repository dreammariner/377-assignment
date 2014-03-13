//Dan Gereb
//Michael Herbert 

import java.util.concurrent.Semaphore; //using Semaphore

/*
 * str.replaceAll("[^A-Za-z0-9 ]").toLowerCase()
 * Convert all words to lowercase while ignoring non-alphanumeric characters
*/

public class Index {
	public int m = 0; //shared counter variable m
	public Semaphore sem = new Semaphore(1);
	
	public static void main(String[] args){
		
		int numOfReducer = Integer.parseInt(args[0]); //first command-line parameter
		int numOfMapper = Integer.parseInt(args.length - 1); //number of command-line parameters, ignoring the first

		for(int i = 1; i < numOfMapper; i++){
			//Map thread open file at args[i]
			//str.replaceAll("[^A-Za-z0-9 ]").toLowerCase() //Convert all words to lowercase while ignoring non-alphanumeric characters
		}
		
	}
}
