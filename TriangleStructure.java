/*
	Random Structure using Triangles
	Ben Tufano
*/

public class TriangleStructure
{
	public static void main(String[] args)
	{
		// Require Arguments
		if(args.length != 2)
		{
			System.out.println("Error: Expecting 2 arguments...");
			return;
		}

		// accept arguments
		int len = Integer.parseInt(args[0]), wid = Integer.parseInt(args[1]);

		// Declare structure array
		char[][] structure = new char[len][wid];

		// Generate Border
		for(int i = 1; i < len; i++)
		{
			structure[i][0] = '#';
			structure[i][wid - 1] = '#';
		}

		// Generate our Seed
		for(int i = 0; i < wid; i++)
			structure[0][i] = ((int)(Math.random() * 2) == 0 ? ' ' : '#');

		// Fill in spaces with designated pattern
		for(int i = 1; i < len; i++)
			for(int j = 1; j < (wid - 1); j++)
			{
				if(structure[i - 1][j - 1] == '#' && structure[i - 1][j] == '#' && structure[i - 1][j + 1] == '#' ||
					structure[i - 1][j - 1] == ' ' && structure[i - 1][j] == ' ' && structure[i - 1][j + 1] == ' ')
					structure[i][j] = '#';
				else
					structure[i][j] = ' ';
			}

		// Print out the Patterned Structure
		for(int i = 0; i < len; i++)
		{
			for(int j = 0; j < wid; j++)
				System.out.print(structure[i][j]);

			System.out.println("");
		}
	}
}