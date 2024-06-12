package Week3.Assignment;

import java.util.Iterator;

public class ReverseOddWords {
	
	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		String[] split = test.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			if(i%2!=0)
			{
				split[i]=new StringBuilder(split[i]).reverse().toString();
			}
			
		}
		
		System.out.println(String.join(" ", split));
	}}
		