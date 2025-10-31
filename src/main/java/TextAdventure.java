import java.util.Scanner;
import java.util.Random;

public class TextAdventure
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean run = true;
        while(run)
        {
        // need to put title here ASCII of name
        System.out.println(
                "███████╗ ██████╗ ██████╗ ███████╗███████╗████████╗                           \n" +
                "██╔════╝██╔═══██╗██╔══██╗██╔════╝██╔════╝╚══██╔══╝                           \n" +
                "█████╗  ██║   ██║██████╔╝█████╗  ███████╗   ██║                              \n" +
                "██╔══╝  ██║   ██║██╔══██╗██╔══╝  ╚════██║   ██║                              \n" +
                "██║     ╚██████╔╝██║  ██║███████╗███████║   ██║                              \n" +
                "╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚══════╝   ╚═╝                              \n" +
                "                                                                             \n" +
                " █████╗ ██████╗ ██╗   ██╗███████╗███╗   ██╗████████╗██╗   ██╗██████╗ ███████╗\n" +
                "██╔══██╗██╔══██╗██║   ██║██╔════╝████╗  ██║╚══██╔══╝██║   ██║██╔══██╗██╔════╝\n" +
                "███████║██║  ██║██║   ██║█████╗  ██╔██╗ ██║   ██║   ██║   ██║██████╔╝█████╗  \n" +
                "██╔══██║██║  ██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║   ██║   ██║   ██║██╔══██╗██╔══╝  \n" +
                "██║  ██║██████╔╝ ╚████╔╝ ███████╗██║ ╚████║   ██║   ╚██████╔╝██║  ██║███████╗\n" +
                "╚═╝  ╚═╝╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═══╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝\n");

        // scene 1 getting out of the forest
        System.out.println("\nYour wake up in the middle of a forest with no memory of who you are or where you are.");
        System.out.println("You decide to travel in a random direction untile you reach something or you parish.");
        System.out.println("Your travel for a while until you find a path. The path branches multiple tiles so chose which direction to travel.");
        System.out.println("\nCapitalisation matters (left-L right-R straight-S)");

        // for loop to see if you find the secret ending to get secret ending do L three times
        int secret_Exit_ending = 0;
        for (int i = 3; i > 0; i--) {
            System.out.print("You find nothing and the path branches again: ");
            String string_For_Secret_Ending = sc.nextLine();
            secret_Exit_ending += string_For_Secret_Ending.charAt(0);
        }

        if (secret_Exit_ending == 228)
        {
            System.out.println("secret ending ");
            System.out.print("Do you want to play again (Y or N): ");
            String runAgain = sc.nextLine();
            if (runAgain.equalsIgnoreCase("N"))
            {
                run = false;
            }
        }
        else {
            int hp = 15;
            int wolfhp = 15;

            // Scene 2 boss fight
            System.out.println("\nYou travel through the woods until you find a door in a cliff.");
            System.out.println("The door is locked when you try to open it you see a key hole.");
            System.out.println("You wonder what treasures you could be inside of the door.");
            System.out.println("You realise that you cant do anything with the door for now so you decide to leave.");
            System.out.println("Maybe the next person you ask will know about the door.");
            System.out.println("As you decide to go back to the trail and leave something attacks you.");
            System.out.println("It does three health");
            System.out.println("your Hp goes from " + hp + " to " + (hp - 3));

            System.out.println(
                    "                              __\n" +
                            "                            .d$$b\n" +
                            "                          .' TO$;\\\n" +
                            "                         /  : TP._;\n" +
                            "                        / _.;  :Tb|\n" +
                            "                       /   /   ;j$j\n" +
                            "                   _.-\"       d$$$$\n" +
                            "                 .' ..       d$$$$;\n" +
                            "                /  /P'      d$$$$P. |\\\n" +
                            "               /   \"      .d$$$P' |\\^\"l\n" +
                            "             .'           `T$P^\"\"\"\"\"  :\n" +
                            "         ._.'      _.'                ;\n" +
                            "      `-.-\".-'-' ._.       _.-\"    .-\"\n" +
                            "    `.-\" _____  ._              .-\"\n" +
                            "   -(.g$$$$$$$b.              .'\n" +
                            "     \"\"^^T$$$P^)            .(:\n" +
                            "       _/  -\"  /.'         /:/;\n" +
                            "    ._.'-'`-'  \")/         /;/;\n" +
                            " `-.-\"..--\"\"   \" /         /  ;\n" +
                            ".-\" ..--\"\"        -'          :\n" +
                            "..--\"\"--.-\"         (\\      .-(\\\n" +
                            "  ..--\"\"              `-\\(\\/;`\n" +
                            "    _.                      :\n" +
                            "                            ;`-\n" +
                            "                           :\\\n" +
                            "                           ;  ");

            System.out.println("\nYou see that a wolf is attacking you.");
            System.out.println("You have a better change if you fight if off or you can run");
            System.out.print("What will you do run or fight(Run-R, Fight-F): ");

            String String_fightORpacifist = sc.nextLine();
            int fightORpacifist = String_fightORpacifist.charAt(0);

            if (fightORpacifist == 82) {

                boolean isPacifist = true;

                System.out.println("\nYou decide that killing the wolf is not the correct thing to do.");
                System.out.println("You don't want to kill an innocent creature.");

                // this if statement gets a cheat solution and random chance of failing
                System.out.print("You start running away but there is a tree in the way you have to jump over (type jump): ");
                String cheat_Jump = sc.nextLine();
                int randInt = rand.nextInt(3);

                if (cheat_Jump.equalsIgnoreCase("jump") && randInt == 1 || cheat_Jump.equals("cheat"))
                {
                    System.out.println("you made the jump and continued running away from the wolf");
                }
                else
                {
                    System.out.println("\nYou tripped and fell.");
                    hp = 0;
                }
            }
            else
            {
                boolean isPacifist = false;
                System.out.println("\nYou have decided to fight the wolf it is either him or me and I want to live.");
                System.out.println("\nDo you chose to block or attack the wolf (if incorrect input you do nothing)");
                System.out.println("You gain 2 Hp each round through passive recovery and deal between 1-5 damage");
                System.out.println("The wolf does 0-5 damage, if you block it heals 2 hp");
                while (hp>0 && wolfhp>0)
                {
                    System.out.println("\nYour Hp is: " + hp + " The wolf's is " + wolfhp);
                    System.out.print("Attack-A or Block-B: ");
                    String action = sc.nextLine();
                    if (action.equalsIgnoreCase("cheat"))
                    {
                        wolfhp = 0;
                    }
                    else if (action.equalsIgnoreCase("A"))
                    {
                        int attack = rand.nextInt(5) + 1;
                        wolfhp -= attack;
                    }
                    else if(action.equalsIgnoreCase("B"))
                    {
                        hp += 2;
                    }
                    int damage = rand.nextInt(6);
                    hp -= damage;
                    hp +=2;
                }
            }
            if (wolfhp == 0)
            {
                System.out.println("You have killed the wolf");
            }
            if (hp <= 0)
            {
                System.out.println("\nYou have died after the wolf ate you");
                System.out.print("Do you want to play again (Y or N): ");
                String runAgain = sc.nextLine();
                if (runAgain.equalsIgnoreCase("N"))
                {
                    run = false;
                }
            }
            System.out.println("You got away from the wolf YAY");
        }
        }
    }
}
