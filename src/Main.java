
public class Main {

	public static void main(String [] args) {
		
		
	}
	
	public static int userCompare(String aName, int aId, String bName, int bId) {
		  
		int order = aName.compareTo(bName);
		if(order < 0) return -1;
		else if(order > 0) return 1;
		else {
			if(aId < bId) return -1;
			else if(aId > bId) return 1;
			else return 0;
			
		}
		
	}
	
}
