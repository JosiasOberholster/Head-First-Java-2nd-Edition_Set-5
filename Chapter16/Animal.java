package Chapter16;

abstract class Animal 
{
	void action()
	{
		
	}
}

class Dog extends Animal
{
	void action()
	{
		System.out.println("Dog Barking");
	}
}

class Cat extends Animal
{
	void action()
	{
		System.out.println("Cat Purring");
	}
}
