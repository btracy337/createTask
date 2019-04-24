package controller;
import view.Frame;
public class Controller
{
private Frame appFrame;
public void start()
{

}
public Controller()
{
	appFrame = new Frame(this);
}
public long factorialGenerate(long n)
{
	long factorial = 1;
	for(long i = 1; i <= n; i++)
	{
		factorial *= i;
	}
	return factorial;
}
public long Permutations(long n, long r)
{
	long permutations = (factorialGenerate(n)) / (factorialGenerate(n-r));
	return permutations;
}
public long Combinations(long n, long r)
{
	long combinations = (factorialGenerate(n)) / ((factorialGenerate(r)) * (factorialGenerate(n-r)));
	return combinations;
}
public long permutationsWithRepition(long n, long r)
{
	long permutationsWithRepition = (long)Math.pow(n,r);
	return permutationsWithRepition;
}
}
