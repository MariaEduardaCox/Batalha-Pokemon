
package ac1_pokemon_top;

public class AC1_Pokemon_TOP {

    public static void main(String[] args) {
        Pokemon meuPokemon = new Pokemon("Charmander", "Fogo", 20);
        Pokemon outroPokemon = new Pokemon("Pikachu", "Elétrico", 40);

        Batalhas batalhas = new Batalhas();

        System.out.println("Seu Pokemón: ");
        meuPokemon.imprimeAtributos();
        System.out.println("Pokemón Inimigo: ");
        outroPokemon.imprimeAtributos();

        batalhas.meuPokemon(meuPokemon.getNome(), meuPokemon.getVida());
        batalhas.outroPokemon(outroPokemon.getNome(), outroPokemon.getVida());

      batalhas.startBattle();

    }
}
