package structural.flyweight;

import java.util.Random;

public class FlyweightTestDriver {
    /*
    Intent:

    Flyweight is a structural design pattern that lets you fit more objects
    into the available amount of RAM by sharing common parts of state between
    multiple objects instead of keeping all of the data in each object.
     */

    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public void run (){
        for (int i = 0; i < 10; i++)
        {
            Player p = PlayerFactory.getPlayer(getRandPlayerType());

            p.assignWeapon(getRandWeapon());

            p.mission();
        }
    }

    public static String getRandPlayerType()
    {
        Random r = new Random();

        // Will return an integer between [0,2)
        int randInt = r.nextInt(playerType.length);

        // return the player stored at index 'randInt'
        return playerType[randInt];
    }
    public static String getRandWeapon()
    {
        Random r = new Random();

        // Will return an integer between [0,5)
        int randInt = r.nextInt(weapons.length);

        // Return the weapon stored at index 'randInt'
        return weapons[randInt];
    }
}
