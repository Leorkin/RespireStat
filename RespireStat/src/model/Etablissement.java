package model;

public class Etablissement {
	private String identifiant;
	private String nomEtablissement;
	private Lieu lieuEtablissement;
	private Type typeEtablissement;
	private CoordGPS coordonneesEtablissement;
	
	public Etablissement(String[] nextLine) {
		identifiant = nextLine[0];
		nomEtablissement = nextLine[1];
		
		lieuEtablissement = Lieu;
		typeEtablissement = Type;
		coordonneesEtablissement = CoordGPS;
		
		
	}
}
