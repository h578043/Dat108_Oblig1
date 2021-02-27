package Oppgave2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;



public class Oppgave2a {

	public static void main (String args[]) {
		
   		List<String> listen = Arrays.asList("10","1","20","110","21","12"); // Dette er en string liste og du må gjøre den til 
   		
       ArrayList<Integer> nyliste = new ArrayList<Integer>(listen.size()) ;
       
       for( String myint : listen) {
    	   nyliste.add(Integer.valueOf(myint));
    	   
       }
       
      Collections.sort(nyliste,(t1,t2)->t1.compareTo(t2));
      System.out.println(nyliste);
    	   
       

   		
   		
   		 
	}
}
	
	
   		     

