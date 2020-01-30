package ie.tudublin; // Good practice to have packages. Purpose of packages: Prevents name space conflicts. 

// Changes on the test branch

public class Main {
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}

		for(String s:args)
		{
			System.out.println(s);
		}
	}
}