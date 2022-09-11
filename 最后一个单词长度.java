package jax;

public class 最后一个单词长度 {
	
	 public int lengthOfLastWord(String s) {

	        int record=0;
	        int res=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)==' '){
	             record=0;
	            
	                if(record==0){
	                  
	                    continue;}
	                }  
	        
	            else{
	                record++;
	    
	                res=record;
	            }
	        }
	        return res;
	    }
	}

