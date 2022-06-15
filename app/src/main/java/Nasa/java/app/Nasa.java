package main.java.Nasa.java.app;
import main.resources.ResultDto;
import main.resources.Robot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.resources.Fuction.getMap;

public class Nasa {

    public static void main(String[] args) {

        List<Integer> location = new ArrayList<>();
        char direction;
        Scanner sc = new Scanner(System.in);
        String[] mapInput= sc.nextLine().split(" ");
        getMap(Integer.parseInt(mapInput[0]), Integer.parseInt(mapInput[1]));
        while (true) {
            String[] LocationInput = sc.nextLine().split(" ");
            location.clear();
            location.add(Integer.parseInt(LocationInput[0]));
            location.add(Integer.parseInt(LocationInput[1]));
            direction = LocationInput[2].toCharArray()[0];
            Robot robot = new Robot(location.get(0), location.get(1), direction);
            ResultDto finishCommand = robot.getCommand(sc.nextLine());
            System.out.println(finishCommand.getX() + " " + finishCommand.getY() + " " + finishCommand.getDirection());
        }
    }










}
