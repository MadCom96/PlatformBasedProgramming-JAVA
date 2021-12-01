package uk.epl.game;
import java.util.ArrayList;
import java.util.List;
import uk.epl.player.*;

public class Field {
    private List<Player> players = new ArrayList<>();
    public void add(Player player){
        players.add(player);
    }
    public void moveUp(int playerNum){
        for (Player p : players)
            if (p.getJerseyNumber() == playerNum){
                p.moveUp();
                return;
            }
    }
    public void moveDown(int playerNum){
        for (Player p : players)
            if (p.getJerseyNumber() == playerNum){
                p.moveDown();
                return;
            }
    }
    public void moveRight(int playerNum){
        for (Player p : players)
            if (p.getJerseyNumber() == playerNum){
                p.moveRight();
                return;
            }
    }
    public void moveLeft(int playerNum){
        for (Player p : players)
            if (p.getJerseyNumber() == playerNum){
                p.moveLeft();
                return;
            }
    }
    public void start(){
        for(Player p : players)
            if (p instanceof Forward){
                p.position.x = 34;
                p.position.y = 25;
            }else if (p instanceof Midfielder){
                p.position.x = 34;
                p.position.y = 50;
            }else {
                p.position.x = 34;
                p.position.y = 75;
            }
    }
    public void stop(){

    }
    public void info(){
        for (Player p : players)
            System.out.println(p);
    }
}
