package homework1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Integer[] playerarray = new Integer[100];  // array will keep player's numbers
        String name;
        Random random = new Random();
        Integer target = random.nextInt(100); //number tyring to be found
        Scanner scan = new Scanner(System.in);
        System.out.println("Let the game begin!");
        System.out.println("Enter name");
        name = scan.next();   //player name
        System.out.println("enter the number");
        Integer playernum = scan.nextInt();  // number which player enters
        playerarray[0] = playernum;
        int numofplayernum = 1;
        while (playernum.compareTo(target) != 0) {
            while (playernum < target) {
                System.out.println("Your number is too small. Please, try again..");
                playernum = scan.nextInt();
                playerarray[numofplayernum] = playernum;
                numofplayernum++;
            }

            while (playernum > target) {
                System.out.println("Your number is too big. Please, try again..");
                playernum = scan.nextInt();
                playerarray[numofplayernum] = playernum;
                numofplayernum++;
            }

        }
        System.out.println("congratulations   " + name);

        // to get id of redundat numbers
        Integer[] playerarray2 = Arrays.copyOf(playerarray, numofplayernum);
        Arrays.sort(playerarray2);
        for (int i = playerarray2.length - 1; i >= 0; i--) {
            System.out.println(playerarray2[i]);
        }
    }
}
