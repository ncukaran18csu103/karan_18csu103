import java.util.*;

class Distances 
{ 
	
static double distance(int x1, int y1, int x2, int y2) 
{ 
	 
	return Math.sqrt(Math.pow(x2 - x1, 2) + 
				Math.pow(y2 - y1, 2) * 1.0); 
} 
	 
	public static void main (String[] args) 
	{ 
		System.out.println(Math.round(distance(3, 20, 4, 30)*100000.0)/100000.0); 
	} 
} 

