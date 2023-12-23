
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class main {
    public static void main(String[] args) {
        int hammer_Count = 0;
        int knife_Count = 0;
        int screwdriver_Count = 0;

        Room kitchen = new Room("kitchen");
        kitchen.setDescription("A dank and dirty room buzzing with flies.");

        Room dinningHall = new Room("dinning Hall");
        dinningHall.setDescription("A cozy and relaxing room.");
        Enemy dave = new Enemy("Dave", "A smelly zombie");
        dave.setConversation("hello my name is dave how are you");
        dave.setWeakness("Knife");
        dinningHall.setCharacter(dave);

        Room ballroom = new Room("ballroom");
        ballroom.setDescription("A warm and inviting room");
        Enemy steve = new Enemy("Steve", "A old skeleton");
        steve.setConversation("hello human what are you doing");
        steve.setWeakness("Hammer");
        ballroom.setCharacter(steve);

        kitchen.linkRoom(dinningHall, "south");
        dinningHall.linkRoom(kitchen, "north");

        ballroom.linkRoom(dinningHall, "east");
        dinningHall.linkRoom(ballroom, "west");

        kitchen.linkRoom(ballroom, "south-west");
        ballroom.linkRoom(kitchen, "north-east");

        Scanner input = new Scanner(System.in);
        Room currentRoom = kitchen;

        while (true) {

            System.out.println("");
            currentRoom.getDetails();

            Character inhabits = currentRoom.getCharacter();
            if (inhabits != null) {
                inhabits.describe();
            }

            System.out.print(">");
            String command = input.next();
            String weapon;
            if (Arrays.asList("north", "south", "west", "east").contains(command)) {
                currentRoom = currentRoom.move(command);
            } else if (command.equals("talk")) {

                if (inhabits != null) {
                    inhabits.talk();
                } else {
                    System.out.print("no one in the room");
                }

            } else if (command.equals("fight")) {

                if (inhabits != null & (hammer_Count > 0 || knife_Count > 0 || screwdriver_Count > 0)) {
                    System.out.println("What will you fght with?");
                    weapon = input.next();
                    boolean win = inhabits.fight(weapon);
                    if (weapon.equalsIgnoreCase("knife")) {

                    }
                    if (win) {
                        if (hammer_Count > 0 || knife_Count > 0 || screwdriver_Count > 0) {
                            System.out.println("you win");
                            System.out.println("----------------------------");
                            currentRoom.setCharacter(null);
                        } else {
                            System.out.println("You do noy have this item");
                        }
                    } else {
                        System.out.println("you lose");
                        System.out.println("----------------------------");
                        System.exit(0);
                    }
                } else if (inhabits != null) {
                    System.out.println("you dont have a weapon");
                    System.out.println("----------------------------");
                } else {
                    System.out.println("no one in the room");
                    System.out.println("----------------------------");
                }
            } else if (command.equals("inventory")) {
                Item Hammer = new Item("Hammer");
                Hammer.setDescription("Heavy and Firm Hammer");

                Item Knife = new Item("Knife");
                Knife.setDescription("Sharp and dangerous Knife");

                Item Screwdriver = new Item("Screwdriver");
                Screwdriver.setDescription("firm and steady screwdriver");
                int num = 0;
                while (num != 4) {
                    System.out.println("You have " + hammer_Count + " hammer and " + knife_Count + " Knife and "
                            + screwdriver_Count
                            + " screwdriver \nclick 1 to get hamer and so one \n and click 4 to not choose");
                    num = Integer.parseInt(input.next());
                    if (num == 1 && hammer_Count >= 1) {
                        Hammer.getDetails();
                        System.out.println("----------------------------");
                    } else if (num == 2 && knife_Count >= 1) {
                        Knife.getDetails();
                        System.out.println("----------------------------");
                    } else if (num == 3 && screwdriver_Count >= 1) {
                        Screwdriver.getDetails();
                        System.out.println("----------------------------");
                    } else if (num == 4) {
                        System.out.println("exit");
                    } else {
                        System.out.println("You do noy have this item");
                        System.out.println("----------------------------");
                    }
                }
            } else if (command.equals("Steal")) {
                if (inhabits != null) {
                    Random rand = new Random();
                    int upperbound = 55;
                    int int_random = rand.nextInt(upperbound);
                    if (int_random > 25) {
                        if (int_random < 35) {
                            System.out.println("you stole one hammer");
                            hammer_Count = hammer_Count + 1;
                        } else if (int_random > 35 && int_random < 45) {
                            System.out.println("you stole one Knife");
                            knife_Count = knife_Count + 1;
                        } else if (int_random > 45) {
                            System.out.println("you stole one screwdiver");
                            screwdriver_Count = screwdriver_Count + 1;
                        }
                    } else if (int_random <= 25) {
                        System.out.println("You stole nothing");
                    }
                } else {
                    System.out.println("room is empty");
                    System.out.println("----------------------------");
                }
            }
        }
    }
}