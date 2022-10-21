package attacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends PhysicalMove {

    public Confide() {
        super(Type.NORMAL, 0, 0);
    }


    @Override
    public void applyOppEffects(Pokemon opponent) {
        if (opponent.getStat(Stat.SPECIAL_ATTACK) >= -6) {
            opponent.setMod(Stat.SPECIAL_ATTACK, -1);
        }
    }

    @Override
    public String describe() {
        return ("Confide! снижает сопернику на 1 спец.атаку");
    }
}