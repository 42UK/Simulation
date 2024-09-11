package map;

import entities.Entity;

import java.util.HashMap;

public class Map {

    private HashMap<Cell, Entity> map = new HashMap<>();

    private static int xLength = 6;
    private static int yLength = 6;

    public static void setXLength(int xLength) {
        Map.xLength = xLength;
    }

    public static void setYLength(int yLength) {
        Map.yLength = yLength;
    }

    public static int getYLength() {
        return yLength;
    }

    public static int getXLength() {
        return xLength;
    }

    public void addEntity(Entity e) {
        int x = (int) (Math.random() * xLength);
        int y = (int) (Math.random() * yLength);
        Cell cell = new Cell(x, y);
        if (cell.checkCell()) {
            cell.createCell();
            map.put(cell, e);
        }
    }
}
