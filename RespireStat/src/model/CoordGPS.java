package model;

public class CoordGPS {
	private double latitude;
	private double longitude;
	
	public CoordGPS(String s) {
		
	}
	public CoordGPS(double la, double lo) {
		latitude = la;
		longitude = lo;
	}
	
	public double getLatitude(){
		return latitude;
	}
	
	public double getLongitude(){
		return longitude;
	}
}