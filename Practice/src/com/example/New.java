package com.example;

public class New {
	 public String mergeAlternately(String word1, String word2) {
	        StringBuilder sb=new StringBuilder();
	        int i=0;
	        int j=0;
	        int k=0;
	        while(i!=word1.length() && j!=word2.length()){
	            if(k%2==0){
	                sb.append(word1.charAt(i++));
	                k++;
	            }
	            else{
	                sb.append(word2.charAt(j++));
	                k++;
	            }
	        }
	        while(i!=word1.length()) sb.append(word1.charAt(i++));
	        
	        while(j!=word2.length()) sb.append(word2.charAt(j++));
	        
	        return sb.toString();
	    }

	public static void main(String[] args) {
		
		String s1 = "HI";
		String s2 = "Bye";
		 
		New n = new New();
		
		String s3 = n.mergeAlternately(s1, s2);
		
		System.out.println(s3);
	}
	
}
