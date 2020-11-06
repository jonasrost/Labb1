import java.awt.*;

public abstract class Car implements Movable{

    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name

    protected double xCord; // The x coordinate of the car
    protected double yCord; // The y coordinate of the car

    protected int direction; // The direction that the car is facing
    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;

    private static final int[] LEFTTURN = new int[4];
    private static final int[] RIGHTTURN = new int[4];

    public Car(int nrDoors, double enginePower, Color colour, String modelName){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = colour;
        this.modelName = modelName;
        this.xCord = 0;
        this.yCord = 0;
        stopEngine();

        this.direction = NORTH; // Initializes the start direction of the car

        // Fills the arrays with values corresponding to a correct left respective right turn, based on
        // what direction the car is facing.
        LEFTTURN[NORTH] = WEST;
        LEFTTURN[EAST] = NORTH;
        LEFTTURN[SOUTH] = EAST;
        LEFTTURN[WEST] = SOUTH;

        RIGHTTURN[NORTH] = EAST;
        RIGHTTURN[EAST] = SOUTH;
        RIGHTTURN[SOUTH] = WEST;
        RIGHTTURN[WEST] = NORTH;
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        Color clr = this.color;
        return clr;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    private void stopEngine(){
        currentSpeed = 0;
    }



    public void move() {
        if (direction == NORTH)
            yCord = yCord + currentSpeed;
        else if (direction == EAST)
            xCord = xCord + currentSpeed;
        else if (direction == SOUTH)
            yCord = yCord - currentSpeed;
        else
            xCord = xCord - currentSpeed;
    }


    public void turnLeft() {
        this.direction = LEFTTURN[direction];
    }


    public void turnRight() {
        this.direction = RIGHTTURN[direction];
    }
}
