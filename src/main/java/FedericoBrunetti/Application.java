package FedericoBrunetti;

import FedericoBrunetti.entitles.*;
import FedericoBrunetti.entitles.exceptions.GameAlreadyExistException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Game[] collectionGame = {
                new BoardGame((short) 1, "Cluedo", "1970", (short) 30, (byte) 6, (short) 60),
                new BoardGame((short) 2, "Monopoly", "1930", (short) 20, (byte) 5, (short) 200),
                new BoardGame((short) 3, "Risiko", "1960", (short) 30, (byte) 6, (short) 60),
                new VideoGame((short) 4,"Pokemon", "1985",(short) 25, Platform.GAMEBOY, Genre.BATTLE,(short)300),
                new VideoGame((short) 5,"Sheep Raider", "2000",(short) 25, Platform.PC, Genre.FUNNY,(short)300),
                new VideoGame((short) 6,"Tetris", "1985",(short) 25, Platform.POLYSTATION, Genre.POINTANDCLICK,(short)300),
        };

        List<Game> initialGames = new ArrayList<>(Arrays.asList(collectionGame));
        GameCollection collection = new GameCollection(initialGames);

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Ciao, benvenuto nel gestionale dei giochi.");
Boolean continueLoop = true;

        while (continueLoop){
            System.out.println("Premi 1 per vedere la lista totale dei giochi");
            System.out.println("Premi 2 per aggiungere un gioco");
            System.out.println("Premi 3 per cercare  un gioco tramite id");
            System.out.println("Premi 4 per eliminare  un gioco tramite id");
            System.out.println("Premi 0 per interrompere tutto");

            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    collection.showAllGames();
                    break;
                case 2:
                    aggiungiGioco(collection, scanner);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("Arrivederci!");

                    continueLoop=false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
    }


    private static void aggiungiGioco(GameCollection collection, Scanner scanner) {
        try {
            System.out.println("Inserisci ID (numero intero):");
            short id = scanner.nextShort();
            scanner.nextLine();

            System.out.println("Inserisci Titolo:");
            String titolo = scanner.nextLine();

            System.out.println("Inserisci Anno di pubblicazione (es. 1985):");
            String anno = scanner.nextLine();

            System.out.println("Inserisci Prezzo (numero intero):");
            short prezzo = scanner.nextShort();
            scanner.nextLine();

            System.out.println("È un gioco da tavolo? (s/n)");
            String isBoardGame = scanner.nextLine();

            if (isBoardGame.equalsIgnoreCase("s")) {
                System.out.println("Inserisci Numero Giocatori (byte):");
                byte numGiocatori = scanner.nextByte();
                scanner.nextLine();

                System.out.println("Inserisci Durata Partita (minuti, short):");
                short durata = scanner.nextShort();
                scanner.nextLine();

                BoardGame newGame = new BoardGame(id, titolo, anno, prezzo, numGiocatori, durata);
                collection.addGame(newGame);

            } else {
                System.out.println("Inserisci Piattaforma (scegli tra: PC, XBOX, WII, DS, PSP, GAMEBOY, GAMEANDWATCH, POLYSTATION, NES, GAMECUBE, PS1, PS2, PS10, ANDROID, IPHONE):");
                String piattaformaStr = scanner.nextLine().toUpperCase();
                Platform piattaforma = Platform.valueOf(piattaformaStr);

                System.out.println("Inserisci Genere (scegli tra: FUNNY, ADVENTURE, FANTASY, STORYTELLING, POINTANDCLICK, BATTLE):");
                String genereStr = scanner.nextLine().toUpperCase();
                Genre genere = Genre.valueOf(genereStr);

                System.out.println("Inserisci Durata Gioco (ore, short):");
                short durataGioco = scanner.nextShort();
                scanner.nextLine();

                VideoGame newGame = new VideoGame(id, titolo, anno, prezzo, piattaforma, genere, durataGioco);
                collection.addGame(newGame);
            }

            System.out.println("Gioco aggiunto con successo:");
            System.out.println(titolo+id+anno+prezzo);

        } catch (GameAlreadyExistException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: valore di enum non valido.");
        } catch (Exception e) {
            System.out.println("Errore nell'aggiunta del gioco: " + e.getMessage());
        }
    }
}
