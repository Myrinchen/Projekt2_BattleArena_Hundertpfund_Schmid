package arena;

import java.util.concurrent.ThreadLocalRandom;

public class Dwarf extends Charakter{

	public Dwarf(String name) {
		super(name);
	}

	public int randompoints() {
		if(this.isSpecialAbilityActive() == true) {
			this.setDamagepoints(ThreadLocalRandom.current().nextInt(15, 25+1) *2);  
		}else if (this.isSpecialAbilityActive() == false) {
			this.setDamagepoints(ThreadLocalRandom.current().nextInt(15, 25+1));
		}
		return this.getDamagepoints();
	}

	public void activateSpecialAbillity() {
		if(this.getLifepoints()<= 50) {
			this.setSpecialAbilityActive(true); 
			int i = ThreadLocalRandom.current().nextInt(1, 10+1);
			if (this.getLifepoints()<= 50 && this.getLifepoints()> 20) {
				if(i>3) {
					this.setDamagepoints(getDamagepoints()/4);
				}
			}else if (this.getLifepoints()<= 20 && this.getLifepoints()> 10) {
				if(i>5) {
					this.setDamagepoints(getDamagepoints()/4);
				}
			}else if (this.getLifepoints()<= 10) {
				if(i>7) {
					this.setDamagepoints(getDamagepoints()/4);
				}
			}	
		}
	}

	
	public void deactivateSpecialAbillity() {
		this.setSpecialAbilityActive(false);
		
	}

	
	
}
