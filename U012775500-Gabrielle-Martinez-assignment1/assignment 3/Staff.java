//PP 10.1
public class Staff implements Payable 
{	
	StaffMember[] staffList;
	//-----------------------------------------------------------------
	// Sets up the list of staff members.
	//-----------------------------------------------------------------
	public Staff ()
	{
		staffList = new StaffMember[6];
		staffList[0] = new Executive ("Sam", "123 Main Line",
				"555-0469", "123-45-6789", 2423.07);
		staffList[1] = new Employee ("Carla", "456 Off Line",
				"555-0101", "987-65-4321", 1246.15);
		staffList[2] = new Employee ("Woody", "789 Off Rocker",
				"555-0000", "010-20-3040", 1169.23);
		staffList[3] = new Hourly ("Diane", "678 Fifth Ave.",
				"555-0690", "958-47-3625", 10.55);
		staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.",
				"555-8374") ;
		staffList[5] = new Volunteer ("Cliff", "321 Duds Lane",
				"555-7282");
	//	staffList[6] = new Commission("William", "154 Blackfriars",
	//			"555-8516", "551-58-5854", 6.25, .20 );
	//	staffList[7] = new Commission("Kit", "935 Malibu Road", 
	//		"555-5485", "875-82-8965", 9.75, .15);
	//	((Executive)staffList[0]).awardBonus (500.00);
	/*	((Hourly)staffList[3]).addHours (40);
		((Commission)staffList[6]).addHours(35);
		((Commission)staffList[7]).addHours(40);
		((Commission)staffList[6]).setSales(400);
		((Commission)staffList[7]).setSales(950);
	*/
	}
	//-----------------------------------------------------------------
	// Pays all staff members.
	//-----------------------------------------------------------------
	
	@Override
	public void payday() 
	{
		double amount;
		for (int count=0; count < staffList.length; count++)
		{
			System.out.println (staffList[count]);
			amount = staffList[count].pay(); // polymorphic
			if (amount == 0.0)
				System.out.println ("Thanks!");
			else
				System.out.println ("Paid: " + amount);
			System.out.println ("------------------------------------");
		}
	}
//PP 10.2
	@Override
	public void vacation() {
		for (int count=0; count < staffList.length; count++)
		{
			System.out.println (staffList[count]);
			System.out.println("# of vacation days allowed: " + 
					staffList[count].vacationDays());
			System.out.println ("------------------------------------");
		}
	}
	
}
