package com.title;

import java.util.Scanner;

public class Die {
    
    public void die_screen(){
        System.out.println("Your Die");
        Game game = new Game();
        System.out.println("1: Back Main Menu");

        Scanner scan = new Scanner(System.in);
        
        byte select_die = scan.nextByte();

        switch (select_die){
            case 1:
                game.menu();
                break;
        }
    }
}
