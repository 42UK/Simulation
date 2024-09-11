package map;

import java.util.HashSet;
import java.util.Set;

public class Cell {

    private static Set<Cell> neighbors = new HashSet<>();
    private int X; // Точка в системе координат по оси Х
    private int Y; // Точка в системе координат по оси У


    public Cell(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public boolean checkCell() {
        return !neighbors.contains(this);
    } // Проверяет пустая ли ячейка

    public void createCell() {
        neighbors.add(this);
    }

    public void clearCell() {
        neighbors.remove(this);
    } // Опустошает ячейку

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Cell c = (Cell) o;
        if (this.getX() == c.getX() && this.getY() == c.getY()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 42;
        result = (result * 13 + this.getX());
        result = result * 13 + this.getY();
        return ++result;
    }

    @Override
    public String toString() {
        return "X = " + X + ", " + "Y = " + Y + " ";
    }
}