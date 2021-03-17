
public class IfAbfragen {

	public static void main(String[] args) {
		// Verleichsoperatoren
		// (Operatoer : Beschreibung : Beispiel)
		// < : "Kleiner als" : 1 < 6 (true)
		// > : "Größer als" : 1 > 6 (false)
		// <= : "Kleiner als oder gleich" : 4 <= 4 (true), 3 <= 4 (true)
		// >= : "Größer als oder gleich" : 4 >= 4 (true), 6 >= 4 (true)
		// == : "Gleich" : 4 == 4 (true), 3 == 4 (false)
		// != : "Ungleich" 4 != 4 (false), 3 != 4 (true)
		
		// Variablen
		int age1 = 17;
		age1 = age1 + 1;
		
		int age2 = 16;
		age2 = age2 + 1;
		
		// If-Abfrage
		if(age1 >= 18) {
			System.out.println("She's legal!");
		}
		else {
			System.out.println("NOPE.");
		}
		
		if(age2 >= 18) {
			System.out.println("He's legal!");
		}
		else {
			System.out.println("NOPE.");
		}

	}

}
