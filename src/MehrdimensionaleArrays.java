
public class MehrdimensionaleArrays {

	public static void main(String[] args) {
		// Wie normale (= eindimensionale) Arrays, nur mit mehreren Dimensionen
		// Ähnlich einer Tabelle
		
		// Veranschaulichung:
		/*
		
		// Soweit normales Array:
		(0) | (1) | (2) | (3) | (4)
		
		// Mehrdimensional:
		// (*ZEILE* | *SPALTE*)
		
		(0|0) | (0|1) | (0|2) | (0|3) | (0|4)
		(1|0) | (1|1) | (1|2) | (1|3) | (1|4)
		(2|0) | (2|0) | (2|2) | (2|3) | (2|4)
		
		*/
		
		// Zweidimensionales Array:
		// Pro Dimension ein Klammerpaar "[]"
		
		String[][] firstandlastname = new String[5][2];
		
		firstandlastname[0][0] = "Peter";
		firstandlastname[0][1] = "Griffin";
		
		firstandlastname[1][0] = "Homer";
		firstandlastname[1][1] = "Simpson";
		
		firstandlastname[2][0] = "Schwanzus";
		firstandlastname[2][1] = "Longus";
		
		firstandlastname[3][0] = "American";
		firstandlastname[3][1] = "Dad";
		
		firstandlastname[4][0] = "Mike";
		firstandlastname[4][1] = "Litoris";
		
		// Äußere For Schleife: Zeilenindex => i
		// Innere For Schleife: Spaltenindex => j
		for(int i = 0; i < firstandlastname.length; i++) {
			for(int j = 0; j < firstandlastname[i].length; j++) {
				// Bei innerer For Schleife ist die Zeile zu spezifizieren, von jener Spaltenanzahl ausgegeben werden soll (hier [i], da in Variable "i" die ersten Spaltenwerte beinhaltet)
				System.out.print(firstandlastname[i][j] + " ");
			}
			System.out.println();
		}

	}

}
