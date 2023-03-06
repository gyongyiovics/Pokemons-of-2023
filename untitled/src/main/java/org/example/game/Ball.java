package org.example.game;

public class Ball {
    private Player player;
    private Pokemon pokemon;

    public Ball() {
    }

    public Ball(Player player, Pokemon pokemon) {
        this.player = player;
        this.pokemon = pokemon;
    }

    public Player getPlayer() {
        return player;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    private PokemonStatus catchPokemon(Pokemon pok) {
        return PokemonStatus.CAUGHT;
    }
}
