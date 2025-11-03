import java.util.Scanner;
import java.util.Random;

public class TextAdventure
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean run = true;
        boolean isPacifist = false;

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
            System.out.println("You decide to travel in a random direction until you reach something or you perish.");
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
                System.out.println
                        ("\n                           (   )\n" +
                        "                          (    )\n" +
                        "                           (    )\n" +
                        "                          (    )\n" +
                        "                            )  )\n" +
                        "                           (  (                  /\\\n" +
                        "                            (_)                 /  \\  /\\\n" +
                        "                    ________[_]________      /\\/    \\/  \\\n" +
                        "           /\\      /\\        ______    \\    /   /\\/\\  /\\/\\\n" +
                        "          /  \\    //_\\       \\    /\\    \\  /\\/\\/    \\/    \\\n" +
                        "   /\\    / /\\/\\  //___\\       \\__/  \\    \\/\n" +
                        "  /  \\  /\\/    \\//_____\\       \\ |[]|     \\\n" +
                        " /\\/\\/\\/       //_______\\       \\|__|      \\\n" +
                        "/      \\      /XXXXXXXXXX\\                  \\\n" +
                        "        \\    /_I_II  I__I_\\__________________\\\n" +
                        "               I_I|  I__I_____[]_|_[]_____I\n" +
                        "               I_II  I__I_____[]_|_[]_____I\n" +
                        "               I II__I  I     XXXXXXX     I\n" +
                        "            ~~~~~\"   \"~~~~~~~~~~~~~~~~~~~~~~~~\n");

                System.out.println("As you find a clearing in the woods you approach a farm.");
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
                System.out.println("You realise that you can't do anything with the door for now so you decide to leave.");
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
                System.out.println("You have a better chance if you fight if off or you can run");
                System.out.print("What will you do run or fight (Run-R, Fight-F): ");

                boolean runRun2 = true;
                while (runRun2) {
                    String fightOrPacifist = sc.nextLine();
                    if (fightOrPacifist.equalsIgnoreCase("R")) {
                        isPacifist = true;

                        System.out.println("\nYou decide that killing the wolf is not the correct thing to do.");
                        System.out.println("You don't want to kill an innocent creature.");

                        // this if statement gets a cheat solution and random chance of failing
                        System.out.print("You start running away but there is a tree in the way you have to jump over (type jump): ");
                        String cheatJump = sc.nextLine();
                        int randInt = rand.nextInt(3);

                        if (cheatJump.equalsIgnoreCase("jump") && randInt == 1 || cheatJump.equals("cheat")) {
                            System.out.println("You made the jump and continued running away from the wolf.");
                        } else {
                            System.out.println("\nYou tripped and fell.");
                            hp = 0;
                        }
                        runRun2 = false;
                    } else if (fightOrPacifist.equalsIgnoreCase("F")) {
                        System.out.println("\nYou have decided to fight the wolf it is either him or me and I want to live.");
                        System.out.println("\nDo you chose to block or attack the wolf (if incorrect input you do nothing)");
                        System.out.println("You gain 2 Hp each round through passive recovery and deal between 1-5 damage");
                        System.out.println("The wolf does 0-5 damage, if you block it heals 2 hp.");
                        isPacifist =false;

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
                    System.out.println("You have killed the wolf.");
                }
                if (hp <= 0)
                {
                    System.out.println("\nYou have died after the wolf ate you.");
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
                            System.out.print("Incorrect input type again: ");
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

                    // battle/minigame 1
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
                    boolean dead = false;

                    // minigame 2 getting gold and avoiding mugger
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
                                    System.out.println("\nYou are being mugged.");
                                    // if you chose to be a pacifist you get this route
                                    if (isPacifist){
                                        System.out.println("you decide to run away from the mugger like you did the wolf");
                                        int chanceMugged = rand.nextInt(2);
                                        if (chanceMugged == 1){
                                            System.out.println("You did not get away and you lost 10 health and 20 coins");
                                            hp -= 10;
                                            coins -= 20;
                                            if (coins <0){
                                                coins = 0;
                                            }
                                        } else {
                                            System.out.println("You got away from the mugger without a scratch.");
                                        }
                                    }
                                    // if you didn't choose to be a pacifist you get this route
                                    else{
                                        System.out.println("You decide to attack the mugger.");
                                        int chanceMugged = rand.nextInt(3);
                                        if (chanceMugged == 1)
                                        {
                                            int muggerHp = 15;
                                            System.out.println("\nDo you chose to block or attack the Mugger (if incorrect input you do nothing)");
                                            System.out.println("You gain 2 Hp each round through passive recovery and deal between 1-5 damage");
                                            System.out.println("The mugger does 0-10 damage, if you block it heals 4 hp.");

                                            while (hp > 0 && muggerHp > 0)
                                            {
                                                System.out.println("\nYour Hp is: " + hp + " The mugger's is " + muggerHp);
                                                System.out.print("Attack-A or Block-B: ");
                                                String action = sc.nextLine();
                                                if (action.equalsIgnoreCase("cheat")) {
                                                    muggerHp = 0;
                                                } else if (action.equalsIgnoreCase("A")) {
                                                    int attack = rand.nextInt(5) + 1;
                                                    muggerHp -= attack;
                                                } else if (action.equalsIgnoreCase("B")) {
                                                    hp += 4;
                                                }
                                                int damage = rand.nextInt(11);
                                                hp -= damage;
                                                hp += 2;
                                            }
                                            if (muggerHp <=0){
                                                System.out.println("You have defeated the mugger and get to keep your gold");
                                            }

                                        } else {
                                            System.out.println("Because you tried to attack the mugger he got scared and ran away.");
                                        }
                                    }
                                }

                                else{
                                    int coinUp = rand.nextInt(20)+1;
                                    coins += coinUp;
                                    System.out.println("\nYour coins went up by " + coinUp + " coins");
                                }
                                if (hp <= 0)
                                {
                                    System.out.println("\nYou have died in the town");
                                    System.out.print("Do you want to play again (Y or N): ");

                                    boolean runRun7 = true;
                                    while (runRun7)
                                    {
                                        String runAgain2 = sc.nextLine();

                                        if (runAgain2.equalsIgnoreCase("N")) {
                                            run = false;
                                            runRun7 =false;
                                            runRun4 = false;
                                            dead = true;

                                        }
                                        else if (runAgain2.equalsIgnoreCase("Y"))
                                        {
                                            runRun7 = false;
                                            runRun4 = false;
                                            dead = true;
                                        }
                                        else
                                        {
                                            System.out.print("Incorrect input type again: ");
                                        }
                                    }
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
                                if (coins < 99) {
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
                                    if (!hasKey)
                                    {
                                        System.out.println("\nYou don't have the key to unlock the door.");
                                    }else{
                                        System.out.println("\nWhat is the way back to the door");
                                        System.out.print("(you need to add the char value that you entered to get to the town from the door): ");

                                        String guess = sc.nextLine();
                                        String sValueWayBack = String.valueOf(valueWayBack);
                                        if (guess.equals(sValueWayBack) || guess.equalsIgnoreCase("cheat")) {
                                            runRun4 = false;
                                        } else {
                                            System.out.println("You don't remember the way back");
                                        }
                                    }
                                break;
                            case "cheat":
                                coins += 100;
                                System.out.println("\nYou have gained 100 coins.");
                                break;

                        }


                    }
                    if (!dead) {
                        // scene 6 opening the door
                        System.out.println("\nYou have left the town to go unlock the door.");
                        System.out.println("After remembering the way back you had little trouble getting back to the door.");
                        System.out.println("As you put the key in the lock you amazingly hear the door unlock and it swing open.");
                        System.out.println("You were discouraged a little when you saw a long hall way for as far as you could see.");
                        System.out.println("You were also eager to find out what was at the end of it.");
                        // scene 7 going down the hall and finding a monster
                        System.out.println("You made yourself a torch and set off down the long hallway.");
                        System.out.println("When you reach the end of the hall you were discouraged at finding another door.\n");

                        System.out.println
                                ("88888888888888888888888888888888888888888888888888888888888888888888888\n" +
                                "88.._|      | `-.  | `.  -_-_ _-_  _-  _- -_ -  .'|   |.'|     |  _..88\n" +
                                "88   `-.._  |    |`!  |`.  -_ -__ -_ _- _-_-  .'  |.;'   |   _.!-'|  88\n" +
                                "88      | `-!._  |  `;!  ;. _______________ ,'| .-' |   _!.i'     |  88\n" +
                                "88..__  |     |`-!._ | `.| |_______________||.\"'|  _!.;'   |     _|..88\n" +
                                "88   |``\"..__ |    |`\";.| i|_|MMMMMMMMMMM|_|'| _!-|   |   _|..-|'    88\n" +
                                "88   |      |``--..|_ | `;!|l|MMoMMMMoMMM|1|.'j   |_..!-'|     |     88\n" +
                                "88   |      |    |   |`-,!_|_|MMMMP'YMMMM|_||.!-;'  |    |     |     88\n" +
                                "88___|______|____!.,.!,.!,!|d|MMMo * loMM|p|,!,.!.,.!..__|_____|_____88\n" +
                                "88      |     |    |  |  | |_|MMMMb,dMMMM|_|| |   |   |    |      |  88\n" +
                                "88      |     |    |..!-;'i|r|MPYMoMMMMoM|r| |`-..|   |    |      |  88\n" +
                                "88      |    _!.-j'  | _!,\"|_|M)(MMMMoMMM|_||!._|  `i-!.._ |      |  88\n" +
                                "88     _!.-'|    | _.\"|  !;|1|MbdMMoMMMMM|l|`.| `-._|    |``-.._  |  88\n" +
                                "88..-i'     |  _.''|  !-| !|_|MMMoMMMMoMM|_|.|`-. | ``._ |     |``\"..88\n" +
                                "88   |      |.|    |.|  !| |u|MoMMMMoMMMM|n||`. |`!   | `\".    |     88\n" +
                                "88   |  _.-'  |  .'  |.' |/|_|MMMMoMMMMoM|_|! |`!  `,.|    |-._|     88\n" +
                                "88  _!\"'|     !.'|  .'| .'|[@]MMMMMMMMMMM[@] \\|  `. | `._  |   `-._  88\n" +
                                "88-'    |   .'   |.|  |/| /                 \\|`.  |`!    |.|      |`-88\n" +
                                "88      |_.'|   .' | .' |/                   \\  \\ |  `.  | `._    |  88\n" +
                                "88     .'   | .'   |/|  /                     \\ |`!   |`.|    `.  |  88\n" +
                                "88  _.'     !'|   .' | /                       \\|  `  |  `.    |`.|  88\n" +
                                "88 vanishing point 888888888888888888888888888888888888888888888 fL 888");

                        System.out.println("\nThat's when the way was shut off behind you and a monster formed in front of you");
                        System.out.println("There was nowhere to run and it seemed keen on hurting you");
                        System.out.println
                                ("              /|                                           |\\\n" +
                                "             /||             ^               ^             ||\\\n" +
                                "            / \\\\__          //               \\\\          __// \\\n" +
                                "           /  |_  \\         | \\   /     \\   / |         /  _|  \\\n" +
                                "          /  /  \\  \\         \\  \\/ \\---/ \\/  /         /  /     \\\n" +
                                "         /  /    |  \\         \\  \\/\\   /\\/  /         /  |       \\\n" +
                                "        /  /     \\   \\__       \\ ( 0\\ /0 ) /       __/   /        \\\n" +
                                "       /  /       \\     \\___    \\ \\_/|\\_/ /    ___/     /\\         \\\n" +
                                "      /  /         \\_)      \\___ \\/-\\|/-\\/ ___/      (_/\\ \\      `  \\\n" +
                                "     /  /           /\\__)       \\/  oVo  \\/       (__/   ` \\      `  \\\n" +
                                "    /  /           /,   \\__)    (_/\\ _ /\\_)    (__/         `      \\  \\\n" +
                                "   /  '           //       \\__)  (__V_V__)  (__/                    \\  \\\n" +
                                "  /  '  '        /'           \\   |{___}|   /         .              \\  \\\n" +
                                " /  '  /        /              \\/ |{___}| \\/\\          `              \\  \\\n" +
                                "/     /        '       .        \\/{_____}\\/  \\          \\    `         \\  \\\n" +
                                "     /                ,         /{_______}\\   \\          \\    \\         \\\n" +
                                "                     /         /{___/_\\___}\\   `Adrian Elhart\n");
                        boolean dead2 =true;
                        if (isPacifist){
                            // scene 8 how the monster responds to you (give you gold or attack you
                            System.out.println("The monster starts to speak.");
                            System.out.println("You have a virtuous heart, I have seen you not fight when it might have been easier to.");
                            System.out.println("Because of this I will let you past the door and take some treasure.");
                            System.out.println(
                                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                                    "⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⡏⠻⣿⣿⣿⣿⠏⠀⢸⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿\n" +
                                    "⣿⣿⣿⣿⡀⠙⢿⣿⣿⣿⡇⠀⠈⢿⣿⠋⠀⠀⠸⣿⣿⠟⢡⣿⣿⣿⠿⢫⣿⣿\n" +
                                    "⣿⣿⣿⣿⣧⠀⠀⠙⢿⣿⡇⠀⢀⣀⣁⣀⣀⡀⠀⠛⠁⢠⣿⠿⠋⠁⢀⣿⣿⣿\n" +
                                    "⣿⣿⠙⢿⣿⣇⠀⠀⠀⠉⠀⢠⡟⠉⠉⠉⠉⢻⡄⠀⠀⠋⠀⠀⠀⠀⣾⣿⣿⣿\n" +
                                    "⣿⣿⡆⠀⠈⠻⡄⠀⢀⣶⠶⠾⠷⢶⣶⣶⡶⠾⠷⠶⣶⡀⠀⠀⠀⣼⠟⠋⠁⣿\n" +
                                    "⣿⣿⣧⠀⠀⢀⣀⣀⣼⣇⣀⣀⣀⣀⣿⣿⣀⣀⣀⣀⣸⣧⣀⣀⡈⠀⠀⠀⠀⣿\n" +
                                    "⣿⠉⠋⠀⠀⣾⠋⠉⠉⠉⠙⣿⡟⠉⠉⠉⠉⢻⣿⠋⠉⠉⠉⠙⣷⠀⠀⠀⠀⣿\n" +
                                    "⣿⠀⣼⠟⠛⠛⠛⢿⣿⡿⠛⠛⠛⠻⣿⣿⠟⠛⠛⠛⢿⣿⡿⠛⠛⠛⠻⣧⠀⣿\n" +
                                    "⣿⣴⣿⣤⣤⣤⣤⣼⣿⣧⣤⣤⣤⣤⣿⣿⣤⣤⣤⣤⣼⣿⣧⣤⣤⣤⣤⣿⣦⣿\n" +
                                    "⣿⠀⠀⠀⣿⣿⡁⠀⠀⠀⢈⣿⣏⠀⠀⠀⠀⣹⣿⡁⠀⠀⠀⢈⣿⣿⠀⠀⠀⣿\n" +
                                    "⣿⣿⣿⠋⠉⠉⠉⢻⣿⡟⠉⠉⠉⠙⣿⣿⠋⠉⠉⠉⢻⣿⡟⠉⠉⠉⠙⣿⣿⣿\n" +
                                    "⣿⣿⣿⣶⣶⣶⣶⣾⣿⣷⣶⣶⣶⣶⣿⣿⣶⣶⣶⣶⣾⣿⣷⣶⣶⣶⣶⣿⣿⣿");
                            System.out.println("you have gained 5000 gold. You have " +(coins+5000) +" gold.");

                        } else {
                            // minigame 3 fighting monster
                            System.out.println("You braced yourself up for a fight.");
                            System.out.println("If you want to live you will need to be focused and lucky.");
                            int monsterHp = 50;
                            hp = 25;
                            System.out.println("\nDo you chose to block or attack the monster. (if incorrect input you do nothing)");
                            System.out.println("You gain 5 Hp each round through passive recovery and deal between 1-10 damage");
                            System.out.println("The monster does 0-10 damage and increases by 1 each round, if you block it heals 10 hp.");
                            for (int k=1; k>0; k += 1)
                            {
                                if (hp > 0 && monsterHp > 0) {
                                    System.out.println("\nYour Hp is: " + hp + " The monster's is " + monsterHp);
                                    System.out.print("Attack-A or Block-B: ");
                                    String action = sc.nextLine();
                                    if (action.equalsIgnoreCase("cheat")) {
                                        monsterHp = 0;
                                    } else if (action.equalsIgnoreCase("A")) {
                                        int attack = rand.nextInt(10) + 1;
                                        monsterHp -= attack;
                                    } else if (action.equalsIgnoreCase("B")) {
                                        hp += 10;
                                    }
                                    int damage = rand.nextInt(10) + k;
                                    hp -= damage;
                                    hp += 5;
                                }else {
                                    k =-1;
                                }
                            }
                            if (hp <= 0) {
                                System.out.println("\nYou have died fighting the monster.");
                                System.out.print("Do you want to play again (Y or N): ");

                                boolean runRun8 = true;
                                while (runRun8) {
                                    String runAgain2 = sc.nextLine();

                                    if (runAgain2.equalsIgnoreCase("N")) {
                                        run = false;
                                        runRun8 = false;
                                        dead2 = false;
                                    } else if (runAgain2.equalsIgnoreCase("Y")) {
                                        runRun8 = false;
                                        dead2 = false;

                                    } else {
                                        System.out.print("incorrect input type again: ");
                                    }
                                }
                            } else {
                                System.out.println("\nYou have slain the monster!");
                                System.out.println("But you don't know how to open the door so this trip was a waste of time.");
                            }
                        }
                        if (dead2) {
                            System.out.println("\n" +
                                            "████████╗██╗  ██╗███████╗    ███████╗███╗   ██╗██████╗ \n" +
                                            "╚══██╔══╝██║  ██║██╔════╝    ██╔════╝████╗  ██║██╔══██╗\n" +
                                            "   ██║   ███████║█████╗      █████╗  ██╔██╗ ██║██║  ██║\n" +
                                            "   ██║   ██╔══██║██╔══╝      ██╔══╝  ██║╚██╗██║██║  ██║\n" +
                                            "   ██║   ██║  ██║███████╗    ███████╗██║ ╚████║██████╔╝\n" +
                                            "   ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚══════╝╚═╝  ╚═══╝╚═════╝ \n");

                            System.out.print("Do you want to play again (Yes-Y No-N): ");
                            boolean runRun9 = true;
                            while (runRun9) {
                                String runAgain2 = sc.nextLine();

                                if (runAgain2.equalsIgnoreCase("N")) {
                                    run = false;
                                    runRun9 = false;
                                } else if (runAgain2.equalsIgnoreCase("Y")) {
                                    runRun9 = false;
                                } else {
                                    System.out.print("Incorrect input type again: ");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}