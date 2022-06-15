package main.java.Nasa.java.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nasa {
    static String  DIRECTION_RULE = "NESW";
    public static void main(String[] args) {
        Nasa nasa=new Nasa();
        List<Integer> location = null;
        char direction;
        Scanner sc = new Scanner(System.in);
        String[] mapInput= sc.nextLine().split(" ");
        nasa.getMap(Integer.parseInt(mapInput[0]),Integer.parseInt(mapInput[1]));
        /*while(true){
            String[] LocationInput= sc.nextLine().split(" ");
            location.clear();
            location.add(Integer.parseInt(LocationInput[0]));
            location.add(Integer.parseInt(LocationInput[1]));
            direction=LocationInput[2].toCharArray()[0];
            char[] action= sc.nextLine().toCharArray();
            for (char c : action) {
                switch(c)
                {
                    case 'L' :
                    case 'R' :
                        direction= nasa.turnAround( direction, c);
                        break;
                    case 'M' :
                        location= nasa.walk( direction, location);
                        break;
                }
            }
            System.out.println(location.get(0)+" "+location.get(1)+" "+direction);
        }*/
    }





    public char turnAround(char direction, char action){
        int index= DIRECTION_RULE.lastIndexOf(direction);
        if((action+"").equalsIgnoreCase("R")){
            index++;
            index=index>3?index-4:index;
        }
        if((action+"").equalsIgnoreCase("L")){
            index--;
            index=index<0?index+4:index;
        }
        return DIRECTION_RULE.charAt(index);
    }

    public List<Integer> getMap(int x, int y) {
        return List.of(x,y);
    }

    public  List<Integer> walk(char direction, List<Integer> location){
        List<Integer> result =new ArrayList<>();
        switch(direction)
        {
            case 'N' :
                result.add(location.get(0));
                result.add(location.get(1)+1);
                break;
            case 'W' :
                result.add(location.get(0)-1);
                result.add(location.get(1));
                break;
            case 'S' :
                result.add(location.get(0));
                result.add(location.get(1)-1);
                break;
            case 'E':
                result.add(location.get(0) + 1);
                result.add(location.get(1));
                break;
        }

        return result;
    }

    public List getCommand(String command, char direction, List<Integer> location) {
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
        return List.of(location.get(0), location.get(1), direction);

    }
}
