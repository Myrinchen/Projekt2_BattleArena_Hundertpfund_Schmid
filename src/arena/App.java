package arena;

import java.util.Scanner;

public class App {
	static Dragon d1 = new Dragon("Kokusnuss");
	static Dwarf d2 = new Dwarf("Zwergii");
	public static Arena a = new Arena(d1,d2);
	
	public static int eingabe(Scanner sc) {
		System.out.println( a.amZug.getName() + " ist am Zug \n");
		System.out.println("bitte wähle deinen Zug");
		System.out.println("|1| Angreifen \n"+"|2| Spezialfähigkeit Aktivieren \n" + "|3| Spezialfähigkeit Deaktivieren \n");
		
		int eingabe = -1;
		do {
			eingabe = sc.nextInt();
		} while (!(eingabe>= 1 && eingabe <= 3));
		return eingabe;
	}

	public static void main(String[] args) {
		int eingabe;
		Scanner sc = new Scanner(System.in);
		a.beginner();
		do {
			eingabe = eingabe(sc);
			a.fight(eingabe);
			a.checkForWinner();
			
		} while (a.getWinner()== null);
		
		sc.close();

	}

}
