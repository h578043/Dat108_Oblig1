package Oppgave1;

public class Liste {
private String [] liste;
private int index;

public Liste() {
	liste = new String[] {"Thomas","Wonders","Kateson","Freidung","Wilson","David","Steven","Borker","Marisons","Crander"};
	index=0;
}

public String getFnavn() {
	String navn = liste[index%10];
	index++;
	return navn;
}

public void setFnavn(String fnavn) {
	liste[(index-1)%10]=fnavn;
}


}
