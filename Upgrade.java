package com.title;

import java.util.Scanner;

public class Upgrade {

    public static void upgrade(){
        Game game = new Game();
        System.out.println("1: Health | 50 Point");
        System.out.println("2: Protection Of Angels | 35 Point");
        System.out.println("3: Exit");

        Scanner scan = new Scanner(System.in);

        byte select_upgrade = scan.nextByte();

        switch (select_upgrade){
            case 1:
                if(game.point >= 50&&game.health_ioann <= 111){
                    game.clearScreen();
                    game.health_ioann += 30;
                    game.point -= 45;
                    upgrade();
                    break;
                }

                if(game.point < 50){
                    game.clearScreen();
                    System.out.println("Error!");
                    upgrade();
                    break;
                }

                if(game.health_ioann >= 111){
                    game.clearScreen();
                    System.out.println("Max Health!");
                    upgrade();
                    break;
                }
                break;

            case 2:
                if(game.point >= 35){
                    game.clearScreen();
                    game.protection_of_angels += 1;
                    game.point -= 35;
                    upgrade();
                    break;
                }

                if(game.point < 35){
                    game.clearScreen();
                    System.out.println("Error!");
                    upgrade();
                    break;
                }
                break;

            case 3:
                game.clearScreen();
                game.level_gameplay();
                break;

        }

    }
}
