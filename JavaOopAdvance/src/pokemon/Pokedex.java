package pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{

     public static int myPokemons  = 0;
     
     public static int PokemonsCreados() {
    	 return myPokemons ;
     }

	public void listPokemon() {
		
		ArrayList<String> pokemones;
		
		pokemones = new ArrayList<String>();
		
		pokemones.add("Pikachu");
		pokemones.add("Metapod");
		pokemones.add("Charizard");
		for(int i = 0; i<pokemones.size(); i++) {
			System.out.println("-----> " + pokemones.get(i));
			myPokemons++;
		}
		System.out.println("Tienes " + myPokemons + " en la pokedex");
	}
	
	
	
	
	
	
	
	
	
	
}
