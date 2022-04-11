package ac1_pokemon_top;

public class Batalhas {

    private int meuPokemonVida;
    private int outroPokemonVida;
    private String meuPokemonNome;
    private String outroPokemonNome;

    public void meuPokemon(String nome, int vida) {
        this.meuPokemonVida = vida;
        this.meuPokemonNome = nome;
    }

    public void outroPokemon(String nome, int vida) {
        this.outroPokemonVida = vida;
        this.outroPokemonNome = nome;

    }

    public void startBattle(){
        System.out.println("A batalha vai começar!!!");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        if (meuPokemonVida > outroPokemonVida) {
            System.out.println("Você Venceu! " + meuPokemonNome);
        } else {
            System.out.println("Você Perdeu... " + outroPokemonNome + " ganhou!");

        }
    }

    
    }

