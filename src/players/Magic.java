package players;

import java.util.Random;

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0 && boss.getHealth() > 0) {
            if (boss.getHealth() - this.getDamage() < 0) {
                boss.setHealth(0);
            }
            else  {
                Random r = new Random();

                for (int i = 0; i < heroes.length; i++) {
                    if (!(heroes[i] instanceof Medic))
                    heroes[i].setDamage(heroes[i].getDamage()+r.nextInt(5,15));
                }
            }
        }
    }

}
