public class Player { //start of Player class
    Position pos;

    public Player(Position pos){
        this.pos = pos;
    }

    public void movePosition(double newX, double newY){
        pos.x = pos.x + newX;
        pos.y = pos.y + newY;
    }
    public void printPosition(){
        System.out.println(pos.x + " " + pos.y);
    }

} //end of Player class