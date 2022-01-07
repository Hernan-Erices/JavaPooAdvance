package pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

	public Pokemon createPokemon() {
		return createPokemon("Pikachu",75,"Electrico");
	}
	
	public Pokemon createPokemon2() {
		return createPokemon("Mew",150,"Psiquico");
	}
	
	public Pokemon createPokemon3() {
		return createPokemon("Metapod",30,"Bicho");
	}
	
	public Pokemon createPokemon4() {
		return createPokemon("Charmander",80,"Fuego");
	}

	//IMPLEMETANCION DE POKEMONINFO
	static String pokemonInfo(Pokemon pokemon) {
		return null;
	}
}
