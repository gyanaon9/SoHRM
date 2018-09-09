package ArrayCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArryL {

	
	    public static void main(String[] args) {  
	        List<String> l = new ArrayList<String>();  
	        l.add("Mango");  
	        l.add("Banana");  
	        l.add("Chacolate");  
	        l.add("Apple");  
	        System.out.println("Before Reversing");  
	        System.out.println(l);  
	          
	        Collections.reverse(l);  
	        System.out.println("After Reversing");  
	        System.out.println(l);  
	    }  
	}  




