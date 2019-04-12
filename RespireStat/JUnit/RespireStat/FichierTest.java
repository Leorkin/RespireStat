package RespireStat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FichierTest {

	@Test
	public void testCtor() {
		String nom = "nom";
		Fichier fichier = new Fichier(nom);
		assertEquals(fichier.getNom(),nom);
	}

}
