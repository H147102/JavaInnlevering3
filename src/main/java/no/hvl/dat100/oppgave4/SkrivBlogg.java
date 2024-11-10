package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		String filsti = mappe+File.separator+filnavn;
		
		try(PrintWriter writer = new PrintWriter(new File(filsti))) {
			writer.print(samling.toString());
			return true;
		} catch (FileNotFoundException e) {
			System.err.println("Feil ved skriving til fil:"+ e.getMessage());
			return false;
		}
	}
}
