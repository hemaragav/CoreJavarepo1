package Week3.Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1";
		
		 String[] words = text.split(" "); 
	        Set<String> uniqueWords = new LinkedHashSet<>();
	        
	        for (String word : words) {
	            uniqueWords.add(word.toLowerCase()); 
	            }
	        
	       System.out.println(String.join(" ", uniqueWords));
	    }
	}


