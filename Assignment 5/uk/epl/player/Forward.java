package uk.epl.player;
import uk.epl.game.*;

public class Forward extends Player {
    private int ACCELERATION_POINT = 10;
    public Forward(String name, int jerseyNumber, int speed, int stamina, int passing){
        super(name, jerseyNumber, speed, stamina, passing);
    }

    @Override
    protected float getSpeed() {
        return super.getSpeed() + ACCELERATION_POINT;
    }
    @Override
    public String toString() {
        return String.format("Player Name='%s, JerseyNumber=%d Position (%d , %d) Forward SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",
                getName(),
                getJerseyNumber(),
                position.x,
                position.y,
                getSpeed(),
                getStamina(),
                getPassing());
    }
}


