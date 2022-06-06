package players;

import java.util.Random;

public class Warrior extends Hero {


    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0 && boss.getHealth() > 0) {
            if (boss.getHealth() - this.getDamage() < 0) {
                boss.setHealth(0);
            }
            else  {
                Random r = new Random();
                int gh;
                boss.setHealth(boss.getHealth() - (this.getDamage() * r.nextInt(2,4)));

            }
        }
    }

}
