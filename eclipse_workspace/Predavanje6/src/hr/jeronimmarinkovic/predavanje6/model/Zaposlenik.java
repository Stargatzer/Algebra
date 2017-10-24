package hr.jeronimmarinkovic.predavanje6.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Zaposlenik {
	
	private String ImeZaposlenika,PrezimeZaposlenika;
	private double PlacaZaposlenika;
	private int OznakaZaposlenika;
	private static int NextId = 1000;
	
	public Zaposlenik(String ime,String prezime,double placa){
		this.ImeZaposlenika=ime;
		this.PlacaZaposlenika=placa;
		this.PrezimeZaposlenika=prezime;
		SetID();
	}
	
	public double getPlacaZaposlenika() {
		return PlacaZaposlenika;
	}

	public void setPlacaZaposlenika(double placaZaposlenika) {
		PlacaZaposlenika = placaZaposlenika;
	}

	private void SetID(){
		OznakaZaposlenika=NextId;
		OznakaZaposlenika++;
	}
	
	public static String Najve�i(ArrayList registar){	
		double[] pla�e = new double[registar.size()];
		for (int i = 0; i < pla�e.length; i++) {
			pla�e[i] = ((Zaposlenik) registar.get(i)).getPlacaZaposlenika();
			System.out.println(););
		}
		
		
	public static double Prosjek(){
		
	}
		
	}
	
	
	

}
