package main.java.Nasa.java.app;
import java.util.List;
import java.util.Scanner;

public class Nasa {
    static String  DIRECTION_RULE = "NESW";
    public static void main(String[] args) {
        Nasa nasa=new Nasa();
        List<Integer> location;
        char direction;
        Scanner sc = new Scanner(System.in);
        String[] mapInput= sc.nextLine().split(" ");
        nasa.getMap(Integer.parseInt(mapInput[0]),Integer.parseInt(mapInput[1]));



}
    public static char turnAround(char direction, char action){
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

    }
