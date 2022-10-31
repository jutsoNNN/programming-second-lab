package pokemons;

import move.Double_Team;
import move.Rock_Tomb;
import move.Slash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Rufflet extends Pokemon {
    public Rufflet(String name, int level){
        super(name, level);
        setType(Type.NORMAL,Type.FLYING);
        setStats(70,83,50,37,50,60);
        setLevel(level);
        setMove(new Slash(), new Double_Team(), new Rock_Tomb());
    }
}
