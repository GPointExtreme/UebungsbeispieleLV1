
public class ZinsDemo {

	static double kontostand = 1000;
	static double zinsen = 2.25;
	
	public static void main(String[] args) {
		// Übung 3 läuft!
		Zinsberechnung();
		}
		
	public static void Zinsberechnung()
		{
		double multiplikator = ((100+zinsen)/100);
		double endStand = kontostand*multiplikator;
		double zinsGewinn = (endStand-kontostand);
		
		System.out.println("Der neue Kontostand ist " + endStand + "€");
		System.out.println("Die Zinsen betragen " + zinsGewinn + "€");
		}	

	}

