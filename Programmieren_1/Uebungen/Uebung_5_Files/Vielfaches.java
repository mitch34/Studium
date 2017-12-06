import java.util.Scanner;

public class Vielfaches {
			private String input = "Test";
			private String result = "";
			Scanner in = new Scanner(System.in);
	
		
		public void eingabe() {
		
			
			while(!input.equals("")) {
				System.out.print("String eingeben: ");
				input = in.nextLine();
				
				if (input.equals(""))
				{
					System.out.print("Tschoe!");
				}
				else
				{
					
					for(int i = 1; i < input.length(); i++)
					{
						for(int j = 1; j <= i; j++)
							result += input.charAt(i); 
					}
					
					System.out.println("String++ :" +result);
					result = "";
				}
			}
		}

}