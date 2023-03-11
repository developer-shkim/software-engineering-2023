package srp;

public class PokemonEvolver {

    public void evolve(Pokemon pokemon) {   // 사용하는 의존관계, has-a(x)
        pokemon.setLevel(pokemon.getLevel() + 1);
        // level++;
        System.out.println("레벨 up!");
    }
}
