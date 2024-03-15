package arena;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Arena {

	private Charakter player1;
	private Charakter player2;
	private Charakter winner;
	
	
	public Arena(Charakter player1, Charakter player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.winner = null;
	}
	public Charakter getPlayer1() {
		return player1;
	}
	public void setPlayer1(Charakter player1) {
		this.player1 = player1;
	}
	public Charakter getPlayer2() {
		return player2;
	}
	public void setPlayer2(Charakter player2) {
		this.player2 = player2;
	}
	public Charakter getWinner() {
		return winner;
	}
	public void setWinner(Charakter winner) {
		this.winner = winner;
	}
	
	public Charakter amZug = null;
	private Charakter enemy = null;
	/**
     * Bestimmt welcher Spieler zuerst am Zug ist.
     */
	public void beginner() {
		int i = ThreadLocalRandom.current().nextInt(1, 2+1);
		if(i== 1){
			this.amZug = this.player1;
			this.enemy = this.player2;
			
		}else if(i==2) {
			this.amZug = this.player2;
			this.enemy = this.player1;
		}
	}
	/**
     * Wechselt den Spieler, der am Zug ist.
     */
	public void spielerWechsel() {
		if( amZug == this.player1) {
			amZug = this.player2;
			enemy = this.player1;
		}else if ( amZug == this.player2) {
			amZug = this.player1;
			enemy = this.player2;
		}
	}/**
     * Führt eine Fähigkeit im Kampf aus.
    *
    * @param eingabe Die Eingabe des Spielers.
    */
	
	public void fight(int eingabe) {
		
		if(eingabe == 1) {
			amZug.attack(enemy);
			System.out.println(this.amZug.getName() + " hat Angegriffen Stärke von  : " + this.amZug.getDamagepoints() + "\n");
			printPlayerInfo();
			spielerWechsel();
		} else if(eingabe == 2 && amZug.isSpecialAbilityActive()== false) {
			amZug.activateSpecialAbillity();
			amZug.setSpecialAbilityActive(true);
			System.out.println(this.amZug.getName() + " hat seine Spezialfähigkeit Aktiviert \n");
			printPlayerInfo();
			spielerWechsel();
		} else if(eingabe == 3&& amZug.isSpecialAbilityActive()== true) {
			amZug.deactivateSpecialAbillity();
			amZug.setSpecialAbilityActive(false);
			System.out.println(this.amZug.getName() + " hat seine Spezialfähigkeit deaktiviert \n");
			printPlayerInfo();
			spielerWechsel();
		}else {
			System.out.println("Die Eingabe war ungültig, bitte Versuche es erneut.");
		}
	}
	/**
     * Überprüft, ob ein Spieler den Kampf gewonnen hat.
     */
	public void checkForWinner() {
		if (this.amZug.getLifepoints() <= 0) {
			this.winner = this.enemy;
			System.out.println(this.winner.getName() + " hat gewonnen");
		}
		
	}
	/**
     * Gibt Name, Lebenspunkte, und Spezialfähigkeit aktiv ist  über jeden Spieler aus.
     */
	
	public void printPlayerInfo() {
		System.out.println(this.player1.getName() + " : \n" + " Leben = " + this.player1.getLifepoints() + "\n Spezialfähigkeit aktiv = " + this.player1.isSpecialAbilityActive() 
		+ "\n\n " + this.player2.getName() + " : \n" + " Leben = " + this.player2.getLifepoints() + "\n Spezialfähigkeit aktiv = " + this.player2.isSpecialAbilityActive()+ "\n");
	}
}
