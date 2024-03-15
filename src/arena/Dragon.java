	package arena;
	import java.util.concurrent.ThreadLocalRandom;
	
	public class Dragon extends Charakter{
	
		public Dragon(String name) {
			super(name);
				}
		/**
	     * Methode generiert  Schadenspunkte.
	     * Wenn die Spezialfähigkeit aktiv ist, werden die Schadenspunkte reduziert.
	     *
	     * @return generierten Schadenspunkte.
	     */
		public int randompoints() {
			int randomPoints = 0;
			if(isSpecialAbilityActive() == false) {
				 randomPoints = ThreadLocalRandom.current().nextInt(20, 25);
			}
<<<<<<< HEAD

	public int randompoints() {
		int randomPoints = 0;
		if(isSpecialAbilityActive() == false) {
			 randomPoints = ThreadLocalRandom.current().nextInt(20, 25);
		}
		else if(isSpecialAbilityActive() == true) {
			 randomPoints = ThreadLocalRandom.current().nextInt(5, 10);
		}
		
		return randomPoints;
=======
			else if(isSpecialAbilityActive() == false) {
				 randomPoints = ThreadLocalRandom.current().nextInt(5, 10);
			}
			
			return randomPoints;
				
			}
	
	
		 /**
	     * Methode aktiviert die Spezialfähigkeit des Drachens.
	     * Erhöht die Lebenspunkte des Drachens um 10.
	     */
		public void activateSpecialAbillity() {
			this.setSpecialAbilityActive(true);
			this.setLifepoints(getLifepoints()+10);
>>>>>>> branch 'master' of https://github.com/Myrinchen/Projekt2_BattleArena_Hundertpfund_Schmid.git
			
		}
	
		/**
	     * Methode deaktiviert die Spezialfähigkeit des Drachens.
	     *  Verringert die Lebenspunkte des Drachens um 10.
	     */
		public void deactivateSpecialAbillity() {
			this.setSpecialAbilityActive(false);
			this.setLifepoints(getLifepoints()-10);
			
		}
		
			
		}
		
