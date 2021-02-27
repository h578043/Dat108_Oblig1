package Oppgave;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import Oppgave.Ansatt.Kjonn;



public class main {

	
 public static void main(String [] args) {
	 
	 List<Ansatt> ansatte = Arrays.asList(
				new Ansatt("Charles", "Dickens",Kjonn.MANN,"Miljøarbeider",440000),
				new Ansatt("Mahamed","Siidi", Kjonn.MANN,"kundeservice",340000),
				new Ansatt("Julie","Sørensen",Kjonn.KVINNE,"Terapeaut",450000),
				new Ansatt("Ashkir","Siidi",Kjonn.MANN,"Trapstar",1000000),
				new Ansatt("Sofia","Mosley",Kjonn.KVINNE,"Massør",300000)
				
				);
	 
	 //Demonstrasjon
	 
	lonnsoppgjor(ansatte,krone());
	//lonnsoppgjor(ansatte,prosent());
	
	 
	
 }
 private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt,Integer> tillegg) {
	 for(Ansatt a :ansatte) {
			System.out.println(a.toString());
			System.out.println("Oppdatert lønn= "+tillegg.apply(a)); //
			
		}
    
	
	 
	 
 }

 
 public static Function<Ansatt, Integer> krone(){
	 
 Function<Ansatt,Integer> kronetillegg=  x-> x.getAarslonn() + (x.getAarslonn()/100)*4;
 
return kronetillegg;

 }
  public static  Function<Ansatt,Integer> prosent(){
 Function<Ansatt,Integer> prosenttilegg=  x-> x.getAarslonn() + (x.getAarslonn()/100)*2;
 return prosenttilegg;
  }
  
  
  
 
  public static void skrivUtAlle(List<Ansatt> ansatte) {
	  for(Ansatt B :ansatte) {
			System.out.println(B);
			
		}
	  
  }
		 
	 
 }
 
 
 
 



