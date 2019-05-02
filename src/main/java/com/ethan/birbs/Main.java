package com.ethan.birbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BirdService birdService = new BirdService();
        Scanner kb = new Scanner(System.in);

        mainloop: while(true) {
            System.out.print("? ");
            String input = kb.nextLine();
            Command c = Command.parse(input);

            switch (c) {
                case ADD:
                    System.out.print("Name: ");
                    String name = kb.nextLine();
                    System.out.print("Latin name: ");
                    String latinName = kb.nextLine();
                    System.out.println("Got it: " + name + " - " + latinName);
                    birdService.addBird(name, latinName);
                    break;
                case OBSERVATION:
                    System.out.print("What was observed?: ");
                    name = kb.nextLine();
                    birdService.observe(name);
                    break;
                case STATISTICS:
                    birdService.statistics();
                    break;
                case SHOW:
                    System.out.print("What?: ");
                    name = kb.nextLine();
                    BirdData bd = birdService.showBird(name);
                    if (bd == null) {
                        System.out.println("I don't know about that bird");
                    } else {
                        System.out.println(bd);
                    }
                    break;
                case QUIT:
                    break mainloop;
                case UNKNOWN:
                    System.out.println("I don't recognize that command");
                    break;
            }
        }

        System.out.println("Bye bye!");
    }
}
