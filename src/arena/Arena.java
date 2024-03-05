package arena;

import java.util.concurrent.ThreadLocalRandom;

public class Arena {

	private Charakter player1;
	private Charakter player2;
	private Charakter winner;
	
	
	public Arena(Charakter player1, Charakter player2, Charakter winner) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.winner = winner;
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
	
	public Charakter beginner() {
		int i = ThreadLocalRandom.current().nextInt(1, 2+1);
		if(i== 1){
			return this.player1;
		}else if(i==2) {
			return this.player2;
			
		}
	}
	
	public void fight() {
		System.out.println( this.beginner() + " ist am Zug");
	}
	
}
