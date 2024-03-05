package arena;

public abstract class Charakter {

	private String name;
	private int lifepoints;
	private boolean specialAbilityActive;
	private int damagepoints;
	
	
	
	public Charakter(String name) {
		super();
		name = name;
		this.lifepoints = 100;
		this.specialAbilityActive = false;
		this.damagepoints = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public int getLifepoints() {
		return lifepoints;
	}
	public void setLifepoints(int lifepoints) {
		lifepoints = lifepoints;
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
		damagepoints = damagepoints;
	}
	
	
	public void getDamage(int damagePoints) {
		this.lifepoints = lifepoints - damagePoints; 
	}
	
	public void attack(Charakter enemy) {
		damagePoints = randompoints();
		enemy.getDamage(damagePoints);	
	}
	
	public int randompoints();
	
	public void activateSpecialAbillity();
	public void deactivateSpecialAbillity();
	//gfchvbjknlmö,
}
