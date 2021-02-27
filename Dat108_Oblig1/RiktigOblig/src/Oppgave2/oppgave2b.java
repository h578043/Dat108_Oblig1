package Oppgave2;

import java.util.function.BiFunction;
import java.util.function.Function;


public class oppgave2b{




public static void main (String [] args) {
	//Løsning på alle
	
	int sum =beregn(12,13, summering());
	System.out.println("Summering= "+sum);
	
	int sum1=beregn(12,13,differanse());
	System.out.println(  "Differanse= "+ sum1);
	
	int sum2 =beregn(12,13,avstand());
	System.out.println("Avstand= "+sum2);
	
	 
}


public static int beregn(int a, int b, BiFunction<Integer,Integer,Integer> regning) { // denne metoden allerede vet at den
	
	
	
	// TODO Auto-generated method stub
	return regning.apply(a, b);
}

 


public static  BiFunction<Integer,Integer,Integer> summering(){
			  BiFunction <Integer,Integer,Integer> summer= (s,t)->s+t;
			return summer;
			
}

public static  BiFunction<Integer,Integer,Integer> differanse(){
				BiFunction <Integer,Integer,Integer> diff = (s,t)->t-s;
				return diff;
				
				
			
}
public static BiFunction<Integer,Integer,Integer> avstand(){
				BiFunction <Integer,Integer,Integer> størst = (s,t)->Math.abs(s-t);
				return størst;
}
			
				
		

}





	  
	 
	
	  
		

		
	
		
	

	
	
	
	
	
	
	
		
	



	

		

		
	     
	    	     
	     
	     
	
	

	
	

	


