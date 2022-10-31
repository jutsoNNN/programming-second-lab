package pokemons;

import move.Play_Nice;
import ru.ifmo.se.pokemon.Type;

public class Steenee extends Bounsweet {
    public Steenee(String name, int level){
        super(name, level);
        setType(Type.GRASS);
        setStats(52,40,48,40,48,62);
        setLevel(level);
        setMove(new Play_Nice());
    }
}
