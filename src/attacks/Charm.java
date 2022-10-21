package attacks;
import ru.ifmo.se.pokemon.*;

public class Charm extends PhysicalMove{
    public Charm() {
        super(Type.FAIRY, 0, 100);
    }

    @Override
    public void applyOppDamage(Pokemon opponent, double d) {
        if (opponent.getStat(Stat.ATTACK) >= -6) {
            opponent.setMod(Stat.ATTACK, -2);
        }
    }

    @Override
    public String describe() {
        return("Charm! понижает атаку на 2");
    }

}
