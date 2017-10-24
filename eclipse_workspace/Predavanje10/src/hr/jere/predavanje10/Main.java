package hr.jere.predavanje10;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Main {
	
	private static String file_path="c:\\Users\\office\\Desktop\\Datoteka.txt";
	private static int buffer = 1024;

	public static void main(String[] args) {
		primjer5();
	}
	
	public static void primjer1(){
		try {
			InputStream ulaz = new FileInputStream(file_path);
			byte bajt = (byte) ulaz.read();
			while (bajt != -1) { //-1 znaèi kraj
				System.out.println("Bajt: "+(char)bajt);
				bajt = (byte) ulaz.read();
			}
			ulaz.close();
		} catch (FileNotFoundException e) {
			System.out.println("nema fajla :(");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void primjer2() {
		String mojTekst = "Nesto napisano \r\n";
		try {
			OutputStream izlaz = new FileOutputStream(file_path, true);
			izlaz.write(mojTekst.getBytes());
			izlaz.flush();
			izlaz.close();
		} catch (FileNotFoundException e) {
			System.out.println("nema fajla :(");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void primjer3() {
		try {
			Reader ulazZnak = new FileReader(file_path); //reader zna prepoznati i unicode!!! zato se koristi reader za text
			int podatak = ulazZnak.read();
			
			while (podatak != -1) {
				char znak = (char) podatak;
				System.out.print(znak);
				podatak = ulazZnak.read();
			}
			ulazZnak.close();
		} catch (FileNotFoundException e) {
			System.out.println("nema fajla :(");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void primjer4() {
		String text = "neki text,ŽŠè3¡^4^¢5¢°°dfs\\|";
		try {
			Writer writer = new FileWriter(file_path,true);
			writer.write(text);
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("nema fajla :(");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void primjer5() {
		String text = "neki text,ŽŠè3¡^4^¢5¢°°dfs\\|";
		try {
			InputStream ulaz = new BufferedInputStream(new FileInputStream(file_path),buffer);
			byte bajt = (byte) ulaz.read();
			while (bajt != -1) {
				System.out.println("Bajt: " +bajt);
				bajt = (byte) ulaz.read();
			}
			ulaz.close();
		} catch (FileNotFoundException e) {
			System.out.println("nema fajla :(");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
