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