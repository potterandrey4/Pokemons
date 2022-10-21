import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Luvdisc extends Pokemon {

    public Luvdisc(String name, int level) {
        super(name, level);
        setStats(43, 30, 55, 40, 65, 97);
        setType(Type.WATER);
        setMove(new WaterPulse(), new Confide(), new Scald(), new HydroPump());
    }
}
