package arena;

public abstract class Charakter {

	private String name;
	private int lifepoints;
	private boolean specialAbilityActive;
	private int damagepoints;
	
	
	
	public Charakter(String name) {
		super();
		this.name = name;
		this.lifepoints = 100;
		this.specialAbilityActive = false;
		this.damagepoints = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLifepoints() {
		return lifepoints;
	}
	public void setLifepoints(int lifepoints) {
		this.lifepoints = lifepoints;
	}
	public boolean isSpecialAbilityActive() {
		return specialAbilityActive;
	}
	public void setSpecialAbilityActive(boolean specialAbilityActive) {
		this.specialAbilityActive = specialAbilityActive;
	}
	public int getDamagepoints() {
		return damagepoints;
	}
	public void setDamagepoints(int damagepoints) {
		this.damagepoints = damagepoints;
	}
	
	
	public void getDamage(int damagePoints) {
		this.lifepoints = lifepoints - damagePoints; 
	}
	/**
	 * Methode führt einen Angriff aus.
	 *
	 * @param enemy Spieler der angegriffen wird.
	 */
	public void attack(Charakter enemy) {
		damagepoints = randompoints();
		enemy.getDamage(damagepoints);	
	}
	/**
	 * Methode generiert zufällige Schadenspunkte für den Charakter.
	 */
	public abstract int randompoints();
	
	/**
	 * Methode aktiviert die Spezialfähigkeit des Charakters.
	 */
	public abstract void activateSpecialAbillity();
	
	/**
	 * Methode deaktiviert die Spezialfähigkeit des Charakters.
	 */
	public abstract void deactivateSpecialAbillity();


	
}
