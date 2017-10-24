package hr.jere.predavanje10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

import hr.jere.predavanje10.model.Osoba;

public class Main {
	
	private static String file_path="c:\\Users\\office\\Desktop\\Datoteka.txt";
	private static int buffer = 1024;

	public static void main(String[] args) {
		zadatak2();
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
	
	
	public static void primjer6() {
		String text = "Text 3¡^4^¢5¢°°ÈŽÆ\r\n";
		try {
			OutputStream izlaz = new BufferedOutputStream(new FileOutputStream(file_path,true),buffer);
			izlaz.write(text.getBytes());
//			while (bajt != -1) {
//				System.out.println("Bajt: " +bajt);
//				bajt = (byte) izlaz.wr;
//			}
			izlaz.flush();
			izlaz.close();
		} catch (FileNotFoundException e) {
			System.out.println("nema fajla :(");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void primjer7() {
		//String text = "Text 3¡^4^¢5¢°°ÈŽÆ\r\n";
		try {
			FileInputStream istream = new FileInputStream(file_path);
			BufferedReader buff = new BufferedReader(new InputStreamReader(istream),buffer);
			String strLine;
			while((strLine = buff.readLine()) != null){
				System.out.println(strLine);
			}
			buff.close();
		} catch (FileNotFoundException e) {
			System.out.println("nema fajla :(");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void primjer8() {
		//String text = "Text 3¡^4^¢5¢°°ÈŽÆ\r\n";
		ArrayList<Osoba> osobe = new ArrayList<>();
		
		try {
			FileInputStream istream = new FileInputStream(file_path);
			BufferedReader buff = new BufferedReader(new InputStreamReader(istream),buffer);
			String strLine;
			while((strLine = buff.readLine()) != null){
				System.out.println(strLine);
				String[] data = strLine.split(";");
				osobe.add(new Osoba(data[0], data[1], Integer.parseInt(data[2])));
			}
			buff.close();
			
			for(Osoba o : osobe){
				System.out.println(o);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("nema fajla :(");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static void zadatak1() {
		String ime = "Jeronim";
		String datoteka = "c:\\Users\\office\\Desktop\\"+ime+".txt";
		try{
		Writer out = new FileWriter(datoteka);
		for (int i = 0; i < 50; i++) {
			out.write(ime+"\r\n");
		}
		out.flush();
		out.close();
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public static void zadatak2() {
		String rijec = "Jeronim";
		String datoteka = "c:\\Users\\office\\Desktop\\palindrom.txt";
		try{
			Scanner scn = new Scanner(System.in);
			System.out.println("Unesi rjeè za provjeru");
			Writer out = new FileWriter(datoteka);
			out.write(scn.nextLine());
			BufferedReader buff = new BufferedReader(new InputStreamReader(new InputStream() {
				
				@Override
				public int read() throws IOException {
					// TODO Auto-generated method stub
					return 0;
				}
			}in),buffer);
		out.flush();
		out.close();
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
