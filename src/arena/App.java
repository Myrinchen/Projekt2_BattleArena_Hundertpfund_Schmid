package arena;

import java.util.Scanner;

public class App {
	public static Charakter d1 = null;
	public static Charakter d2 = null;
	static String name ="";
	static int wahl = 0;
	public static int eingabeCharakter(Scanner sc) {
		System.out.println("Bitte w�hle zwischen: \n\t" + "|1| Drache \n\t" + "|2| Zwerg");
		
		wahl = -1;
		do {
			wahl = sc.nextInt();
		}while (!(wahl >= 1 && wahl <=2));
		return wahl;
	}
	
	public static String eingabeNameOfCharakter(Scanner sc) {
		System.out.println("Bitte w�hle einen Namen : ");
		name = "";
		do {
		name = sc.nextLine();
		}while (name.equals(""));
		return name;
	}
	
	public static Charakter createCharakter(int wahl, String name) {
		//for(int i = 0; i<3; i++) {
		//if(i == 1) {
			if(wahl == 1) {
				 //d1 = new Dragon(name);
				return new Dragon(name);
			}else if (wahl == 2) {
				//d1 = new Dwarf(name);
				return new Dwarf(name);
				
			}else {
				System.out.println("ihre Eingabe war Fehlerhaft, Versuchen sie es bitte erneut :");
			}
			return null;
//		}else if(i == 2) {
//			if(wahl == 1) {
//				d2 = new Dragon(name);
//			}else if (wahl == 2) {
//				d2 = new Dwarf(name);
//			}else {
//				System.out.println("ihre Eingabe war Fehlerhaft, Versuchen sie es bitte erneut :");
//			}
//		}
//	}
	}
	
	//public static 
	
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
