package attacks;

import ru.ifmo.se.pokemon.*;
import static ru.ifmo.se.pokemon.Status.*;

public class ChargeBeam extends SpecialMove {

    public ChargeBeam() {
        super(Type.ELECTRIC, 50.0, 90.0);
    }


    @Override
    public void applySelfDamage(Pokemon me, double spAtt) {
        if (Math.random() <= 0.7) {
            me.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }

    @Override
    public String describe() {
        return("Charge beam");
    }

}
