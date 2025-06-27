package FedericoBrunetti.entitles.exceptions;

public class GameAlreadyExistException extends RuntimeException {
    public GameAlreadyExistException(short id) {
        super("Attenzione! Il Gioco con id " + id +" è già esistente");
   ;
    }
}
