package p;

import java.util.Vector;

public class Huffman 
{ 
    public static void main(String[] args) 
    { 
    	HuffmanNode root = null; 
  
        int n = 5; 
        
        Vector <HuffmanNode> q=new Vector <HuffmanNode>();
        
        char[] charArray = { 'e', 't', 'a', 'o', 'i' }; 
        int[] charfreq = { 125,93 , 8, 8, 8}; 
        
        HuffmanNode t1 = new HuffmanNode(); 
        
        for (int i = 0; i < n; i++) 
        { 
            HuffmanNode t = new HuffmanNode(); 
  
            t.c = charArray[i]; 
            t.data = charfreq[i]; 
  
            t.left = null; 
            t.right = null; 
  
            q.add(t); 
            t1.Sort(q);
             
        } 
        for(int i=0;i<q.size();i++)
        {
        	System.out.println("q.c "+q.get(i).c+" q.data "+q.get(i).data);
        }
        
        while (q.size() > 1)
        { 
  
            HuffmanNode x = q.get(0); 
            q.remove(0); 
  
            HuffmanNode y = q.get(0); 
            q.remove(0);
 
            HuffmanNode f = new HuffmanNode(); 
 
            f.data = x.data + y.data; 
            f.c = '*'; 

            f.left = x; 
  
            f.right = y; 
  
            root = f; 

            q.add(f); 
            t1.Sort(q);
        }      
        printCode(root, ""); 
        
    } 
    
    
    public static void printCode(HuffmanNode root, String s) 
    { 
        if (root.left == null && root.right == null && Character.isLetter(root.c))
        { 
            System.out.println(root.c + ":" + s); 
            return; 
        } 
        printCode(root.left, s + "0"); 
        printCode(root.right, s + "1"); 
    }
    
      
    
} 



