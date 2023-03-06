package org.example.game;

public class Pokemon {
    private String NAME;
    private PokemonAttack ATTACK;
    private PokemonType TYPE;
    private String GOAL;
    private int SCORES;

    public PokemonStatus STATUS;
    private String POKEMON_LEVEL;
    private Player trainer; //limit: 1

    public Pokemon(String NAME, PokemonAttack ATTACK, PokemonType TYPE, String GOAL, int SCORES,
                   PokemonStatus STATUS, String POKEMON_LEVEL, Player trainer) {
        this.NAME = NAME;
        this.ATTACK = ATTACK;
        this.TYPE = TYPE;
        this.GOAL = GOAL;
        this.SCORES = SCORES;
        this.STATUS = STATUS;
        this.POKEMON_LEVEL = POKEMON_LEVEL;
        this.trainer = trainer;
    }

    public String getNAME() {
        return NAME;
    }

    public PokemonAttack getATTACK() {
        return ATTACK;
    }

    public PokemonType getTYPE() {
        return TYPE;
    }

    public String getGOAL() {
        return GOAL;
    }

    public int getSCORES() {
        return SCORES;
    }

    public PokemonStatus getSTATUS() {
        return STATUS;
    }

    public String getPOKEMON_LEVEL() {
        return POKEMON_LEVEL;
    }

    public Player getTrainer() {
        return trainer;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setATTACK(PokemonAttack ATTACK) {
        this.ATTACK = ATTACK;
    }

    public void setTYPE(PokemonType TYPE) {
        this.TYPE = TYPE;
    }

    public void setGOAL(String GOAL) {
        this.GOAL = GOAL;
    }

    public void setSCORES(int SCORES) {
        this.SCORES = SCORES;
    }

    public void setSTATUS(PokemonStatus STATUS) {
        this.STATUS = STATUS;
    }

    public void setPOKEMON_LEVEL(String POKEMON_LEVEL) {
        this.POKEMON_LEVEL = POKEMON_LEVEL;
    }

    public void setTrainer(Player trainer) {
        this.trainer = trainer;
    }

    /**
     * https://hu.wikipedia.org/wiki/Pok%C3%A9monok_list%C3%A1ja
     * https://hu.wikipedia.org/wiki/A_Pok%C3%A9mon_(anime)_szerepl%C5%91inek_list%C3%A1ja
     * http://www.bagszipoke.atw.hu/Pokeattack.html
     * https://hu.newhotgames.com/pokemon-go-tipusu-diagram-ero-gyengeseg-es-hatekonysag-minden-tipushoz/ ez jobb!
     */

    private boolean hasTrainer(Player trainer) {
        int limit = 1;
        int count = 0;
        //limit is one! if more, alert comes up and kicks out
        while (count < limit) {
            count++;
        }
        return trainer != null;
    }

    //TODO: this is only one example!
    private void hitPokemon(Pokemon enemy) {
        if((this.ATTACK == PokemonAttack.ENCHANTE) &&
                (this.TYPE == PokemonType.POISON) &&
                (enemy.TYPE == PokemonType.BUG)) {
            enemy.SCORES -= 2;
            this.SCORES += 3;
        }
    }

    private PokemonStatus showStatus() {
        if(this.hasTrainer(this.trainer)) {
            this.STATUS = PokemonStatus.CAUGHT;
        }
        return this.STATUS;
        //System.out.println(this.NAME + "s status is " + this.STATUS);
    }
}
