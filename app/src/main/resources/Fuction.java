package main.resources;

import java.util.ArrayList;
import java.util.List;

public class Fuction {
    static String DIRECTION_RULE = "NESW";

    public static char turnAround(char direction, char action) {
        int index = DIRECTION_RULE.lastIndexOf(direction);
        if ((action + "").equalsIgnoreCase("R")) {
            index++;
            index = index > 3 ? index - 4 : index;
        }
        if ((action + "").equalsIgnoreCase("L")) {
            index--;
            index = index < 0 ? index + 4 : index;
        }
        return DIRECTION_RULE.charAt(index);
    }

    public static List<Integer> getMap(int x, int y) {
        return List.of(x, y);
    }

    public static List<Integer> walk(char direction, List<Integer> location) {
        List<Integer> result = new ArrayList<>();
        switch (direction) {
            case 'N':
                result.add(location.get(0));
                result.add(location.get(1) + 1);
                break;
            case 'W':
                result.add(location.get(0) - 1);
                result.add(location.get(1));
                break;
            case 'S':
                result.add(location.get(0));
                result.add(location.get(1) - 1);
                break;
            case 'E':
                result.add(location.get(0) + 1);
                result.add(location.get(1));
                break;
        }

        return result;
    }
}
