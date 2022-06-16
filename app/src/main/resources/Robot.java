package main.resources;

public class Robot {
    int x;
    int y;
    char direction;

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

    public Robot() {
    }


    public Robot(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    public Robot turnRight() {
        if (direction == 'N') {
            direction = 'E';
            return new Robot(x, y, direction);
        }

        if (direction == 'E') {
            direction = 'S';
            return new Robot(x, y, direction);
        }
        if (direction == 'S') {
            direction = 'W';
            return new Robot(x, y, direction);
        }
        if (direction == 'W') {
            direction = 'N';
            return new Robot(x, y, direction);
        }
        return null;
    }

    public Robot turnLeft() {
        if (direction == 'N') {
            direction = 'W';
            return new Robot(x, y, direction);
        }
        if (direction == 'E') {
            direction = 'N';
            return new Robot(x, y, direction);
        }
        if (direction == 'S') {
            direction = 'E';
            return new Robot(x, y, direction);
        }
        if (direction == 'W') {
            direction = 'S';
            return new Robot(x, y, direction);
        }
        return null;
    }

    public Robot walk() {
        if (direction == 'N') {
            return new Robot(x, y + 1, direction);
        }
        if (direction == 'E') {
            return new Robot(x + 1, y, direction);
        }
        if (direction == 'S') {
            return new Robot(x, y - 1, direction);
        }
        if (direction == 'W') {
            return new Robot(x - 1, y, direction);
        }
        return null;
    }

    public Robot getCommand(String command) {
        Robot robot = new Robot();
        for (char operation : command.toCharArray()) {
            if (operation == 'R') {
                robot = turnRight();
            }
            if (operation == 'L') {
                robot = turnLeft();
            }
        }
        return robot;
    }
}
