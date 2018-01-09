package Exercise;
public class RanNumMathTestDrive 
{
	public static void main(String[] args)
	{
		int[] numOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int[] numTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		int oneLength = numOne.length;
		int twoLength = numTwo.length;
		
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		
		int ans = rand1 + rand2;
		
		RanNumMath.numOne(rand1);
		RanNumMath.numTwo(rand2);
		RanNumMath.answer(ans);
	}
}
