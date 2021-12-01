package uk.epl.player;
import uk.epl.game.*;

public class Midfielder extends Player{
    private int PASS_ACCURACY = 10;
    public Midfielder(String name, int jerseyNumber, int speed, int stamina, int passing){
        super(name, jerseyNumber, speed, stamina, passing);
    }

    @Override
    protected float getPassing() {
        return super.getPassing() + PASS_ACCURACY;
    }
    @Override
    public String toString() {
        return String.format("Player Name='%s, JerseyNumber=%d Position (%d , %d) Midfielder SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",
                getName(),
                getJerseyNumber(),
                position.x,
                position.y,
                getSpeed(),
                getStamina(),
                getPassing());
    }
}
