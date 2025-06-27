package FedericoBrunetti;

import FedericoBrunetti.entitles.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {


        Game[] collectionGame = {
                new BoardGame((short) 001, "Cluedo", "1970", (short) 30, (byte) 6, (short) 60),
                new BoardGame((short) 002, "Monopoly", "1930", (short) 20, (byte) 5, (short) 200),
                new BoardGame((short) 003, "Risiko", "1960", (short) 30, (byte) 6, (short) 60),
                new VideoGame((short)004,"Pokemon", "1985",(short) 25, Platform.GAMEBOY, Genre.BATTLE,(short)300),
                new VideoGame((short)005,"Sheep Raider", "2000",(short) 25, Platform.PC, Genre.FUNNY,(short)300),
                new VideoGame((short)006,"Tetris", "1985",(short) 25, Platform.POLYSTATION, Genre.POINTANDCLICK,(short)300),
        };
        List<Game> initialGames = new ArrayList<>(Arrays.asList(collectionGame));
        GameCollection collection = new GameCollection(initialGames);
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Ciao, benvenuto nel gestionale dei giochi.");
        System.out.println("Premi 1 per vedere la lista totale dei giochi");
        System.out.println("Premi 2 per aggiunger un gioco");
        System.out.println("Premi 3 per cercare  un gioco tramite id");
        System.out.println("Premi 4 per eliminare  un gioco tramite id");
        System.out.println("Premi 0 per interrompere tutto");
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                collection.showAllGames();
                break;
            case 2:
                break;
            case 3:
//                addGame();
                break;


        }

      /*  public static void addGame(){

        }*/

    }




}
