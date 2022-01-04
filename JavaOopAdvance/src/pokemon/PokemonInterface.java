package pokemon;

public interface PokemonInterface {
	
	 //METODOS
	
	//ESTE METODO CREA Y RETORNA UN POKEMON
	default Pokemon createPokemon(String name, int health, String type) {
	 		return createPokemon("",0,"" );
	}
	
	 //STE METODO DEVUELVE UN STRING CON EL NAME, HEALTH Y TYPE DEL POKEMON
	 static String pokemonInfo(Pokemon pokemon) {
		return pokemonInfo(pokemon);
		
	}
	
	
	//ESTE METODO LISTA EL NOMBRE DE TODOS LOS POKEMONES QUE TIENES EN LA POKEDEX
	static void listPokemon() {
		
		
		
	}

}
