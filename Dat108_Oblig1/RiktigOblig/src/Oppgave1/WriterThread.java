package Oppgave1;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Semaphore;



/**
 * Klasse for � definere skrive-prosess.
 * 
 * @author Atle Geitung
 */
public class WriterThread extends Thread {

    private Tall tall;
    private Semaphore writer;
    private Integer nr;
	private Person p;
	private Liste L;

    /**
     * Lager en ny Reader.
     * 
     * @param tall delt ressurs som skal leses
     * @param writer
     */
    public WriterThread(Tall tall, Semaphore writer, Integer nr, Person p, Liste L) {
        this.tall = tall;
        this.writer = writer;
        this.nr = nr;
        this.p=p;
        this.L=L;
      
       
       
       
        
    }

   

	@Override
    public void run() {
        while (true) {
            // vent p� � g� inn i kritisk region
            try {
                writer.acquire();
            } catch (InterruptedException e) {
            }

            // Skriver den delte ressursen
            tall.inkrement();
        	System.out.println("F�r endring: " + p.getFirstName());
        	
            p.setFirstName(L.getFnavn());
           
 
    		System.out.println("Etter endring " + p.getFirstName());

            // forlater kritisk region
            writer.release();
            
            try {
                sleep(5);
            } catch (InterruptedException e) {
            }
        }
    }

}
