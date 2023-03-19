package p;

import java.util.Vector;

class HuffmanNode { 
	  
    int data; 
    char c; 
  
    HuffmanNode left; 
    HuffmanNode right; 
    
    
    
    public void Sort(Vector<HuffmanNode> v) 
	{ 
    	HuffmanNode temp=new HuffmanNode();
		int i, j;
		boolean swapped; 
		for (i = 0; i < v.size() - 1; i++)  
		{ 
			swapped = false; 
			for (j = 0; j <  v.size() - i - 1; j++)  
			{ 
				if (v.get(j).data > v.get(j+1).data)  
				{ 
					temp = v.get(j); 
					v.set(j,v.get(j+1));
					v.set(j+1,temp);
					swapped = true; 	
				} 
			} 
			if (swapped == false)
			{
				break;
			} 
		} 
	}
    
    
    
    
    
} 
  
