package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import com.opencsv.CSVReader;

public class ConvertCSV {
	
	public static void lire(String fileName) {
			try {
				CSVReader reader = new CSVReader(new FileReader(fileName));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
}
