package pokemon;
public class TestPokemon {

	public static void main(String[] args) {

		//CLASE POKEMON
		Pokemon pikachu = new Pokemon("Pikachu", 75, "Electrico");
		Pokemon charizard = new Pokemon("Charizard", 150, "Fuego");
		Pokemon Venusaur = new Pokemon("Venusaur", 150, "Planta, Veneno");
		Pokemon Metapod = new Pokemon("Metapod", 50, "Bicho");
		
		//CLASE POKEMON ATACAR A OTRO POKEMON
		pikachu.attackPokemon(pikachu);
		charizard.attackPokemon(Metapod);
		Venusaur.attackPokemon(Metapod);
		Metapod.attackPokemon(charizard);
		
		System.out.println("----------------------------------------------------");
		System.out.println("Tienes " + Pokemon.count() + " pokemones creados");
		System.out.println("----------------------------------------------------");
		System.out.println("Listado de todos los pokemones creados");
		
		//CLASE POKEDEX 
		Pokedex pokedex = new Pokedex();
		pokedex.listPokemon();
		pokedex.PokemonsCreados();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
