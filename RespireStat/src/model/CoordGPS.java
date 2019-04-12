package model;

public class CoordGPS {
	private double latitude;
	private double longitude;
	
	public CoordGPS(String s) {
		int debutLa = s.indexOf("(");
		int finLa = s.indexOf(",", debutLa);
		String latitude = s.substring(debutLa + 1, finLa);
		
		int debutLo = s.indexOf(",");
		int finLo = s.indexOf(")", debutLo);
		String longitude = s.substring(debutLo + 1, finLo);
		
		double la = Double.parseDouble(latitude);
		double lo = Double.parseDouble(longitude);
	}
	
	public CoordGPS(double la, double lo) {
		latitude = la;
		longitude = lo;
	}
}