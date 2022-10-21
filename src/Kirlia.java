import attacks.*;

public class Kirlia extends Ralts{
    public Kirlia(String name, int level) {
        super(name, level);
        setStats(38.0, 35.0, 35.0, 65.0, 55.0, 50.0);
        addMove(new Charm());
    }
}
