package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;

import model.CoordGPS;
import model.Etablissement;

public class ConvertCSV {
	
	public static void lire(String fileName) {
		try {
			CSVReader reader = new CSVReader(new FileReader(fileName));
			String[] nextLine = reader.readNext();
			while((nextLine = reader.readNext ()) != null) {
				for(int i= 0; i<nextLine.length; i++) {
					System.out.print(nextLine[i] + " ");
				}
			System.out.println();
			new Etablissement(nextLine);
			
			new CoordGPS(nextLine[24]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
