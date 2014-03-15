class Map implements Runnable{
	
	/*
	 * Mapper Thread class
	 * override run() to add functionality
	 * 
	 * Constructor passed file to open and
	 */
	
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
		
		int lineNumber = 0;
		String currentLine = null;
		HashMap map = new HashMap();
		
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
	        String[] lineWords = currentLine.split(" "); //Line is now split up into seperate words.
	        
	        //Iterate through lineWords, add lineWords[current index], lineNumber to queue
	        for(int i = 0; i < lineWords.length(); i++){
	        	if(map.get(lineWords[i]) == null)
	        		map.add(lineWords[i], file + "@" + lineNumber);
	        	else
	        		map.add(lineWords[i], lineNumber);
	        }
		}
		synchronized(m){
			m--;
		}
		
	}	
		

	}
}