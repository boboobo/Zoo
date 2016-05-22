import java.util.Scanner;

public class Zoo {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many animals are there?");
		int input = scanner.nextInt();
		
		
		Animal[] zoo = new Animal[input];
		
		
		all_sounds(zoo);
		
	}
	
	public static void all_sounds(Animal[] zoo){
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i < zoo.length; i++){
			System.out.println("What is the name of an animal?");
			String animal_name = scanner.nextLine();
			
			System.out.printf("What is the sound of %s? %n" , animal_name);
			String animal_sound = scanner.nextLine();
			
			zoo[i]= new Animal(animal_name, animal_sound);
			
		}
		
		
		
		for(int i=0; i < zoo.length; i++){
			System.out.printf("%s goes %s%n",zoo[i].name, zoo[i].sound);
		}
		
		
	}
	
}
