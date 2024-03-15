package arena;
import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Charakter{

	public Dragon(String name) {
		super(name);
			}

	public int randompoints() {
		int randomPoints = 0;
		if(isSpecialAbilityActive() == false) {
			 randomPoints = ThreadLocalRandom.current().nextInt(20, 25);
		}
		else if(isSpecialAbilityActive() == true) {
			 randomPoints = ThreadLocalRandom.current().nextInt(5, 10);
		}
		
		return randomPoints;
			
		}


	
	public void activateSpecialAbillity() {
		this.setSpecialAbilityActive(true);
		this.setLifepoints(getLifepoints()+10);
		
	}

	
	public void deactivateSpecialAbillity() {
		this.setSpecialAbilityActive(false);
		this.setLifepoints(getLifepoints()-10);
		
	}
	
		
	}
	
