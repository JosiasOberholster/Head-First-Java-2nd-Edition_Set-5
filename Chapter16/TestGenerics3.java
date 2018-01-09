package Chapter16;

import java.util.*;

public class TestGenerics3 
{
	public static void main(String[] args)
	{
		new TestGenerics3().go();
	}
	
	public void go()
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Dog());
		animals.add(new Dog());
		animals.add(new Dog());
				
		takeAnimals(animals);
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());
				
		takeDogs(dogs);
	}
	
	public void takeAnimals(ArrayList<Animal> animals)
	{
		for(Animal a: animals)
		{
			a.action();
		}
	}
	
	public void takeDogs(ArrayList<Dog> dogs)
	{
		for(Dog a: dogs)
		{
			a.action();
		}
	}
}
