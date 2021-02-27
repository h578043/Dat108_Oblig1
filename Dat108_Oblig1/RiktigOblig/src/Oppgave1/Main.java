package Oppgave1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;


/**
 * Eksempel p� synkronisering. Benytter eksempelet "Readers-Writer".
 * 
 * @author Atle Geitung
 */
public class Main {

    private final static int WRITERS = 5;
    private final static int READERS = 5;

    private static Tall tall = new Tall(0);
    private static Semaphore mutex = new Semaphore(1); // Mutex
    private static Semaphore writer = new Semaphore(WRITERS);

    /**
     * Hide the constructor.
     */
    private Main() {
    }

    /**
     * Applikasjonen.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
    	List<Person> people = Arrays.asList(
				new Person("Charles"),
				new Person("Lewis"),
				new Person("Thomas"),
				new Person("Charlotte"),
				new Person("Matthew")
				);
    	Liste L = new Liste(); 
    	
        Thread[] readerThread = new ReaderThread[READERS];
        Thread[] writerThread = new WriterThread[WRITERS];  
       
           
        
     for (int i = 0; i < WRITERS; i++) {
   writerThread[i] = new WriterThread(tall, writer, i, people.get(0), L );
        writerThread[i].start();
      }
     
      for (int i = 0; i < READERS; i++) {
         readerThread[i] = new ReaderThread(tall, mutex, writer, i);
        readerThread[i].start();
   }

    }

    }
