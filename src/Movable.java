public interface Movable {

    int NORTH = 0;
    int EAST = 1;
    int SOUTH = 2;
    int WEST = 3;

    int[] LEFTTURN = new int[4];
    int[] RIGHTTURN = new int[4];


    void move();

    void turnLeft();

    void turnRight();

}