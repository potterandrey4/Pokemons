package attacks;

import ru.ifmo.se.pokemon.*;

public class WaterPulse extends SpecialMove {
    public WaterPulse() {
        super(Type.WATER, 60.0, 100.0);
    }

    @Override
    public void applyOppEffects(Pokemon opponent) {
        if (Math.random() <= 0.2) {
            Effect.confuse(opponent);
        }
    }

    @Override
    public String describe() {
        return("применяет атаку Water Pulse");
    }

}
