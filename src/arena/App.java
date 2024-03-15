package arena;

import java.util.Scanner;

public class App {
	public static Charakter d1 = null;
	public static Charakter d2 = null;
	static String name ="";
	static int wahl = 0;
	/**
     * Methode zur Eingabe der Charakterwahl.
     *
     * @param sc einlesen von Benutzereingaben.
     * @return ausgew�hlter Charakter.
     */
	public static int eingabeCharakter(Scanner sc) {
		System.out.println("Bitte w�hle zwischen: \n\t" + "|1| Drache \n\t" + "|2| Zwerg");
		
		wahl = -1;
		do {
			wahl = sc.nextInt();
		}while (!(wahl >= 1 && wahl <=2));
		return wahl;
	}
	/**
     * Methode zur Eingabe des Namens des Charakters.
     *
     * @param sc einlesen von Benutzereingaben.
     * @return Name des Charakters.
     */
	public static String eingabeNameOfCharakter(Scanner sc) {
		System.out.println("Bitte w�hle einen Namen : ");
		name = "";
		do {
		name = sc.nextLine();
		}while (name.equals(""));
		return name;
	}
	/**
     * Methode zur Erstellung eines Charakters.
     *
     * @param wahl Die ausgew�hlte Charakterwahl.
     * @param name Der Name des Charakters.
     * @return Der erstellte Charakter.
     */
	public static Charakter createCharakter(int wahl, String name) {
			if(wahl == 1) {
				return new Dragon(name);
			}else if (wahl == 2) {
				return new Dwarf(name);
				
			}else {
				System.out.println("ihre Eingabe war Fehlerhaft, Versuchen sie es bitte erneut :");
				
			}
			return null;

	}
	
	 
	//public static 
		/**
	     * Methode zur Eingabe der Spielaktion.
	     *
	     * @param sc  einlesen von Benutzereingaben.
	     * @param a  Die Arena.
	     * @return Die ausgew�hlte Spielaktion.
	     */
	public static int eingabe(Scanner sc, Arena a) {	
		System.out.println( a.amZug.getName() + " ist am Zug \n");
		System.out.println("bitte w�hle deinen Zug");
		System.out.println("|1| Angreifen \n"+"|2| Spezialf�higkeit Aktivieren \n" + "|3| Spezialf�higkeit Deaktivieren \n");
		
		int eingabe = -1;
		do {
			eingabe = sc.nextInt();
		} while (!(eingabe>= 1 && eingabe <= 3));
		return eingabe;
	}

	public static void main(String[] args) {
		
		int eingabe;
		Scanner sc = new Scanner(System.in);
		do {
			wahl = eingabeCharakter(sc);
			name = eingabeNameOfCharakter(sc);
			d1 = createCharakter(wahl,name);
			wahl = eingabeCharakter(sc);
			name = eingabeNameOfCharakter(sc);
			d2 = createCharakter(wahl,name);
		} while (d1.equals(null) || d2.equals(null));
		
		Arena a = new Arena(d1,d2);
		a.beginner();
		do {
			eingabe = eingabe(sc, a);
			a.fight(eingabe);
			a.checkForWinner();
			
		} while (a.getWinner()== null);
		
		sc.close();

	}

}
