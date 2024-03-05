package arena;
import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Charakter{

	public Dragon(String name) {
		super(name);
			}

	public void attack(Charakter enemy) {
        int ba = ThreadLocalRandom.current().nextInt(20, 25);
        if (isSpecialAbilityActive() == true) {
            int malus = ThreadLocalRandom.current().nextInt(5, 10);
            ba -= malus;
            
        }
        enemy.getDamage(ba);
    }

	@Override
	public int randompoints() {
		if(isSpecialAbilityActive() == false) {
			int randomPoints = ThreadLocalRandom.current().nextInt(20, 25);
		}
		else if(isSpecialAbilityActive() == false) {
			int randomPoints = ThreadLocalRandom.current().nextInt(5, 10);
		}
		
		return randomPoints;
			
		}


	@Override
	public void activateSpecialAbillity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deactivateSpecialAbillity() {
		// TODO Auto-generated method stub
		
	}
	
		
	}
	
