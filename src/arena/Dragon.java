package arena;
import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Charakter{

	public void attack(Charakter enemy) {
        int a = ThreadLocalRandom.current().nextInt(20, 26);
        if (isSpecialAbilityActive()) {
            int malus = ThreadLocalRandom.current().nextInt(5, 11);
            a -= malus;
            setSpecialAbilityActive(false);
        }
        enemy.getDamage(a);
    }
	
		
	}
	
