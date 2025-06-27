package FedericoBrunetti.entitles;

import FedericoBrunetti.entitles.exceptions.GameAlreadyExistException;

import java.util.List;
import java.util.Optional;


public class GameCollection {
    private List<Game> games;

    public GameCollection(List<Game> games) {
        this.games = games;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }


    public Optional<Game> searchById(short id) {
        return games.stream()
                .filter(g -> g.getId() == id)
                .findFirst();
    }

    public void addGame(Game newGame) throws GameAlreadyExistException {
        short gameId = newGame.getId();
        if (searchById(gameId).isPresent()) {
            throw new GameAlreadyExistException(gameId);
        } else {
            games.add(newGame);
        }
    }

//    public void  removeGame




}
