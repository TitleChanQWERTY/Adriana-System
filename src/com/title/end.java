package com.title;

import java.util.Scanner;

public class end {

    public void ending(){
        System.out.println("After Ioann destroyed Sarah, all people returned to normal life, in general, everything was fine, but this is not the end\n");
        System.out.println("Qwerty: Ioann when will you give me back the disc\n");
        System.out.println("Ioann: I didn't take your CD\n");
        System.out.println("1: Next");
        Scanner scan = new Scanner(System.in);

        byte select_end = scan.nextByte();

        switch (select_end){
            case 1:
                Game game = new Game();
                game.clearScreen();
                System.out.println("Thanks for playing!");
                System.out.println("1: Next");
                Scanner scan1 = new Scanner(System.in);


                byte select_end1 = scan1.nextByte();
                switch (select_end1){
                    case 1:
                        game.clearScreen();
                        game.menu();
                        break;
                }
                break;

        }
    }
}
