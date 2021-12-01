package uk.epl.player;
import uk.epl.game.*;

public abstract class Player {
    private String name;
    private int jerseyNumber;
    private int[] abilities = new int[3];
    final int SPEED = 0; final int STAMINA = 1; final int PASSING = 2;
    public Position position;
    protected Player(String name, int jerseyNumber, int speed, int stamina, int passing){
        this.name = name; this.jerseyNumber = jerseyNumber;
        abilities[SPEED] = speed; abilities[STAMINA] = stamina; abilities[PASSING] = passing;
        position = new Position(0, 0);
    }
    public class Position {
        public int x;
        public int y;
        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public Position getPosition(){
        return new Position(position.x, position.y);
    }
    public void moveUp() {
        float move_delta = getMoveDelta();
        position.y = (int)(position.y - move_delta);
        decreaseStamina();
    }
    public void moveDown() {
        float move_delta = getMoveDelta();
        position.y = (int)(position.y + move_delta);
        decreaseStamina();
    }
    public void moveRight() {
        float move_delta = getMoveDelta();
        position.x = (int)(position.x + move_delta);
        decreaseStamina();
    }
    public void moveLeft() {
        float move_delta = getMoveDelta();
        position.x = (int)(position.x - move_delta);
        decreaseStamina();
    }
    private void decreaseStamina(){
        abilities[STAMINA] = (int)(abilities[STAMINA] - 2);
    }
    private float getMoveDelta() {
        return 1 + getSpeed() / 100 * getStamina() / 100;
    }
    protected String getName(){
        return name;
    }
    public int getJerseyNumber(){
        return jerseyNumber;
    }
    protected float getStamina(){
        return (float)abilities[STAMINA];
    }
    protected float getPassing(){
        return (float)abilities[PASSING];
    }
    protected float getSpeed(){
        return (float) abilities[SPEED];
    }
    @Override
    public String toString() {
        return String.format("Player Name='%s, JerseyNumber=%d Position (%d , %d) %s SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",
                getName(),
                getJerseyNumber(),
                position.x,
                position.y,
                this.getClass().getName(),
                getSpeed(),
                getStamina(),
                getPassing());
    }
}
