package Oppgave1;
/* Kopiert fra javabrains.io sitt Java 8 Lambda Basics kurs */

public class Person {

	private String firstName;


	public Person(String firstName) {
		this.firstName = firstName;
		
	}

	synchronized public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + "]";
	}
}
