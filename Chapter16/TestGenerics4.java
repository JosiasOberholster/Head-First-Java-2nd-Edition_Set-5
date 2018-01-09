package Chapter16;

import java.util.*;

public class TestGenerics4 
{
	public static void main(String[] args)
	{
		new TestGenerics4().go();
	}
	
	public void go()
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		System.out.println("Mixed ArryList:");
		
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		animals.add(new Cat());
		
		takeAnimals(animals);
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		System.out.println("");
		System.out.println("Dog ArryList:");
		
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());
		
		takeAnimals(dogs);
		
		ArrayList<Cat> cats = new ArrayList<Cat>();
		
		System.out.println("");
		System.out.println("Cat ArryList:");
		
		cats.add(new Cat());
		cats.add(new Cat());
		cats.add(new Cat());
		cats.add(new Cat());
		
		takeAnimals(cats);
	}
	
	public void takeAnimals(ArrayList<? extends Animal> animals)
	{
		for(Animal a: animals)
		{
			a.action();
		}
	}
}
