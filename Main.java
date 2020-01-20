//package com.company;

import java.util.Scanner;

public class Main
{
    static int noq,dl;

    public static void main(String[] args)//main method to trigger program execution
    {

        System.out.println("\n" +
                "888b     d888          888    888           8888888              8888888888                \n" +
                "8888b   d8888          888    888             888                888                       \n" +
                "88888b.d88888          888    888             888                888                       \n" +
                "888Y88888P888  8888b.  888888 88888b.         888  .d8888b       8888888 888  888 88888b.  \n" +
                "888 Y888P 888     \"88b 888    888 \"88b        888  88K           888     888  888 888 \"88b \n" +
                "888  Y8P  888 .d888888 888    888  888        888  \"Y8888b.      888     888  888 888  888 \n" +
                "888   \"   888 888  888 Y88b.  888  888        888       X88      888     Y88b 888 888  888 \n" +
                "888       888 \"Y888888  \"Y888 888  888      8888888 88888P'      888      \"Y88888 888  888 \n" +
                "                                                                                           \n" +
                "                                                                                           \n" +
                "                                                                                           \n");
         System.out.println("Welcome to Parth's JAVA based maths question Generator ");
        System.out.println("\n" +
                "  _____  _                       ______       _              _______          _               __    ____                  _   _                            \n" +
                " |  __ \\| |                     |  ____|     | |            |__   __|        (_)             / _|  / __ \\                | | (_)                  _        \n" +
                " | |__) | | ___  __ _ ___  ___  | |__   _ __ | |_ ___ _ __     | | ___  _ __  _  ___    ___ | |_  | |  | |_   _  ___  ___| |_ _  ___  _ __  ___  (_)______ \n" +
                " |  ___/| |/ _ \\/ _` / __|/ _ \\ |  __| | '_ \\| __/ _ \\ '__|    | |/ _ \\| '_ \\| |/ __|  / _ \\|  _| | |  | | | | |/ _ \\/ __| __| |/ _ \\| '_ \\/ __|   |______|\n" +
                " | |    | |  __/ (_| \\__ \\  __/ | |____| | | | ||  __/ |       | | (_) | |_) | | (__  | (_) | |   | |__| | |_| |  __/\\__ \\ |_| | (_) | | | \\__ \\  _        \n" +
                " |_|__  |_|\\___|\\__,_|___/\\___| |______|_| |_|\\__\\___|_|       |_|\\___/| .__/|_|\\___|  \\___/|_|    \\___\\_\\\\__,_|\\___||___/\\__|_|\\___/|_| |_|___/ (_)       \n" +
                " /_ \\ \\    /\\      | |   | (_) | (_)                                   | |                                                                                 \n" +
                "  | || |  /  \\   __| | __| |_| |_ _  ___  _ __                         |_|                                                                                 \n" +
                "  | || | / /\\ \\ / _` |/ _` | | __| |/ _ \\| '_ \\                                                                                                            \n" +
                "  | || |/ ____ \\ (_| | (_| | | |_| | (_) | | | |                                                                                                           \n" +
                "  |_|| /_/    \\_\\__,_|\\__,_|_|\\__|_|\\___/|_| |_|                                                                                                           \n" +
                "  __/_/   _____       _     _                  _   _                                                                                                       \n" +
                " |__ \\ \\ / ____|     | |   | |                | | (_)                                                                                                      \n" +
                "    ) | | (___  _   _| |__ | |_ _ __ __ _  ___| |_ _  ___  _ __                                                                                            \n" +
                "   / /| |\\___ \\| | | | '_ \\| __| '__/ _` |/ __| __| |/ _ \\| '_ \\                                                                                           \n" +
                "  / /_| |____) | |_| | |_) | |_| | | (_| | (__| |_| | (_) | | | |                                                                                          \n" +
                " |____| |_____/ \\__,_|_.__/ \\__|_|  \\__,_|\\___|\\__|_|\\___/|_| |_|                                                                                          \n" +
                "  ___/_/  __  __       _ _   _       _ _           _   _                                                                                                   \n" +
                " |___ \\ \\|  \\/  |     | | | (_)     | (_)         | | (_)                                                                                                  \n" +
                "   __) | | \\  / |_   _| | |_ _ _ __ | |_  ___ __ _| |_ _  ___  _ __                                                                                        \n" +
                "  |__ <| | |\\/| | | | | | __| | '_ \\| | |/ __/ _` | __| |/ _ \\| '_ \\                                                                                       \n" +
                "  ___) | | |  | | |_| | | |_| | |_) | | | (_| (_| | |_| | (_) | | | |                                                                                      \n" +
                " |____/| |_|  |_|\\__,_|_|\\__|_| .__/|_|_|\\___\\__,_|\\__|_|\\___/|_| |_|                                                                                      \n" +
                "      /_/                     | |                                                                                                                          \n" +
                "  _  _ __  _____  _       _   |_|                                                                                                                          \n" +
                " | || |\\ \\|  __ \\(_)     (_)   (_)                                                                                                                         \n" +
                " | || |_| | |  | |___   ___ ___ _  ___  _ __                                                                                                               \n" +
                " |__   _| | |  | | \\ \\ / / / __| |/ _ \\| '_ \\                                                                                                              \n" +
                "    | | | | |__| | |\\ V /| \\__ \\ | (_) | | | |                                                                                                             \n" +
                "    |_| | |_____/|_| \\_/ |_|___/_|\\___/|_| |_|                                                                                                             \n" +
                "  _____/_/  _____ _                 _        _       _                     _                                                                               \n" +
                " | ____\\ \\ / ____(_)               | |      (_)     | |                   | |                                                                              \n" +
                " | |__  | | (___  _ _ __ ___  _ __ | | ___   _ _ __ | |_ ___ _ __ ___  ___| |_                                                                             \n" +
                " |___ \\ | |\\___ \\| | '_ ` _ \\| '_ \\| |/ _ \\ | | '_ \\| __/ _ \\ '__/ _ \\/ __| __|                                                                            \n" +
                "  ___) || |____) | | | | | | | |_) | |  __/ | | | | | ||  __/ | |  __/\\__ \\ |_                                                                             \n" +
                " |____/ | |_____/|_|_| |_| |_| .__/|_|\\___| |_|_| |_|\\__\\___|_|  \\___||___/\\__|                                                                            \n" +
                "    ___/_/                   | |                    _   _____          _                _                                                                  \n" +
                "   / /\\ \\    /\\              |_|                   | | |  __ \\        (_)              | |                                                                 \n" +
                "  / /_ | |  /  \\   _ __ ___  __ _    __ _ _ __   __| | | |__) |__ _ __ _ _ __ ___   ___| |_ ___ _ __                                                       \n" +
                " | '_ \\| | / /\\ \\ | '__/ _ \\/ _` |  / _` | '_ \\ / _` | |  ___/ _ \\ '__| | '_ ` _ \\ / _ \\ __/ _ \\ '__|                                                      \n" +
                " | (_) | |/ ____ \\| | |  __/ (_| | | (_| | | | | (_| | | |  |  __/ |  | | | | | | |  __/ ||  __/ |                                                         \n" +
                "  \\___/| /_/    \\_\\_|  \\___|\\__,_|  \\__,_|_| |_|\\__,_| |_|   \\___|_|  |_|_| |_| |_|\\___|\\__\\___|_|                                                         \n" +
                "      /_/                                                                                                                                                  \n" +
                "                                                                                                                                                           \n" +
                "");
        System.out.println("\n" +
                "$$$$$$$$\\ $$$\\   $$$$$$$$\\           $$\\   $$\\     \n" +
                "\\____$$  | \\$$\\  $$  _____|          \\__|  $$ |    \n" +
                "    $$  /   \\$$\\ $$ |      $$\\   $$\\ $$\\ $$$$$$\\   \n" +
                "   $$  /     $$ |$$$$$\\    \\$$\\ $$  |$$ |\\_$$  _|  \n" +
                "  $$  /      $$ |$$  __|    \\$$$$  / $$ |  $$ |    \n" +
                " $$  /      $$  |$$ |       $$  $$<  $$ |  $$ |$$\\ \n" +
                "$$  /     $$$  / $$$$$$$$\\ $$  /\\$$\\ $$ |  \\$$$$  |\n" +
                "\\__/      \\___/  \\________|\\__/  \\__|\\__|   \\____/ \n" +
                "                                                   \n" +
                "                                                   \n" +
                "                                                   \n");


            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
        if (choice == 7)
            exit();
         else {
            System.out.println("\n" +
                    " +-+-+-+-+-+ +-+-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+-+-+\n" +
                    " |E|n|t|e|r| |n|u|m|b|e|r| |o|f| |q|u|e|s|t|i|o|n|s|\n" +
                    " +-+-+-+-+-+ +-+-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+-+-+\n");


            noq = s.nextInt();
            System.out.println("Enter difficulty level(1-5)");
            dl = s.nextInt();

            ConsoleHelper.main();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    si();
                    break;
                case 6:
                    ap();
                    break;

                default:
                    error();

            }


        }
    }



    static void error()//to handle unexpected input from the user
    {
        System.out.println("\n" +
                "$$$$$$$$\\                                                         $$\\      $$\\                                               $$$$$$\\                                 $$\\     \n" +
                "$$  _____|                                                        $$ | $\\  $$ |                                              \\_$$  _|                                $$ |    \n" +
                "$$ |       $$$$$$\\   $$$$$$\\   $$$$$$\\   $$$$$$\\        $$\\       $$ |$$$\\ $$ | $$$$$$\\   $$$$$$\\  $$$$$$$\\   $$$$$$\\          $$ |  $$$$$$$\\   $$$$$$\\  $$\\   $$\\ $$$$$$\\   \n" +
                "$$$$$\\    $$  __$$\\ $$  __$$\\ $$  __$$\\ $$  __$$\\       \\__|      $$ $$ $$\\$$ |$$  __$$\\ $$  __$$\\ $$  __$$\\ $$  __$$\\         $$ |  $$  __$$\\ $$  __$$\\ $$ |  $$ |\\_$$  _|  \n" +
                "$$  __|   $$ |  \\__|$$ |  \\__|$$ /  $$ |$$ |  \\__|                $$$$  _$$$$ |$$ |  \\__|$$ /  $$ |$$ |  $$ |$$ /  $$ |        $$ |  $$ |  $$ |$$ /  $$ |$$ |  $$ |  $$ |    \n" +
                "$$ |      $$ |      $$ |      $$ |  $$ |$$ |            $$\\       $$$  / \\$$$ |$$ |      $$ |  $$ |$$ |  $$ |$$ |  $$ |        $$ |  $$ |  $$ |$$ |  $$ |$$ |  $$ |  $$ |$$\\ \n" +
                "$$$$$$$$\\ $$ |      $$ |      \\$$$$$$  |$$ |            \\__|      $$  /   \\$$ |$$ |      \\$$$$$$  |$$ |  $$ |\\$$$$$$$ |      $$$$$$\\ $$ |  $$ |$$$$$$$  |\\$$$$$$  |  \\$$$$  |\n" +
                "\\________|\\__|      \\__|       \\______/ \\__|                      \\__/     \\__|\\__|       \\______/ \\__|  \\__| \\____$$ |      \\______|\\__|  \\__|$$  ____/  \\______/    \\____/ \n" +
                "                                                                                                             $$\\   $$ |                        $$ |                          \n" +
                "                                                                                                             \\$$$$$$  |                        $$ |                          \n" +
                "                                                                                                              \\______/                         \\__|                          \n");
        main();
    }



    static void add()//to display addition problems
    {
        String ans = "";
        for (int i = 1; i <= noq; i++) {
            int x = (int) (Math.random() * Math.pow(10,dl)), y = (int) (Math.random() * Math.pow(10,dl));
            System.out.println(i + ") " + x + "+" + y + "=");
            ans = ans + "\n" + i + ")" + (x + y);
        }
        System.out.println("\n\n\n\n\n Answers ");
        System.out.println(ans);
        main();
    }



    static void subtract() //to generate subtraction problems
    {
        String ans = "";
        for (int i = 1; i <= noq; i++) {
            int x = (int) (Math.random() * Math.pow(10,dl)), y = (int) (Math.random() * Math.pow(10,dl));
            System.out.println(i + ") " + x + "-" + y + "=");
            ans = ans + "\n" + i + ")" + (x - y);
        }
        System.out.println("\n\n\n\n\n Answers ");
        System.out.println(ans);
        main();
    }



    static void multiply() //to generate multiplicatin problems
    {

        String ans = "";
        for (int i = 1; i <= noq; i++) {
            long x = (int) (Math.random() * Math.pow(10,dl)), y = (int) (Math.random() * Math.pow(10,dl));
            System.out.println(i + ") " + x + " x " + y + "=");
            ans = ans + "\n" + i + ")" + (x * y);
        }
        System.out.println("\n\n\n\n\n Answers ");
        System.out.println(ans);
        main();
    }



    static void divide()//to generate division problems
    {
        String ans = "";
        for (int i = 1; i <= noq; i++) {
            int x = (int) (Math.random() * Math.pow(10,dl)), y = (int) (Math.random() * Math.pow(10,dl));
            System.out.println(i + ") " + x + "/" + y + "=");
            ans = ans + "\n" + i + ") Quotient" + (x / y) + "Remainder" + (x % y);
        }
        System.out.println("\n\n\n\n\n Answers ");
        System.out.println(ans);
        main();
    }



    static void si()//to generate problems on simple interest
    {
        String ans = "";
        for (int i = 1; i <= noq; i++) {
            int x = (int) (Math.random() * Math.pow(10,dl)), y = (int) (Math.random() * Math.pow(10,dl)), z = (int) (Math.random() * Math.pow(10,dl));
            System.out.println(i + ") " + " Rajaram borrows Rs." + x + "from Pankaj for " + y + "years at " + z + "% simple interest. calculate the Interest earned by Pankaj");
            ans = ans + "\n" + i + ")" + (x * y * z / Math.pow(10,dl));
        }
        System.out.println("\n\n\n\n\n Answers ");
        System.out.println(ans);


    main();

}


    static void ap()//to generate problems on area and perimeter
    {String ans="";
        for(int i=1;i<=noq;i++)
        {
            int x=(int)(Math.random()*Math.pow(10,dl)),y=(int)(Math.random()*Math.pow(10,dl));
            System.out.println(i+") the sides of a rectangular ground are "+x+" and "+y+". Calculate the Area and perimeter of the ground");
            ans=ans+"\n"+i+")"+(x*y)+" and "+(2*(x+y));
        }
        System.out.println("\n\n\n\n\n Answers ");
        System.out.println(ans);


    main();}


    static void main()
    {System.out.println("Do you want to continue[c] or leave[l] ?");
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    if(s.equalsIgnoreCase("c"))
    {
        String a[]=new String[0];
        main(a);
    }
    else
        exit();
    }


    static void exit()
    {    Scanner s=new Scanner(System.in);
        System.out.println("Are you sure you want to EXIT [Y/N] ");
        String yn=s.next();
        if(yn.equalsIgnoreCase("N"))
            main();
        else
            System.out.println("\n" +
                    "                                                                                                                                             \n" +
                    "                                                                                                                                             \n" +
                    "BBBBBBBBBBBBBBBBB                                                              BBBBBBBBBBBBBBBBB                                             \n" +
                    "B::::::::::::::::B                                                             B::::::::::::::::B                                            \n" +
                    "B::::::BBBBBB:::::B                                                            B::::::BBBBBB:::::B                                           \n" +
                    "BB:::::B     B:::::B                                                           BB:::::B     B:::::B                                          \n" +
                    "  B::::B     B:::::Byyyyyyy           yyyyyyy eeeeeeeeeeee                       B::::B     B:::::Byyyyyyy           yyyyyyy eeeeeeeeeeee    \n" +
                    "  B::::B     B:::::B y:::::y         y:::::yee::::::::::::ee                     B::::B     B:::::B y:::::y         y:::::yee::::::::::::ee  \n" +
                    "  B::::BBBBBB:::::B   y:::::y       y:::::ye::::::eeeee:::::ee                   B::::BBBBBB:::::B   y:::::y       y:::::ye::::::eeeee:::::ee\n" +
                    "  B:::::::::::::BB     y:::::y     y:::::ye::::::e     e:::::e ---------------   B:::::::::::::BB     y:::::y     y:::::ye::::::e     e:::::e\n" +
                    "  B::::BBBBBB:::::B     y:::::y   y:::::y e:::::::eeeee::::::e -:::::::::::::-   B::::BBBBBB:::::B     y:::::y   y:::::y e:::::::eeeee::::::e\n" +
                    "  B::::B     B:::::B     y:::::y y:::::y  e:::::::::::::::::e  ---------------   B::::B     B:::::B     y:::::y y:::::y  e:::::::::::::::::e \n" +
                    "  B::::B     B:::::B      y:::::y:::::y   e::::::eeeeeeeeeee                     B::::B     B:::::B      y:::::y:::::y   e::::::eeeeeeeeeee  \n" +
                    "  B::::B     B:::::B       y:::::::::y    e:::::::e                              B::::B     B:::::B       y:::::::::y    e:::::::e           \n" +
                    "BB:::::BBBBBB::::::B        y:::::::y     e::::::::e                           BB:::::BBBBBB::::::B        y:::::::y     e::::::::e          \n" +
                    "B:::::::::::::::::B          y:::::y       e::::::::eeeeeeee                   B:::::::::::::::::B          y:::::y       e::::::::eeeeeeee  \n" +
                    "B::::::::::::::::B          y:::::y         ee:::::::::::::e                   B::::::::::::::::B          y:::::y         ee:::::::::::::e  \n" +
                    "BBBBBBBBBBBBBBBBB          y:::::y            eeeeeeeeeeeeee                   BBBBBBBBBBBBBBBBB          y:::::y            eeeeeeeeeeeeee  \n" +
                    "                          y:::::y                                                                        y:::::y                             \n" +
                    "                         y:::::y                                                                        y:::::y                              \n" +
                    "                        y:::::y                                                                        y:::::y                               \n" +
                    "                       y:::::y                                                                        y:::::y                                \n" +
                    "                      yyyyyyy                                                                        yyyyyyy                                 \n" +
                    "                                                                                                                                             \n" +
                    "                                                                                                                                             \n");
    }

}
