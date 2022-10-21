package attacks;
import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove{
    public Scald() {
        super(Type.WATER, 80.0, 100.0);
    }

    @Override
    public void applyOppEffects(Pokemon opponent) {
         if (Math.random() <= 0.3) {
             Effect.burn(opponent);
         }
    }

    @Override
    public String describe() {
        return("применяет атаку Scald");
    }

}
