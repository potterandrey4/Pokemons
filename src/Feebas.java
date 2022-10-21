import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Feebas extends Pokemon {
    public Feebas(String name, int level) {
        super(name, level);
        setStats(20.0, 15.0, 20.0, 10.0, 55.0, 80.0);
        setType(Type.WATER);
        setMove(new IceBeam(), new Blizzard(), new DoubleTeam());
    }
}
