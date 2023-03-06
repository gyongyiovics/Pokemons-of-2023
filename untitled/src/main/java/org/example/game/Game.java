package org.example.game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    /**
     * Here comes the text when something happens
     *
     * e.g. Pokemon hits another Pokemon,
     * e.g. Player catches a Pokemon,
     *
     * player can have max 6 Pokemons,
     * pokemon can have max 1 trainer
     *
     */

    public void setupPlayer(){
        List<Pokemon> pokemonList = new ArrayList<>();

        pokemonList.add(new Pokemon("PikachuI", PokemonAttack.AGILITY,
                PokemonType.BUG, "fight", 12, PokemonStatus.CAUGHT, "basic", new Player()));
        pokemonList.add(new Pokemon("PikachuII", PokemonAttack.COMING_BACK,
                PokemonType.FAIRY, "flowers", 0, PokemonStatus.CAUGHT, "basic", new Player()));
        pokemonList.add(new Pokemon("PikachuIII", PokemonAttack.CONTRA,
                PokemonType.DARK, "fight", 10, PokemonStatus.CAUGHT,"basic", new Player()));

        Ball ball = new Ball();
        Player player = new Player("Joska", pokemonList, 1000, "PokedexI", "Fight",
                "Fighting", ball, "OakTree", "watcher");

        for (int i = 0; i < pokemonList.size(); i++) {
            pokemonList.get(i).setTrainer(player);
        }

        ball.setPlayer(player);

        System.out.println(player.getPokemonList().get(1).getGOAL());
        System.out.println(player.getPokemonList().get(1).getTrainer().getPLAYER_NAME());
        System.out.println(ball.getPlayer().getPLAYER_STATUS());

    }

    public void makeAHit(Pokemon attacker, Pokemon enemy) {
        enemy.setSCORES(enemy.getSCORES() - 1);
        attacker.setSCORES(attacker.getSCORES()+3);
        System.out.println(attacker.getNAME() + " hit " + enemy.getNAME() + " with " +
                attacker.getATTACK() + " and now " +
                enemy.getNAME() + " has " + enemy.getSCORES() + " scores, and " +
                attacker.getNAME() + " has " + attacker.getSCORES() + " scores!"
        );
    }
}
