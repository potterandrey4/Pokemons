package attacks;
import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove{
    public Thunderbolt() {
        super(Type.ELECTRIC, 90.0, 100.0);
    }

    @Override
    public void applyOppEffects(Pokemon opponent) {
        if (Math.random() <= 0.1) {
            Effect.paralyze(opponent);
        }
    }
}
