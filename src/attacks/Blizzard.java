package attacks;
import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110.0, 70.0);
    }

    @Override
    public void applyOppEffects(Pokemon opponent) {
        if (Math.random() <= 0.1) {
            Effect.freeze(opponent);
        }
    }

    @Override
    public String describe() {
        return("Blizzard!");
    }

}
