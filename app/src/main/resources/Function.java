package main.resources;

import java.util.ArrayList;
import java.util.List;

public class Function {
    static String DIRECTION_RULE = "NESW";

    public static char turnAround(char direction, char action) {
        int index = DIRECTION_RULE.lastIndexOf(direction);
        if ((action + "").equalsIgnoreCase("R")) {
            index++;
            index = index > DIRECTION_RULE.length() - 1 ? index - DIRECTION_RULE.length() : index;
        }
        if ((action + "").equalsIgnoreCase("L")) {
            index--;
            index = index < 0 ? index + DIRECTION_RULE.length() : index;
        }
        return DIRECTION_RULE.charAt(index);
    }

    public static List<Integer> getMap(int x, int y) {
        return List.of(x, y);
    }

    public static List<Integer> walk(int x, int y, char direction) {
        List<Integer> result = new ArrayList<>();
        switch (direction) {
            case 'N':
                result.add(x);
                result.add(y + 1);
                break;
            case 'W':
                result.add(x - 1);
                result.add(y);
                break;
            case 'S':
                result.add(x);
                result.add(y - 1);
                break;
            case 'E':
                result.add(x + 1);
                result.add(y);
                break;
        }

        return result;
    }
}
