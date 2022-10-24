package move;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL,0,85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.ATTACK, +2);
    }
    protected String describe(){
        return "Увеличил свою атаку на 2 и ввёл противника в конфуз";
    }
}
