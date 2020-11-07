public interface Movable {

    int NORTH = 0;
    int EAST = 1;
    int SOUTH = 2;
    int WEST = 3;

    int[] LEFTTURN = new int[4];
    int[] RIGHTTURN = new int[4];

    /***
     * Moves the car a distance 'currentSpeed' in the direction it is facing.
     */
    void move();

    /***
     * Changes the direction which the car is facing 90 degrees to the left.
     */
    void turnLeft();

    /***
     * Changes the direction which the car is facing 90 degrees to the right.
     */
    void turnRight();

}