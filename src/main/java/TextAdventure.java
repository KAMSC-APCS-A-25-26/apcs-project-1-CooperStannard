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
            // title
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
            System.out.println("You decide to travel in a random direction until you reach something or you parish.");
            System.out.println("You travel for a while until you find a path. The path branches multiple times so chose which direction to travel.");
            System.out.println("(left-L right-R straight-S)\n");

            // for loop to see if you find the secret ending to get secret ending do L three times
            int secret_Exit_ending = 0;
            for (int i = 3; i > 0; i--)
            {
                System.out.print("You find nothing and the path branches again: ");
                String string_For_Secret_Ending = sc.nextLine();
                if (!string_For_Secret_Ending.isEmpty())
                {
                    secret_Exit_ending += string_For_Secret_Ending.charAt(0);
                }
            }

            if (secret_Exit_ending == 228 || secret_Exit_ending == 324) {
                System.out.println("\nAs you find a clearing in the woods you approach a farm.");
                System.out.println("When you go up to the farm a woman exits the house and asks what you are and what you are doing.");
                System.out.println("You say you don't know who you are and all you want is some food for your hunger and maybe some shelter.");
                System.out.println("She takes you inside his house and gives you food.");
                System.out.println("Her husband just died and she doesn't have any children.");
                System.out.println("She asks for you to help around the farm until you are ready to leave.");
                System.out.println("As you go through life you never find a reason to leave and go old and die on the farm.");

                System.out.print("\nDo you want to play again (Y or N): ");
                boolean runRun = true;
                while (runRun) {
                    String runAgain = sc.nextLine();
                    if (runAgain.equalsIgnoreCase("N")) {
                        run = false;
                        runRun = false;
                    } else if (runAgain.equalsIgnoreCase("Y")) {
                        runRun = false;
                    } else {
                        System.out.print("Incorrect input type again: ");
                    }
                }
            } else {
                int hp = 15;
                int wolfhp = 15;

                // Scene 2 weird door
                System.out.println
                        ("      ______\n" +
                        "   ,-' ;  ! `-.\n" +
                        "  / :  !  :  . \\\n" +
                        " |_ ;   __:  ;  |\n" +
                        " )| .  :)(.  !  |\n" +
                        " |\"    (##)  _  |\n" +
                        " |  :  ;`'  (_) (\n" +
                        " |  :  :  .     |\n" +
                        " )_ !  ,  ;  ;  |\n" +
                        " || .  .  :  :  |\n" +
                        " |\" .  |  :  .  |\n" +
                        " |mt-2_;----.___|\n");

                System.out.println("You travel through the woods until you find a door in a cliff.");
                System.out.println("The door is locked when you try to open it you see a key hole.");
                System.out.println("You wonder what treasures you could be inside of the door.");
                System.out.println("You realise that you cant do anything with the door for now so you decide to leave.");
                System.out.println("Maybe the next person you ask will know about the door.");

                // scene 3 first fight
                System.out.println("\nAs you decide to go back to the trail and leave something attacks you.");
                System.out.println("It does three health");
                System.out.println("your Hp goes from " + hp + " to " + (hp - 3));

                System.out.println(
                        "\n                              __\n" +
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

                boolean runRun2 = true;
                while (runRun2) {
                    String fightORpacifist = sc.nextLine();
                    boolean isPacifist;
                    if (fightORpacifist.equalsIgnoreCase("R")) {
                        isPacifist = true;

                        System.out.println("\nYou decide that killing the wolf is not the correct thing to do.");
                        System.out.println("You don't want to kill an innocent creature.");

                        // this if statement gets a cheat solution and random chance of failing
                        System.out.print("You start running away but there is a tree in the way you have to jump over (type jump): ");
                        String cheat_Jump = sc.nextLine();
                        int randInt = rand.nextInt(3);

                        if (cheat_Jump.equalsIgnoreCase("jump") && randInt == 1 || cheat_Jump.equals("cheat")) {
                            System.out.println("you made the jump and continued running away from the wolf");
                        } else {
                            System.out.println("\nYou tripped and fell.");
                            hp = 0;
                        }
                        runRun2 = false;
                    } else if (fightORpacifist.equalsIgnoreCase("F")) {
                        isPacifist = false;
                        System.out.println("\nYou have decided to fight the wolf it is either him or me and I want to live.");
                        System.out.println("\nDo you chose to block or attack the wolf (if incorrect input you do nothing)");
                        System.out.println("You gain 2 Hp each round through passive recovery and deal between 1-5 damage");
                        System.out.println("The wolf does 0-5 damage, if you block it heals 2 hp.");

                        while (hp > 0 && wolfhp > 0) {
                            System.out.println("\nYour Hp is: " + hp + " The wolf's is " + wolfhp);
                            System.out.print("Attack-A or Block-B: ");
                            String action = sc.nextLine();
                            if (action.equalsIgnoreCase("cheat")) {
                                wolfhp = 0;
                            } else if (action.equalsIgnoreCase("A")) {
                                int attack = rand.nextInt(5) + 1;
                                wolfhp -= attack;
                            } else if (action.equalsIgnoreCase("B")) {
                                hp += 2;
                            }
                            int damage = rand.nextInt(6);
                            hp -= damage;
                            hp += 2;
                        }
                        runRun2 = false;
                    }
                    else
                    {
                        System.out.print("Invalid input type again: ");
                    }
                }
                if (wolfhp <= 0) {
                    System.out.println("You have killed the wolf");
                }
                if (hp <= 0) {
                    System.out.println("\nYou have died after the wolf ate you");
                    System.out.print("Do you want to play again (Y or N): ");

                    boolean runRun3 = true;
                    while (runRun3)
                    {
                        String runAgain = sc.nextLine();

                        if (runAgain.equalsIgnoreCase("N")) {
                            run = false;
                            runRun3 =false;
                        }
                        else if (runAgain.equalsIgnoreCase("Y"))
                        {
                            runRun3 = false;
                        }
                        else
                        {
                            System.out.print("incorrect input type again: ");
                        }
                    }
                }
                else
                {
                    System.out.println("\nYou got away from the wolf.");

                    // scene 4 walk to town
                    System.out.println("You find yourself in a situation similar to when you woke up,");
                    System.out.println("but now you are hungry and very tired.");
                    System.out.println("You find there is no choice but to follow the path until you reach civilisation.");
                    System.out.println("The path branches multiple times so chose which direction to travel.");
                    System.out.println("You start to travel on the path. (left-L right-R straight-S)\n");

                    int valueWayBack = 0;
                    for (int i = 4; i > 0; i--)
                    {
                        System.out.print("You find nothing and the path branches again: ");
                        String stringWayBack = sc.nextLine();
                        if (!stringWayBack.isEmpty())
                        {
                            valueWayBack += stringWayBack.charAt(0);
                        }
                    }
                    System.out.println("\nRemember the things you put here. (capitalisation matters)");

                    // scene 4 arriving at town
                    System.out.println
                            ("~         ~~          __\n" +
                            "       _T      .,,.    ~--~ ^^\n" +
                            " ^^   // \\                    ~\n" +
                            "      ][O]    ^^      ,-~ ~\n" +
                            "   /''-I_I         _II____\n" +
                            "__/_  /   \\ ______/ ''   /'\\_,__\n" +
                            "  | II--'''' \\,--:--..,_/,.-{ },\n" +
                            "; '/__\\,.--';|   |[] .-.| O{ _ }\n" +
                            ":' |  | []  -|   ''--:.;[,.'\\,/\n" +
                            "'  |[]|,.--'' '',   ''-,.    |\n" +
                            "  ..    ..-''    ;       ''. '");

                    System.out.println("In the distance you see a town approaching");
                    System.out.println("When you approached it you were approached by a concerned townsperson.");
                    System.out.println("He saw your disheveled appearance and invited to to eat and stay at his house until you were back on your feet.");
                    System.out.println("After the first night in town you asked its residence if they knew about the door.");
                    System.out.println("They did but people don't go to it because it was locked and the area was dangerous.");

                    // scene 5 learning about and getting key
                    System.out.println("One person even pointed you to a sketchy shop who claimed to sell a key to the door.");
                    System.out.println("When you asked to see the key the shopkeeper told to that you need to buy it for 100 gold");
                    System.out.println
                            ("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⢯⠙⠩⠀⡇⠊⠽⢖⠆⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠱⣠⠀⢁⣄⠔⠁⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⣷⣶⣾⣾⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⢀⡔⠙⠈⢱⡟⣧⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⡠⠊⠀⠀⣀⡀⠀⠘⠕⢄⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⢀⠞⠀⠀⢀⣠⣿⣧⣀⠀⠀⢄⠱⡀⠀⠀⠀\n" +
                            "⠀⠀⡰⠃⠀⠀⢠⣿⠿⣿⡟⢿⣷⡄⠀⠑⢜⢆⠀⠀\n" +
                            "⠀⢰⠁⠀⠀⠀⠸⣿⣦⣿⡇⠀⠛⠋⠀⠨⡐⢍⢆⠀\n" +
                            "⠀⡇⠀⠀⠀⠀⠀⠙⠻⣿⣿⣿⣦⡀⠀⢀⠨⡒⠙⡄\n" +
                            "⢠⠁⡀⠀⠀⠀⣤⡀⠀⣿⡇⢈⣿⡷⠀⠠⢕⠢⠁⡇\n" +
                            "⠸⠀⡕⠀⠀⠀⢻⣿⣶⣿⣷⣾⡿⠁⠀⠨⣐⠨⢀⠃\n" +
                            "⠀⠣⣩⠘⠀⠀⠀⠈⠙⣿⡏⠁⠀⢀⠠⢁⡂⢉⠎⠀\n" +
                            "⠀⠀⠈⠓⠬⢀⣀⠀⠀⠈⠀⠀⠀⢐⣬⠴⠒⠁⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("So you decide to walk around the streets of the town and pick up all of the lost gold to buy the key");

                    boolean hasKey = false;
                    int coins = 0;
                    boolean runRun4 = true;
                    while (runRun4) {
                        System.out.println("\n----What to do in town----");
                        System.out.println("You have " + hp + " Hp and " + coins + " gold");
                        System.out.println("1. Collect coins (chance to find coins or get mugged)");
                        System.out.println("2. Rest at house (heal 5 hp)");
                        System.out.println("3. Go to shopkeeper");
                        System.out.println("4. Leave town to unlock door");

                        System.out.print("What do you chose to do (1, 2, 3, or 4): ");
                        String whatDo = sc.nextLine();

                        switch (whatDo) {
                            case "1":
                                int getMugged = rand.nextInt(3);
                                if (getMugged == 1)
                                {
                                    System.out.println("You are being mugged.");
                                    if (isPacifist){

                                    }



                                }

                                else{
                                    int coinUp = rand.nextInt(20)+1;
                                    coins += coinUp;
                                    System.out.println("\nYour coins went up by " + coinUp + " coins");
                                }

                                break;
                            case "2":
                                hp += 5;
                                if (hp >= 15) {
                                    hp = 15;
                                }
                                System.out.println("\nYou rested at the house increasing your Hp");
                                break;
                            case "3":
                                if (coins <= 100) {
                                    System.out.println("\nYou don't have enough coins to buy the key.");
                                } else {
                                    System.out.print("\nDo you want to buy the key(Yes-Y No-N): ");
                                    boolean runRun5 = true;
                                    while (runRun5) {
                                        String getKey = sc.nextLine();

                                        if (getKey.equalsIgnoreCase("N")) {
                                            runRun5 = false;
                                            System.out.println("You left the shop without buying anything.");
                                        } else if (getKey.equalsIgnoreCase("Y")) {
                                            runRun5 = false;
                                            coins -= 100;
                                            hasKey = true;
                                            System.out.println("You lost 100 coins and bought the key.");
                                        } else {
                                            System.out.print("incorrect input type again: ");
                                        }
                                    }
                                }
                                break;
                            case "4":

                                break;
                            case "cheat":
                                coins += 100;
                                System.out.println("\nYou have gained 100 coins.");
                                break;

                        }
                    }


                }
            }
        }
    }
}
