package com.title;

import java.util.Scanner;

public class Boss {
        public static int boss = 109;
    public void boss1_dialog(){
        boss = 109;
        Game game = new Game();
        game.clearScreen();
        System.out.println("lila: Hello Ioann what are you doing here");

        System.out.println("1: Next");

        Scanner scan = new Scanner(System.in);
        
        byte select_dialog = scan.nextByte();
        
        switch (select_dialog){
            case 1:
                game.clearScreen();
                System.out.println("Ioann: Hello lila i just decided to find someone");
                System.out.println("1: Next");

                Scanner scan1 = new Scanner(System.in);

                byte select_dialog2 = scan1.nextByte();

                if(select_dialog2 == 1){
                    game.clearScreen();
                    System.out.println("Lila: To be honest I'm very tired");
                    System.out.println("1: Next");
                    Scanner scan2 = new Scanner(System.in);

                    byte select_dialog3 = scan2.nextByte();

                    if(select_dialog3 == 1){
                        game.clearScreen();
                        System.out.println("Lila:And if you're looking for a qwerty then he might as always be playing with guns or swings or whatever, I don't know");
                        System.out.println("1: Next");
                        Scanner scan3 = new Scanner(System.in);

                        byte select_dialog4 = scan3.nextByte();

                       if(select_dialog4 == 1){
                           game.clearScreen();
                           System.out.println("Lila: listen let's fight a little");
                           System.out.println("1: Next");
                           Scanner scan4 = new Scanner(System.in);

                           byte select_dialog5 = scan4.nextByte();

                           if(select_dialog5 == 1){
                               boss1_fight();
                               break;
                           }
                       }
                    }
                }
                break;
        }
        
    }

    public void boss1_fight(){
        Game game = new Game();
        if(game.health_ioann <= 0){
            Die d = new Die();
            d.die_screen();
        }
        game.clearScreen();
        Scanner scan = new Scanner(System.in);
        System.out.println("Health:"+game.health_ioann);
        System.out.println("Health Lila:"+boss);
        System.out.println("1: Fight");
        System.out.println("2: Stay");
        System.out.println("3: Run");

        if(boss <= 0){
            Enemy_Fight ef = new Enemy_Fight();
            ef.point_time++;
            game.clearScreen();
            System.out.println("You physically humiliated your girlfriend \"ahem\"");
            game.point += 19;
            game.luck = 95;
            game.km++;
            boss1_final();
        }
        byte select_fight = scan.nextByte();


        switch (select_fight){
            case 1:
                if(game.protection_of_angels <= 5){
                    game.health_ioann -= 10;
                    game.clearScreen();
                    boss -= game.damage_ioann;
                    boss1_fight();
                    break;
                }
               else if(game.protection_of_angels >= 5){
                    game.health_ioann -= 8;
                    game.clearScreen();
                    boss -= game.damage_ioann;
                    boss1_fight();
                    break;
                }
               else if(game.protection_of_angels >= 10){
                    game.health_ioann -= 3;
                    game.clearScreen();
                    boss -= game.damage_ioann;
                    boss1_fight();
                    break;
                }
                break;

            case 2:
                game.clearScreen();
                game.health_ioann -= 4;
                game.damage_ioann+= 2;
                boss1_fight();
                break;
            case 3:
                game.clearScreen();
                game.health_ioann -= 2;
                if(game.health_ioann <= 85){
                    game.health_ioann+=4;
                    boss1_fight();
                }
                boss1_fight();
                break;

            case 11:
                game.clearScreen();
                boss -= game.damage_ioann;
                game.health_ioann -= 10;
                boss1_fight();
                break;
        }
    }

    public void boss1_final(){
        Game game = new Game();
        System.out.println("Lila: heh you begin to handle weapons much better");
        System.out.println("1: Next");

        Scanner scan = new Scanner(System.in);

        byte select_dialog = scan.nextByte();

        switch (select_dialog){
            case 1:
            game.clearScreen();
            System.out.println("Ioann: Thanks");
            System.out.println("1: Next");

            Scanner scan1 = new Scanner(System.in);

            byte select_dialog1 = scan1.nextByte();

            if(select_dialog1 == 1){
                game.level = "Bloody Garden";
                game.clearScreen();
                game.point++;
                game.level_gameplay();
                break;
            }
            break;
        }
    }


    public static void boss2_dialog(){
        boss = 120;
        Game game = new Game();
        game.clearScreen();
        System.out.println("Qwerty: oh hello moron");

        System.out.println("1: Next");

        Scanner scan = new Scanner(System.in);

        byte select_dialog = scan.nextByte();

        switch (select_dialog){
            case 1:
                game.clearScreen();
                System.out.println("Ioann: hello idiot");
                System.out.println("1: Next");

                Scanner scan1 = new Scanner(System.in);

                byte select_dialog2 = scan1.nextByte();

                if(select_dialog2 == 1){
                    game.clearScreen();
                    System.out.println("Qwerty: listen Ioann, I thought that you were solving some problems with Valeria");
                    System.out.println("1: Next");
                    Scanner scan2 = new Scanner(System.in);

                    byte select_dialog3 = scan2.nextByte();

                    if(select_dialog3 == 1){
                        game.clearScreen();
                        System.out.println("Ioann: while you are gone and there are no problems");
                        System.out.println("1: Next");
                        Scanner scan3 = new Scanner(System.in);

                        byte select_dialog4 = scan3.nextByte();

                        if(select_dialog4 == 1){
                            game.clearScreen();
                            System.out.println("Qwerty: by the way it was you who took my game disc");
                            System.out.println("1: Next");
                            Scanner scan4 = new Scanner(System.in);

                            byte select_dialog5 = scan4.nextByte();

                            if(select_dialog5 == 1){
                                game.clearScreen();
                                System.out.println("Ioann: no, why do I need it, I have a lot of mine");
                                System.out.println("1: Next");
                                Scanner scan5 = new Scanner(System.in);

                                byte select_dialog6 = scan5.nextByte();
                                
                                if(select_dialog6 == 1){
                                    game.health_ioann--;
                                    System.out.println("Health: "+game.health_ioann);
                                    

                                    System.out.println("Ioann: hey what are you doing idiot");
                                    System.out.println("1: Next");

                                    Scanner scan6 = new Scanner(System.in);

                                    byte select_dialog7 = scan6.nextByte();

                                    if(select_dialog7 == 1){
                                        System.out.println("Qwerty: and what is not clear, I just want to fight with you a little");

                                        System.out.println("1: Next");

                                        Scanner scan7 = new Scanner(System.in);

                                        byte select_dialog8 = scan7.nextByte();
                                        
                                        if(select_dialog8 == 1){
                                            boss = 120;
                                            boss2_fight();
                                            break;
                                        }
                                        
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }

    }

    public static void boss2_fight(){
        Game game = new Game();
        if(game.health_ioann <= 0){
            Die d = new Die();
            d.die_screen();
        }
        game.clearScreen();
        Scanner scan = new Scanner(System.in);
        System.out.println("Health:"+game.health_ioann);
        System.out.println("Health Qwerty:"+boss);
        System.out.println("1: Fight");
        System.out.println("2: Stay");
        System.out.println("3: Run");
        if(boss <= 0){
            Enemy_Fight ef = new Enemy_Fight();
            ef.point_time++;
            game.clearScreen();
            System.out.println("Your friend lost his maid headdress");
            game.point += 38;
            game.luck = 95;
            game.level = "Field Of Angels";
            game.km++;
            boss2_final();
        }
        byte select_fight = scan.nextByte();


        switch (select_fight){
            case 1:
                if(game.protection_of_angels <= 5){
                    game.health_ioann -= 13;
                    game.clearScreen();
                    boss -= game.damage_ioann;
                    boss2_fight();
                    break;
                }
               else if(game.protection_of_angels >= 5){
                    game.health_ioann -= 11;
                    game.clearScreen();
                    boss -= game.damage_ioann;
                    boss2_fight();
                    break;
                }
               else if(game.protection_of_angels >= 10){
                    game.health_ioann -= 9;
                    game.clearScreen();
                    boss -= game.damage_ioann;
                    boss2_fight();
                    break;
                }
                break;

            case 2:
                game.clearScreen();
                game.health_ioann -= 5;
                game.damage_ioann+= 2;
                boss2_fight();
                break;
            case 3:
                game.clearScreen();
                game.health_ioann -= 2;
                if(game.health_ioann <= 85){
                    game.health_ioann+=4;
                    boss2_fight();
                }
                game.health_ioann+=4;
                boss2_fight();
                break;

            case 11:
                game.clearScreen();
                boss -= game.damage_ioann;
                game.health_ioann -= 13;
                boss2_fight();
                break;
        }
    }

    public static void boss2_final(){
        Game game = new Game();
        game.clearScreen();
        game.level = "Field Of Angels";
        System.out.println("Qwerty: Well done, to be honest, I didn't even try to defeat you");
        System.out.println("1: Next");

        Scanner scan = new Scanner(System.in);

        byte select_dialog = scan.nextByte();

        switch (select_dialog){
            case 1:
            System.out.println("Ioann: yeah tell me more");
            System.out.println("1: Next");

            Scanner scan1 = new Scanner(System.in);

            byte select_dialog1 = scan1.nextByte();

            if(select_dialog1 == 1){
                game.clearScreen();
                game.point++;
                game.level_gameplay();
                break;
            }
            break;
        }
    }

    public static void boss3_dialog(){
        boss = 132;
        Game game = new Game();
        game.clearScreen();
        System.out.println("Valeria: hey wait");

        System.out.println("1: Next");

        Scanner scan = new Scanner(System.in);

        byte select_dialog = scan.nextByte();

        switch (select_dialog){
            case 1:
                game.clearScreen();
                System.out.println("Ioann: yes what");
                System.out.println("1: Next");

                Scanner scan1 = new Scanner(System.in);

                byte select_dialog2 = scan1.nextByte();

                if(select_dialog2 == 1){
                    game.clearScreen();
                    System.out.println("Valeria: what did you forget here");
                    System.out.println("1: Next");
                    Scanner scan2 = new Scanner(System.in);

                    byte select_dialog3 = scan2.nextByte();

                    if(select_dialog3 == 1){
                        game.clearScreen();
                        System.out.println("Ioann: yeah it doesn't matter");
                        System.out.println("1: Next");
                        Scanner scan3 = new Scanner(System.in);

                        byte select_dialog4 = scan3.nextByte();

                        if(select_dialog4 == 1){
                            game.clearScreen();
                            System.out.println("Valeria: that something has already been done with Qwerty");
                            System.out.println("1: Next");
                            Scanner scan4 = new Scanner(System.in);

                            byte select_dialog5 = scan4.nextByte();

                            if(select_dialog5 == 1){
                                game.clearScreen();
                                System.out.println("Ioann: yes no i just had a fight with him");
                                System.out.println("1: Next");
                                Scanner scan5 = new Scanner(System.in);

                                byte select_dialog6 = scan5.nextByte();

                                if(select_dialog6 == 1){
                                    game.clearScreen();
                                    System.out.println("Valeria: well tell me more");
                                    System.out.println("1: Next");

                                    Scanner scan6 = new Scanner(System.in);

                                    byte select_dialog7 = scan6.nextByte();

                                    if(select_dialog7 == 1){
                                        game.clearScreen();
                                        System.out.println("Ioann: oh how you got me");

                                        System.out.println("1: Next");

                                        Scanner scan7 = new Scanner(System.in);

                                        byte select_dialog8 = scan7.nextByte();

                                        if(select_dialog8 == 1){
                                            boss = 132;
                                            boss3_fight();
                                            break;
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }

    }

    public static void boss3_fight(){
        Game game = new Game();
        if(game.health_ioann <= 0){
            Die d = new Die();
            d.die_screen();
        }
        game.clearScreen();
        Scanner scan = new Scanner(System.in);
        System.out.println("Health:"+game.health_ioann);
        System.out.println("Health Valeria:"+boss);
        System.out.println("1: Fight");
        System.out.println("2: Stay");
        System.out.println("3: Run");
        if(boss <= 0){
            Enemy_Fight ef = new Enemy_Fight();
            ef.point_time++;
            game.clearScreen();
            System.out.println("Ahem, your girlfriend was raped with a firearm");
            game.point += 41;
            game.luck = 95;
            game.km++;
            boss3_final();
        }
        byte select_fight = scan.nextByte();


        switch (select_fight){
            case 1:
                if(game.protection_of_angels <= 5){
                    game.health_ioann -= 15;
                    game.clearScreen();
                    boss -= game.damage_ioann;
                    boss3_fight();
                    break;
                }
                else if(game.protection_of_angels >= 5){
                    game.health_ioann -= 13;
                    game.clearScreen();
                    boss -= game.damage_ioann;
                    boss3_fight();
                    break;
                }
                else if(game.protection_of_angels >= 10){
                    game.health_ioann -= 11;
                    game.clearScreen();
                    boss -= game.damage_ioann;
                    boss3_fight();
                    break;
                }
                break;

            case 2:
                game.clearScreen();
                game.health_ioann -= 4;
                game.damage_ioann+= 3;
                boss3_fight();
                break;
            case 3:
                game.clearScreen();
                game.health_ioann -= 3;
                if(game.health_ioann <= 95)
                    game.health_ioann+=5;
                boss3_fight();
                break;

            case 11:
                game.clearScreen();
                boss -= game.damage_ioann;
                game.health_ioann -= 15;
                boss3_fight();
                break;
        }
    }

    public static void boss3_final(){
        Game game = new Game();
        System.out.println("Ioann: oh forgive me");
        System.out.println("1: Next");

        Scanner scan = new Scanner(System.in);

        byte select_dialog = scan.nextByte();

        switch (select_dialog){
            case 1:
            game.clearScreen();
            System.out.println("Valeria: fuck off");
            System.out.println("1: Next");

            Scanner scan1 = new Scanner(System.in);

            byte select_dialog1 = scan1.nextByte();

            if(select_dialog1 == 1){
                game.clearScreen();
                game.level = "City Of Redeemers";
                game.point++;
                game.level_gameplay();
                break;
            }
            break;
        }
    }

    public static void boss4_dialog(){
        boss = 231;
        Game game = new Game();
        System.out.println("Sarah: hello my little savior");

        System.out.println("1: Next");

        Scanner scan = new Scanner(System.in);

        byte select_dialog = scan.nextByte();

        switch (select_dialog){
            case 1:
                game.clearScreen();
                System.out.println("Ioann: hello my queen.....so stop zombifying me");
                System.out.println("1: Next");

                Scanner scan1 = new Scanner(System.in);

                byte select_dialog2 = scan1.nextByte();

                if(select_dialog2 == 1){
                    game.clearScreen();
                    System.out.println("Sarah: oh and your brain is stronger than i thought i'm i can't make you think you're sick");
                    System.out.println("1: Next");
                    Scanner scan2 = new Scanner(System.in);

                    byte select_dialog3 = scan2.nextByte();

                    if(select_dialog3 == 1){
                        game.clearScreen();
                        System.out.println("Ioann: so that's why everyone thinks they're sick");
                        System.out.println("1: Next");
                        Scanner scan3 = new Scanner(System.in);

                        byte select_dialog4 = scan3.nextByte();

                        if(select_dialog4 == 1){
                            game.clearScreen();
                            System.out.println("Sarah: Yes, I am the one who could change all of you so to speak");
                            System.out.println("1: Next");
                            Scanner scan4 = new Scanner(System.in);

                            byte select_dialog5 = scan4.nextByte();

                            if(select_dialog5 == 1){
                                game.clearScreen();
                                System.out.println("Ioann: oh shit go fuck yourself");
                                System.out.println("1: Next");
                                Scanner scan5 = new Scanner(System.in);

                                byte select_dialog6 = scan5.nextByte();

                                if(select_dialog6 == 1){
                                    game.clearScreen();
                                    System.out.println("Sarah: oh how rude");
                                    System.out.println("1: Next");

                                    Scanner scan6 = new Scanner(System.in);

                                    byte select_dialog7 = scan6.nextByte();

                                    if(select_dialog7 == 1){
                                        game.clearScreen();
                                        System.out.println("Ioann: fuck yourself rough");

                                        System.out.println("1: Next");

                                        Scanner scan7 = new Scanner(System.in);

                                        byte select_dialog8 = scan7.nextByte();

                                        if(select_dialog8 == 1){
                                            boss = 231;
                                            boss4_fight();
                                            break;
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }

    }

    public static void boss4_fight(){
        Game game = new Game();
        if(game.health_ioann <= 0){
            Die d = new Die();
            d.die_screen();
        }
        game.clearScreen();
        Scanner scan = new Scanner(System.in);
        System.out.println("Health:"+game.health_ioann);
        System.out.println("Health Sarah:"+boss);
        System.out.println("1: Fight");
        System.out.println("2: Stay");
        System.out.println("3: Run");
        if(boss <= 0){
            game.clearScreen();
            System.out.println("Ahem, your girlfriend was raped with a firearm");
            game.point += 14;
            game.luck = 95;
            game.km++;
            boss4_final();
        }
        byte select_fight = scan.nextByte();


        switch (select_fight){
            case 1:
                if(game.protection_of_angels <= 5){
                    game.health_ioann -= 17;
                    game.clearScreen();
                    boss -= game.damage_ioann;
                    boss4_fight();
                    break;
                }
               else if(game.protection_of_angels >= 5){
                    game.health_ioann -= 15;
                    game.clearScreen();
                    boss -= game.damage_ioann;
                    boss4_fight();
                    break;
                }
               else if(game.protection_of_angels >= 10){
                    game.health_ioann -= 13;
                    game.clearScreen();
                    boss -= game.damage_ioann;
                    boss4_fight();
                    break;
                }
                break;

            case 2:
                game.clearScreen();
                game.health_ioann -= 7;
                game.damage_ioann+= 5;
                boss4_fight();
                break;
            case 3:
                game.clearScreen();
                game.health_ioann -= 3;
                if(game.health_ioann <= 95)
                    game.health_ioann+=6;
                boss4_fight();
                break;

            case 11:
                game.clearScreen();
                boss -= game.damage_ioann;
                game.health_ioann -= 17;
                boss4_fight();
                break;
        }
    }

    public static void boss4_final(){
        Game game = new Game();
        System.out.println("Ioann: it's all bitch!");
        System.out.println("1: Next");

        Scanner scan = new Scanner(System.in);

        byte select_dialog = scan.nextByte();

        switch (select_dialog){
            case 1:
                game.clearScreen();
                System.out.println("Sarah: ..............");
                System.out.println("1: Next");

                Scanner scan1 = new Scanner(System.in);

                byte select_dialog1 = scan1.nextByte();

                if(select_dialog1 == 1){
                    game.clearScreen();
                    game.point++;
                    end e = new end();
                    e.ending();
                    break;
                }
                break;
        }



    }
}
