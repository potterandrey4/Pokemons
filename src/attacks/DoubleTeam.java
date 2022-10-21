package attacks;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends PhysicalMove{
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    public void applySelfDamage(Pokemon me, double d) {
        if (me.getStat(Stat.EVASION) <= 6) {
            me.setMod(Stat.EVASION, 1);
        }
    }

}
