package uk.epl.player;
import uk.epl.game.*;

public class Defender extends Player{
    private int STRENGTH_POINT = 10;
    public Defender(String name, int jerseyNumber, int speed, int stamina, int passing){
        super(name, jerseyNumber, speed, stamina, passing);
    }

    @Override
    protected float getStamina() {
        return super.getStamina() + STRENGTH_POINT;
    }
    @Override
    public String toString() {
        return String.format("Player Name='%s, JerseyNumber=%d Position (%d , %d) Defender SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",
                getName(),
                getJerseyNumber(),
                position.x,
                position.y,
                getSpeed(),
                getStamina(),
                getPassing());
    }
}
