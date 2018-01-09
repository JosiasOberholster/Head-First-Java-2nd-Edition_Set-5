package Exercise;
public class AnimalTestDrive
{
	public static void main(String[] args)
	{
		Wolf wolf = new Wolf();
		Dog dog = new Dog();
		Crocodile croc = new Crocodile();
		Snake snake = new Snake();
		Lion lion = new Lion();
		
		//Wolf
		System.out.println("The Wolf:");
		System.out.print("Eats: " );
		wolf.eat();
		System.out.print("Runs: ");
		wolf.run();
		System.out.print("Sleeps: ");
		wolf.sleep();
		System.out.print("How loud is it's noise: ");
		wolf.makeNoise();
		System.out.println("");
		
		//Dog
		System.out.println("The Dog:");
		System.out.print("Eats: " );
		dog.eat();
		System.out.print("Runs: ");
		dog.run();
		System.out.print("Sleeps: ");
		dog.sleep();
		System.out.print("How loud is it's noise: ");
		dog.makeNoise();
		System.out.println("");
		
		//Crocodile
		System.out.println("The Crocodile:");
		System.out.print("Eats: " );
		croc.eat();
		System.out.print("Runs: ");
		croc.run();
		System.out.print("Sleeps: ");
		croc.sleep();
		System.out.print("How loud is it's noise: ");
		croc.makeNoise();
		System.out.println("");
		
		//Snake
		System.out.println("The Snake:");
		System.out.print("Eats: " );
		snake.eat();
		System.out.print("Runs: ");
		snake.run();
		System.out.print("Sleeps: ");
		snake.sleep();
		System.out.print("How loud is it's noise: ");
		snake.makeNoise();
		System.out.println("");
		
		//Lion
		System.out.println("The Lion:");
		System.out.print("Eats: " );
		lion.eat();
		System.out.print("Runs: ");
		lion.run();
		System.out.print("Sleeps: ");
		lion.sleep();
		System.out.print("How loud is it's noise: ");
		lion.makeNoise();
		System.out.println("");
	}
}