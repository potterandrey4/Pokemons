package attacks;
import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove{
    public IceBeam() {
        super(Type.ICE, 90.0, 100.0);
    }

    public void applyOppEffect(Pokemon opponent) {
        if (Math.random() <= 0.1) {
            Effect.freeze(opponent);
        }
    }

    @Override
    public String describe() {
        return("Применяет атаку Ice Beam");
    }
}
