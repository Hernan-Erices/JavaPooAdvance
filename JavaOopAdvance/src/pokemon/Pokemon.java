package pokemon;

public class Pokemon {
	
    private String name;
    private int health;
    private String type;
    
    //VARIABLE ESTATICA
    public static int count = 0; //para mantener el número de Pokemones creados en el programa.
    
    //METODO QUE RETORNA COUNT CON NUMERO DE POKEMONS
    public static int count() {
    	return count;
    }
    

    //METODO CONSTRUCTOR
    public Pokemon(String name, int health, String type) {
		super();
		this.name = name;
		this.health = health;
		this.type = type;
		
		count++;
	}

	//METODO ATACAR POKEMOON ---> SALIDA: Reduce la salud del pokemon atacado en 10 puntos
    public void attackPokemon(Pokemon pokemon) {
    
    	int ataque = 10;
    	ataque = pokemon.health - ataque;
    	
    		System.out.println("has atacado a " + pokemon.name + ", su PS era de " + pokemon.health +" y pasa a ser de " + ataque + " PS.");
    }
    
    
    //GETTERS Y SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
