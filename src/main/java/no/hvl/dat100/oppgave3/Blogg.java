package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	
	private Innlegg[] innleggsTabell;
	private int nesteLedig;

	public Blogg() {
		innleggsTabell = new Innlegg[20];
		nesteLedig = 0;
	}

	public Blogg(int lengde) {
		innleggsTabell = new Innlegg[lengde];
		nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggsTabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
			if (innleggsTabell[i].erLik(innlegg)){
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		return nesteLedig < innleggsTabell.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (finnInnlegg(innlegg) == -1 && ledigPlass()) {
			innleggsTabell[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		}
		return false;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nesteLedig).append("\n");
		
		for (int i = 0; i < nesteLedig; i++) {
			sb.append(innleggsTabell[i].toString());
			if (i < nesteLedig-1) {
				sb.append("\n");
			}
		}
		return sb.toString();
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}