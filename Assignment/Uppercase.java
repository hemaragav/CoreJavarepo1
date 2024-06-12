package Week3.Assignment;

import java.util.Iterator;

public class Uppercase {

	public static void main(String[] args) {
	
		String test = "changeme";
		 StringBuilder result = new StringBuilder(test.length());
	        for (int i = 0; i < test.length(); i++) {
	            char ch = test.charAt(i);
	            if (i % 2 != 0) {
	                result.append(Character.toUpperCase(ch));
	            } else {
	                result.append(ch);
	            }
	        }
	        System.out.println(result.toString());
	    }}