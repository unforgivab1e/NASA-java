package main.resources;
public class Robot {
    int x;
    int y;
    char direction;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public char getDirection() {
        return direction;
    }
    public Robot(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    private Robot turnRight() {
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

    private Robot turnLeft() {
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

    private Robot walk() {
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
        Robot resultRobot = new Robot(x, y, direction);
        for (char operation : command.toCharArray()) {
            resultRobot = executeCommand(resultRobot, operation);
        }
        return resultRobot;
    }

    private Robot executeCommand(Robot robot, char command) {
        if (command == 'R') {
            return robot.turnRight();
        } else if (command == 'L') {
            return robot.turnLeft();
        } else if (command == 'M') {
            return robot.walk();
        }
        throw new IllegalArgumentException("Unknown command:" + command);
    }
}
