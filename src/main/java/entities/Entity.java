package entities;

public abstract class Entity {

    protected int HP; // Health points for all
    protected int X;  // Point in the coordinate system along the X axis
    protected int Y;  // Point in the coordinate system along the Y axis

    public int getHP() {
        return HP;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
}
