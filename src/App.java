public class App {

	public static void main(String[] args)
	{
		Medienbibliothek bib = new Medienbibliothek();
		
		VHS heman = new VHS("He-Man and the Masters of the Universe", 120.99, "B�ro, UG", 120, "Ausgezeichnet");
		Cartridge zeldaGold = new Cartridge("The Adventures of Zelda", 300.00, "Keller, UG", true, "Nintendo", Konsolentyp.NES);
		Buch herr = new Buch("Herr der Ringe", 49.99, "Wohnzimmer, OG", "1234565432123");
		
		bib.mediumHinzufügen(heman);
		bib.mediumHinzufügen(zeldaGold);
		bib.mediumHinzufügen(herr);
		
		bib.alleMedienAusgeben();
		
		System.out.println("");
		System.out.println("--- alle VHS in der Liste ---");
		for(VHS vhs : bib.alleVHSalsListe())
		{
			vhs.anzeigen();
		}
	}
}