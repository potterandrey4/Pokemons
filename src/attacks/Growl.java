package attacks;

import ru.ifmo.se.pokemon.*;

public class Growl extends PhysicalMove {
    public Growl() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    public void applyOppDamage(Pokemon opponent, double d) {
        if (opponent.getStat(Stat.ATTACK) >= -6) {
            opponent.setMod(Stat.ATTACK, -1);
        }
    }

    @Override
    public String describe() {
        return("Growl!");
    }
}
