package com.title;

import java.util.Scanner;

public class Game {
    public static byte luck = 100;
    public static byte health_ioann = 100;
    public static byte damage_ioann = 3;

    public static byte protection_of_angels = 1;
    public static byte damage_enemy;
    public static byte health_enemy;
    
    public static String level;

    public static int point;

    public static int km;

    public static void main(String[] args){
        Game game = new Game();
        game.tips();
    }

    public void tips(){
        clearScreen();
        System.out.println("Tips:");
        System.out.println("Best Play With Music\n");

        System.out.println(".VGjT5BTYuRQPEXRL");
        System.out.println(".VGjT?vSYTRQPERL");
        System.out.println(".VGjT7vSu5/ERL");
        System.out.println(" .VGjTYtL");
        System.out.println("  .VGjT?tL");
        System.out.println("   .V9jTTRL");
        System.out.println("     .V/jT?tL");
        System.out.println("    .VGjTYvSYRL");
        System.out.println("  .VGjTYTSYuRQRL");
        System.out.println("  .VGj3/vSTuRQRL");
        System.out.println("    .VGjTYvSYRL");

        System.out.println("\n1: Next");

        Scanner scanm = new Scanner(System.in);

        byte select_music = scanm.nextByte();

        switch (select_music){
            case 1:
                clearScreen();
                menu();
                break;
        }

    }

    public void menu(){
        Game game = new Game();
        game.level = "City Border";
        game.luck = 100;
        game.health_ioann = 100;
        game.damage_ioann = 3;
        game.point = 0;
        game.km = 0;
        game.clearScreen();
        System.out.println("Adriana System:");
        System.out.println("\tProblems don't just show up\n");

        System.out.println("       7A");
        System.out.println("      39AR");
        System.out.println("     AA5B9A");
        System.out.println("    N6    0A");
        System.out.println("   D3HL  YJLH");
        System.out.println("  AAQ1TYU2VG12");
        System.out.println(" POI        AXC");
        System.out.println("AS            AZ");

        System.out.println("\n");
        System.out.println("1: Play");
        System.out.println("2: Story");
        System.out.println("3: Exit");
        System.out.println("\nPowered By TytleChanQWERTY\n");


        

        Scanner scan = new Scanner(System.in);

        byte select_menu = scan.nextByte();


        switch (select_menu){
            case 1:
                clearScreen();
                game.level_gameplay();
                break;
            case 2:
                clearScreen();
                game.story();
                break;
            case 3:
                clearScreen();
                System.out.println("Bye :(");
                game.luck = 0;
                game.health_ioann = 0;
                game.damage_ioann = 0;
                game.point = 0;
                game.km = 0;
                break;
        }

    }

    public void level_gameplay(){
        Enemy_Fight ef = new Enemy_Fight();
        Boss b = new Boss();
        Game game = new Game();


        if(km >= 31){
            clearScreen();
            System.out.println("You take USP-S\n");
            damage_ioann = 8;
        }

        if(game.luck <= 60){
            game.health_enemy = 30;
            game.damage_enemy = 2;
        }

        if(km >= 82){
            clearScreen();
            System.out.println("You take AK-47\n");
            damage_ioann = 11;
            game.health_enemy = 50;
            game.damage_enemy = 6;
        }

        if(km == 90){
            clearScreen();
            b.boss1_dialog();
        }

        if(km >= 99){
            clearScreen();
            System.out.println("You take M16\n");
            damage_ioann = 16;
        }

        if(km==126){
            clearScreen();
            b.boss2_dialog();
        }

        if(km >= 151){
            clearScreen();
            System.out.println("You take SVD\n");
            damage_ioann = 19;
            game.health_enemy = 55;
            game.damage_enemy = 7;
        }

        if(km == 172){
            clearScreen();
            b.boss3_dialog();
        }

        if(km >= 220){
            clearScreen();
            System.out.println("You take Z-008\n");
            damage_ioann = 23;
        }

        if(km >= 298){
            clearScreen();
            b.boss4_dialog();
        }



        

        Scanner scan = new Scanner(System.in);

        System.out.println("1: Walk");
        System.out.println("2: Upgrade|reset");
        System.out.println("3: Info Statistic");
        System.out.println("4: Main Menu\n");
        System.out.println("------------");
        System.out.println(" BGYUR");
        System.out.println(" VYIBL");
        System.out.println(" ZCQWQA");
        System.out.println(" MLKH4T");
        System.out.println(" DGFCTPYMIO");
        System.out.println(" RTYUBNJMOB");
        System.out.println("------------");
        byte select_level = scan.nextByte();

        switch (select_level){
            case 1:
                if(luck >= 60){
                    clearScreen();
                    System.out.println("Your Walk 5km");
                    luck -= 10;
                    km += 5;
                    level_gameplay();
                    break;
                }


                if(luck <= 60){
                    clearScreen();
                    System.out.println("Enemy Found");
                    ef.enemy_fight();
                    break;
                }
                break;
            case 2:
                Upgrade up = new Upgrade();
                clearScreen();
                up.upgrade();
                break;

            case 3:
                clearScreen();
                statistic();
                break;
            case 4:
                clearScreen();
                menu();
                break;
        }
    }

    public void story(){
        clearScreen();
        System.out.println("1: Game Story");
        System.out.println("2: Character Info|Story");
        System.out.println("3: Back Main Menu");

        Scanner scan = new Scanner(System.in);

        byte select_story_part = scan.nextByte();

        switch (select_story_part){
            case 1:
                clearScreen();
                System.out.println("After the summer ended and autumn came, people suddenly began to fall ill");
                System.out.println("With some strange diseases, no one knew what it was and Ioann decided to figure out what it is and who is to blame");
                Scanner scan1 = new Scanner(System.in);
                System.out.println("1: Back Main Menu");

                byte select_story = scan1.nextByte();

                switch (select_story){
                    case 1:
                        clearScreen();
                        menu();
                        break;
                }
                break;

            case 2:
                clearScreen();
                System.out.println("1: Ioann");
                System.out.println("2: Valeria");
                System.out.println("3: Qwerty");
                System.out.println("4: Lila");
                System.out.println("5: Sarah");
                System.out.println("6: Back Main Menu");

                Scanner scan2 = new Scanner(System.in);

                byte select_character_story = scan2.nextByte();

                switch (select_character_story){
                    case 1:
                        clearScreen();
                        System.out.println("Ioann: this is the chosen one, who should help people who have fallen into a world of indecision, he looks like a boy in a burgundy blouse with fasteners has purple hair and blue eyes");
                        Scanner scan3 = new Scanner(System.in);
                        System.out.println("1: Back Main Menu");

                        byte select_character_ioann = scan3.nextByte();

                        switch (select_character_ioann){
                            case 1:
                                clearScreen();
                                menu();
                                break;
                        }
                        break;

                    case 2:
                        clearScreen();
                        System.out.println("Valeria: this is the girl who helps Ioann she should be there for him when he needs help, but often she doesn't come because she just doesn't want to she wears a traditional female Ukrainian costume, has blond hair and always carries a sedativ");
                        System.out.println("1: Back Main Menu");
                        Scanner scan4 = new Scanner(System.in);

                        byte select_character_valeria = scan4.nextByte();
                        
                        switch (select_character_valeria){
                            case 1:
                                clearScreen();
                                menu();
                                break;
                        }
                        break;
                    case 3:
                        clearScreen();
                        System.out.println("Qwerty: this is a guy who is stronger than god and devil combined he is the best friend Ioann despite the fact that they often kill each other in the literal sense even though he's a guy, he's not shy about wearing a maid costumeand he has white hair");
                        System.out.println("1: Back Main Menu");
                        Scanner scan5 = new Scanner(System.in);

                        byte select_character_qwerty = scan5.nextByte();
                        switch (select_character_qwerty){
                            case 1:
                                clearScreen();
                                menu();
                                break;
                        }
                        break;

                    case 4:
                        clearScreen();
                        System.out.println("Lila: she is a low-level military, she often gets into all sorts of troubles and Ioann has to pull her out");
                        System.out.println("1: Back Main Menu");
                        Scanner scan6 = new Scanner(System.in);

                        byte select_character_lila = scan6.nextByte();
                        switch (select_character_lila){
                            case 1:
                                clearScreen();
                                menu();
                                break;
                        }
                        break;

                    case 5:
                        clearScreen();
                        System.out.println("Sarah: this is a very strong psychologist, she can make a person do what she wants with one glance, she looks like a sexy dressed girl in a medical gown");
                        System.out.println("1: Back Main Menu");
                        Scanner scan7 = new Scanner(System.in);
                        byte select_character_sarah = scan7.nextByte();
                        switch (select_character_sarah){
                            case 1:
                                clearScreen();
                                menu();
                                break;
                        }
                        break;

                    case 6:
                        clearScreen();
                        menu();
                        break;

                }

            case 3:
                menu();
                break;
        }

    }

    public void clearScreen() {
        System.out.print("\033[H\033[J");
        System.out.flush();
    }

    public void statistic(){
        System.out.println("Health: "+health_ioann);
        System.out.println("Damage: "+damage_ioann);
        System.out.println("\nProtection Of Angels: "+protection_of_angels);
        System.out.println("Level: "+level+"\n");
        
        System.out.println("Point: "+point);

        System.out.println("KM: "+km);

        System.out.println("1: Exit");
        Scanner scan = new Scanner(System.in);

        byte select_statistic = scan.nextByte();

        switch (select_statistic){
            case 1:
                clearScreen();
                level_gameplay();
                break;

        }
    }
}
