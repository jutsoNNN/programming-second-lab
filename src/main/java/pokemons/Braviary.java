package pokemons;

import move.Superpower;
import ru.ifmo.se.pokemon.Type;

public class Braviary extends Rufflet{
    public Braviary(String name, int level){
        super(name, level);
        setType(Type.NORMAL,Type.FLYING);
        setStats(100,123,75,57,75,80);
        setLevel(level);
        setMove(new Superpower());
    }
}
