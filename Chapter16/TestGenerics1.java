package Chapter16;

import java.util.*;

public class TestGenerics1 
{
	public static void main(String[] args)
	{
		new TestGenerics1().go();
	}
	
	public void go()
	{
		Animal[] animals = {new Dog(), new Cat(), new Dog()};
			//Declare and create an Animal array, that holds both dogs and cats.
		
		Dog[] dogs = {new Dog(), new Dog(), new Dog()};
			//Declare and create a Dog array, that holds only Dogs(the compiler
			//won't let you put a cat in).
		
		takeAnimals(animals);
		takeAnimals(dogs);
			//Call takeAnimals(), using both array types as arguments 
	}
	
	public void takeAnimals(Animal[] animals)
	{		//The crucial part is that the takeAnimals() method can take an Animal[]
			//or a Dog[], since Dog IS-A Animal. Polymorphism in action.
		
		for(Animal a: animals)
		{
			a.action();
			//Remember, we call ONLY the methods declared in type animals, since 
			//the animals parameter is of type Animal array, and we didn't do any 
			//casting. (What would we cast it to? That array might hold both Dogs and Cats)
		}
	}
}
