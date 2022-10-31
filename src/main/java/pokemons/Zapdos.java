package pokemons;

import move.Charge_Beam;
import move.Drill_Peck;
import move.Thunderbolt;
import move.Zap_Cannon;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zapdos extends Pokemon {
    public Zapdos(String name, int level){
        super(name, level);
        setType(Type.ELECTRIC,Type.FLYING);
        setStats(90,90,85,125,90,100);
        setLevel(level);
        setMove(new Thunderbolt(), new Drill_Peck(), new Zap_Cannon(), new Charge_Beam());
    }
}
