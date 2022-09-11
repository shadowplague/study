package jax;

public class 回文数 {
	 public boolean isPalindrome(int x) {
		   if(x==0){return true;}
		        else if(x<0){
		    return false;
		        }
		       else{int a=0,b,n=x;
		            while(n!=0){
		               
		            a=a*10+n%10;
		           n=n/10;}
		               if(x==a){return true;}
		               else{return false;}}

}}
