package com.title;

import java.util.Scanner;

public class Enemy_Fight {

    public byte point_time = 0;
    public void enemy_fight(){
        Game game = new Game();
        if(game.health_ioann <= 0){
             Die d = new Die();
             d.die_screen();
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Health:"+game.health_ioann);
        System.out.println("Health Enemy:"+game.health_enemy+"\n");
        System.out.println("Point Update: "+point_time+"\n");
        System.out.println("1: Fight");
        System.out.println("2: Stay");
        System.out.println("3: Run");
        if(game.health_enemy <= 0){
            game.clearScreen();
            System.out.println("You Kill Enemy");
            game.point += 21;
            game.luck = 95;
            game.level_gameplay();
        }
        byte select_fight = scan.nextByte();

        switch (select_fight){
            case 1:
                game.clearScreen();
                if(game.protection_of_angels <= 5){
                    game.health_ioann -= game.damage_enemy;
                    game.health_enemy -= game.damage_ioann;
                    enemy_fight();
                    break;
                }
               else if(game.protection_of_angels >= 5){
                    game.health_ioann -= 4;
                    game.health_enemy -= game.damage_ioann;
                    enemy_fight();
                    break;
                }
                break;

            case 2:
                game.clearScreen();
                game.health_ioann -= 4;
                if(point_time >= 1){
                    point_time -= 1;
                    game.damage_ioann+= 2;
                    enemy_fight();
                    break;
                }
                else {
                    System.out.println("Error");
                    enemy_fight();
                    break;
                }

            case 3:
                game.clearScreen();
                game.health_ioann -= 2;
                if(game.health_ioann <= 85){
                    game.health_ioann+=4;
                    enemy_fight();
                }
                enemy_fight();
                break;

            case 11:
                game.clearScreen();
                if(game.protection_of_angels <= 5){
                    game.health_ioann -= game.damage_enemy;
                    break;
                }
                else if(game.protection_of_angels >= 5){
                    game.health_ioann -= 4;
                    break;
                }
                game.health_enemy -= game.damage_ioann;
                enemy_fight();
                break;

        }

    }
}

