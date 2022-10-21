import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;


public class Main {

    public static void main(String[] args) {

        Battle b = new Battle();


        Pokemon p1 = new Luvdisc("Хищник", 1);
        Pokemon p2 = new Feebas("", 1);
        Pokemon p3 = new Gardevoir("", 1);

        Pokemon p4 = new Kirlia("", 1);
        Pokemon p5 = new Milotic("", 1);
        Pokemon p6 = new Ralts("", 1);

        b.addFoe(p1);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addAlly(p4);
        b.addAlly(p5);
        b.addAlly(p6);

        b.go();

    }
}