
public class Zoo {

	public static void main(String args[]){
		
		Animal[] zoo = new Animal[4];
		zoo[0] = new Animal("lion", "roar");
		zoo[1] = new Animal("giraffe", "giraffffes");
		zoo[2] = new Animal("rabbit", "ohmygod");
		zoo[3] = new Animal("koala", "alaala");
		
		all_sounds(zoo);
		
	}
	
	public static void all_sounds(Animal[] zoo){
		
		for(int i=0; i < zoo.length; i++){
			System.out.printf("%s goes %s%n",zoo[i].name, zoo[i].sound);
		}
		
		
	}
	
}
