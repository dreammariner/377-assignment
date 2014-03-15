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
		
		
		synchronized(m){
			m--;
		}
	}
}