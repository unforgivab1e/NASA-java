package main.resources;

import java.util.List;

import static main.resources.Fuction.turnAround;
import static main.resources.Fuction.walk;

public class Robot {
    private int x;
    private int y;
    private char direction;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public Robot(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    public ResultDto getCommand(String command) {
        char[] action = command.toCharArray();
        for (char c : action) {
            switch (c) {
                case 'L':
                case 'R':
                    direction = turnAround(direction, c);
                    break;
                case 'M':
                    x = walk(x, y, direction).get(0);
                    y = walk(x, y, direction).get(1);
                    break;
            }
        }

        return new ResultDto(x, y, direction);

    }

}
