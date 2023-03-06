package org.example.game;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String PLAYER_NAME;
    private List<Pokemon> pokemonList; //limit: 6

    private int SCORES; //max: 5000

    private String POKEDEX;

    private String PLAYER_GOAL; //might be hidden from other players
    private String TRAINING_MODE;
    private Ball TRAINING_BALL; //how many balls -> one!
    private String PROFESSOR; //to keep the caught Pokemons
    private String PLAYER_STATUS; //trainer, master, goof, watcher, professor, trainee
    private boolean hasABall;

    public Player(){};

    public Player(String PLAYER_NAME, List<Pokemon> pokemonList, int SCORES,
                  String POKEDEX, String PLAYER_GOAL, String TRAINING_MODE, Ball TRAINING_BALL,
                  String PROFESSOR, String PLAYER_STATUS) {
        this.PLAYER_NAME = PLAYER_NAME;
        this.pokemonList = pokemonList;
        this.SCORES = SCORES;
        this.POKEDEX = POKEDEX;
        this.PLAYER_GOAL = PLAYER_GOAL;
        this.TRAINING_MODE = TRAINING_MODE;
        this.TRAINING_BALL = TRAINING_BALL;
        this.PROFESSOR = PROFESSOR;
        this.PLAYER_STATUS = PLAYER_STATUS;
        this.hasABall = false;
    }

    public String getPLAYER_NAME() {
        return PLAYER_NAME;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public int getSCORES() {
        return SCORES;
    }

    public String getPOKEDEX() {
        return POKEDEX;
    }

    public String getPLAYER_GOAL() {
        return PLAYER_GOAL;
    }

    public String getTRAINING_MODE() {
        return TRAINING_MODE;
    }

    public Ball getTRAINING_BALL() {
        return TRAINING_BALL;
    }

    public String getPROFESSOR() {
        return PROFESSOR;
    }

    public String getPLAYER_STATUS() {
        return PLAYER_STATUS;
    }

    public boolean isHasABall() {
        return hasABall;
    }

    private void showStatus() {
        if(this.SCORES >= 5000) {
            this.PLAYER_STATUS = "professor";
        } else if(this.SCORES < 5000 && this.SCORES >= 4000) {
            this.PLAYER_STATUS = "trainer";
        } else if (this.SCORES < 4000 && this.SCORES >= 3000) {
            this.PLAYER_STATUS = "trainee"; //trained by the PROF
        } else if (this.SCORES < 3000 && this.SCORES >= 1000) {
            this.PLAYER_STATUS = "watcher"; //slave for the PROF
        } else {
            this.PLAYER_STATUS = "goof";
        }
    }

    private List<Pokemon> collectPokemons(Pokemon pok) {
        //limit is 6!
        int limit = 6;

        return new ArrayList<>();
    }

    private void collectScores() {

    }

}
