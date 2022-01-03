package pokemon;

public interface PokemonInterface {
	
	default //METODOS
	
	//ESTE METODO CREA Y RETORNA UN POKEMON
	Pokemon createPokemon(String name, int health, String type) {
		return null;
	}
	
	//STE METODO DEVUELVE UN STRING CON EL NAME, HEALTH Y TYPE DEL POKEMON
	default String pokemonInfo(Pokemon pokemon) {
		return null;
		
	}
	
	
	//ESTE METODO LISTA EL NOMBRE DE TODOS LOS POKEMONES QUE TIENES EN LA POKEDEX
	static void listPokemon() {
		
	}

}
