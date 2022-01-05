package pokemon;

import java.util.ArrayList;

public abstract class AbstractPokemon implements PokemonInterface {

	public Pokemon createPokemon() {
		return createPokemon("A",0,"E");
	}
	
	public Pokemon createPokemon2() {
		return createPokemon("B",0,"F");
	}
	
	public Pokemon createPokemon3() {
		return createPokemon("C",0,"G");
	}
	
	public Pokemon createPokemon4() {
		return createPokemon("D",0,"H");
	}
	
	//IMPLEMETANCION DE POKEMONINFO
	static String pokemonInfo(Pokemon pokemon) {
		return pokemon.toString();	
	}
	
	
	

}
