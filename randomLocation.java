import java.util.*;

public class randomLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
		
	ArrayList<String> fortniteMap = new ArrayList<String>();
	fortniteMap.add("Anarchy Acres");
	fortniteMap.add("Dusty Depot");
	fortniteMap.add("Fatal Fields");
	fortniteMap.add("Flush Factory");
	fortniteMap.add("Greasy Grove");
	fortniteMap.add("Haunted Hills");
	fortniteMap.add("Junk Junction");
	fortniteMap.add("Lonely Lodge");
	fortniteMap.add("Loot Lake");
	fortniteMap.add("Lucky Landing");
	fortniteMap.add("Moisty Mire");
	fortniteMap.add("Pleasant Park");
	fortniteMap.add("Retail Row");
	fortniteMap.add("Salty Springs");
	fortniteMap.add("Snobby Shores");
	fortniteMap.add("Shifty Shafts");
	fortniteMap.add("Tilted Towers");
	fortniteMap.add("Jitomate Town");
	fortniteMap.add("Wailing Woods");
	
	System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
	System.out.println("Welcome to the Fortnite Random Town Generator!");
	System.out.println("Where we dropping boys?");
	System.out.println("Are you ready (y/n)?");
	System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
	String resp = scan.next();
	System.out.println();
	
		boolean finished = false;
		while (!finished && resp.equals("y"))
		{		
			for (String landingLocation : fortniteMap)
			//for (int i = 0; i < fortniteMap.size(); i++)
			{
				System.out.println("You will be landing at " + fortniteMap.get(rand.nextInt(fortniteMap.size())) + ".");
				break;
			}
				
				System.out.println("Are you content with your landing location (y/n) ?");
				String rsp = scan.next();
					if(rsp.toLowerCase().contains("y"))
					{
						finished = true;
						System.out.println("May victory be on your side vrother. DROP!");
					}
			
		}
	}
}
