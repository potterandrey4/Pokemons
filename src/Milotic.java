import attacks.WaterPulse;
import ru.ifmo.se.pokemon.*;

public class Milotic extends Feebas {
    public Milotic(String name, int level) {
        super(name, level);
        setStats(95, 60, 79, 100, 125, 81);
        addMove(new WaterPulse());
    }
}
