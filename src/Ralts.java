import attacks.ChargeBeam;
import attacks.Thunderbolt;
import ru.ifmo.se.pokemon.*;

public class Ralts extends Pokemon{
    public Ralts(String name, int level) {
        super(name, level);
        setStats(28.0, 25.0, 25.0, 45.0, 35.0, 40.0);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Thunderbolt(), new ChargeBeam());
    }
}
