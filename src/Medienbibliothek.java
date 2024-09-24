import java.util.ArrayList;

public class Medienbibliothek {
	
	private ArrayList<Medium> medienliste; //Ersetzbarkeit verwendet

	public Medienbibliothek() {
		this.medienliste = new ArrayList<>();
	}
	
	public void mediumHinzufügen(Medium m)
	{
		this.medienliste.add(m);
	}
	
	/*
	 * Ausgabe aller Medien in der Bibliothek �ber Methodenpolymorphie
	 */
	public void alleMedienAusgeben()
	{
		for(Medium m : medienliste)
		{
			System.out.println("-----------------------------");
			m.anzeigen(); //polymorpher Methodenaufruf
		}
	}
	
	/*
	 * Methode, die die generische Liste durchl�uft und nur VHS aussucht,
	 * und diesen dann als eigene Liste zur�ckgibt.
	 * Zweck: Illustration der Funktionsweise des instanceof Operators.
	 */
	public ArrayList<VHS> alleVHSalsListe()
	{
		ArrayList<VHS> vhs = new ArrayList<>();
		for(Medium m : medienliste)
		{
			if(m instanceof VHS)
			{
				vhs.add((VHS)m);
			}
		}
		return vhs;
	}
}
