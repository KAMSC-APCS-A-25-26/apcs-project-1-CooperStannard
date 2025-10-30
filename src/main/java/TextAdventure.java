import java.util.Scanner;

public class TextAdventure
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // need to put title here ASCII of name
        System.out.println();

        // scene 1 getting out of the forest
        System.out.println("\n\nYour wake up in the middle of a forest with no memory of who you are or where you are.");
        System.out.println("You decide to travel in a random direction untile you reach something or you parish.");
        System.out.println("Your travel for a while until you find a path. The path branches multiple tiles so chose which direction to travel.");
        System.out.println("Capitalisation matters (left-L right-R straight-S)\n");

        // for loop to see if you find the secret ending to get secret ending do L three times
        int secret_Exit_ending = 0;
        for (int i = 3; i > 0; i--) {
            System.out.print("The path branches: ");
            String s = sc.nextLine();
            secret_Exit_ending += s.charAt(0);
        }

        if (secret_Exit_ending == 228)
        {
            System.out.println("secret ending ");
        }
    else {
            // Scene 2 boss fight
            System.out.println("You travel through the woods until you find a door in a cliff.");
            System.out.println("The door is locked when you try to open it you see a key hole.");
            System.out.println("You wonder what treasures you could be inside of the door.");
            System.out.println("You realise that you cant do anything with the door for now so you decide to leave.");
            System.out.println("Maybe the next person you ask will know about the door.");
            System.out.println("As you decide to go back to the trail and leave something attacks you.");

        }
    }
}
