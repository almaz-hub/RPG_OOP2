package players;

import java.util.Random;

public class Hunter extends Hero {


    public Hunter(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        if (this.getHealth() > 0 && boss.getHealth() > 0) {
            if (boss.getHealth() - this.getDamage() < 0) {
                boss.setHealth(0);
            }
            else  {
                Random r = new Random();

                boss.setHealth(boss.getHealth() - (this.getDamage() + r.nextInt(boss.getDamage())));
            }
        }



    }

}
