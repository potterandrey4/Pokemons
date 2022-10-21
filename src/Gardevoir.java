import attacks.Charm;
import attacks.Growl;
import ru.ifmo.se.pokemon.*;

public class Gardevoir extends Pokemon {
    public Gardevoir(String name, int level) {
        super(name, level);
        setStats(68, 65, 65, 125, 115, 80);
        addMove(new Growl());
    }
}
