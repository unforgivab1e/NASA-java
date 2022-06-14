package main.java.Nasa.java.app;

public class Nasa {
    static String  DIRECTION_RULE = "NESW";

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
}
