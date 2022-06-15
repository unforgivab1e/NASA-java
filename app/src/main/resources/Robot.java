package main.resources;

import java.util.List;

import static main.resources.Fuction.turnAround;
import static main.resources.Fuction.walk;

public class Robot {
    private List<Integer> location;


    public Robot(List<Integer> location, char direction) {
        this.location = location;
        this.direction = direction;
    }

    private char direction;

    public List<Integer> getLocation() {
        return location;
    }

    public void setLocation(List<Integer> location) {
        this.location = location;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
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
                    location = walk(direction, location);
                    break;
            }
        }

        return new ResultDto(location.get(0), location.get(1), direction);

    }

}
