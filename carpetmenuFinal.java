package assignmentCode;
import java.util.ArrayList;

import general.*;
public class Test2 {

	
	static double length=0, width=0, area=0;
	static int in=0;
	static ArrayList<String> service =new ArrayList<String>();
	static ArrayList<Double> cost= new ArrayList<Double>();
	public static void main(String[] args) {
		int mainOpt = 0;
		double sum=0;

		length=Lib.validDoubleRange("\n\tPlease enter the length of your room in Meters: ", 1.0, 1000000.0);

		width=Lib.validDoubleRange("\n\tPlease enter the width of your room in Meters: ", 1.0, 1000000.0); 
		area=length*width;

		System.out.printf("\n\tArea is%7.2f sqr Metres!",area );
		do {
			mainMenu();
			mainOpt=Lib.intRange("\n\tPlease select an option: ", 1, 5);
			
			switch (mainOpt)
			{
			case 1: carpetMenu(area);
			break;
			case 2: Opt2(); 
			break;
			case 3: Opt1(); 
			}
			
			
			
		} while (mainOpt !=4);


		
		for (int i= 0;i<in;i++) 
		{
			System.out.print("\n\t"+service.get(i));
			System.out.printf("\t£%7.2f",cost.get(i));
			System.out.print("\n");
		}



		for (int i=0;i<in;i++) 
		{
			sum += cost.get(i);	
		}

		System.out.printf("\n\tYour total is: \t\t£%7.2f",sum);
	}

	public static void mainMenu() 
	{
		Lib.p("\n\n\tM A I N  M E N U\n\n\t1 Carpet\n\t2 Wood Flooring\n\t3 Tiles\n\t4 Get Bill");
	}
	
	
	
	public static void Opt1() 
	{
		Lib.p("\n\t Opt 1");
	}
	
	public static void Opt2() 
	{
		Lib.p("\n\t Opt 2");
	}
	
	public static void carpetMenu(double area) 
	{
		double mainPrice1 = 12.59, mainPrice2 = 14.39, mainPrice3 = 17.59, mainPrice4 = 19.59, mainPrice5 = 20.99; 
		double mainCost = 0.0, newarea = 0.0;
		int mainOpt = 0;
		boolean YN =false;
		char confirm = 'y';
		double fittingCost = 0.0;
		
		
		Lib.p("\n\tThank you for choosing our Carpet Service!");
		
		//length=Lib.validDoubleRange("\n\nPlease enter the length of your room in meters: ", 1, 100000);
		//width=Lib.validDoubleRange("\n\nPlease enter the width of your room in meters: ", 1, 100000);
		
		
		    carpetMenuV();
			mainOpt = Lib.intRange("\n\tPlease select the carpet you wish to install: ", 1, 6);
			
			switch (mainOpt)
			{
			case 1:
				opt1();
				mainCost=mainPrice1*area;
				in++;
				cost.add(mainCost);
				 service.add("Vienna Sandstone");
				extraMenu(area);
				break;
			case 2:
				opt2();
				in++;
				mainCost=mainPrice2*area;
				cost.add(mainCost);
				 service.add("Chicago Thunderstorm");
				extraMenu(area);
				
				break;
			case 3:
				opt3();
				in++;
				mainCost=mainPrice3*area;
				cost.add(mainCost);
				 service.add("Seattle Latte");
				extraMenu(area);
				
				break;
			case 4:
				opt4();
				in++;
				mainCost=mainPrice4*area;
				cost.add(mainCost);
				 service.add("Cairo Brushed Cotton");
				extraMenu(area);
				
				break;
			case 5:
				opt5();
				in++;
				mainCost=mainPrice5*area;
				cost.add(mainCost);
				 service.add("Toronto Lavastone");
				extraMenu(area);
				break;}
				
				do {
					confirm=Lib.validChar("\n\n\tWould you like Fitting(Y/N)");
					in++;

					if (confirm=='Y'|| confirm=='y' ) {


						if(area<=20) 
						{
							fittingCost=125.00;
							cost.add(fittingCost);
							service.add("Up to 20sqr Metre fitting!");
						}
						
						if(area>20 || area<=40) 
						{
							fittingCost=200.00;
							cost.add(fittingCost);
							service.add("Between 20-40sqr Metre fitting!");
						}
						
						if( area>40) 
						{newarea=area-40;
						
						fittingCost=newarea*4+200;
						cost.add(fittingCost);
						service.add("Above 40sqr Metre fitting!");
						}
						
						
						YN=true;}


					else if (confirm=='N'|| confirm=='n' ) 
						{
						System.out.println("");
						YN=true;
						}

					else 
					{
						System.out.println("Please enter Yes or No");
					}
				
			}while (YN == !true);
	}
	
	
	public static void opt1()
	{
		Lib.p("\n\tVienna Sandstone selected!!! \n\n");
	}
	
	public static void opt2()
	{
		Lib.p("\n\tChicago Thunderstorm selected!!!\n\n");
	}
	
	public static void opt3()
	{
		Lib.p("\n\tSeattle Latte selected!!! \n\n");
	}
	
	public static void opt4()
	{
		Lib.p("\n\tCairo Brushed Cotton selected!!! \n\n");
	}
	public static void opt5()
	{
		Lib.p("\n\tToronto Lavastone selected!!! \n\n");
	}
	
	public static void carpetMenuV()
	{
		Lib.p("\n\n\tC A R P E T   M E N U\n\n\t[1] - Vienna Sandstone \t\t- £12.59\n\t[2] - Chicago Thunderstorm \t- £14.39\n\t[3] - Seattle Latte \t\t- £17.59\n\t[4] - Cairo Brushed Cotton \t- £19.59"
				+ "\n\t[5] - Toronto Lavastone \t- £20.99\n\t[6] - CONTINUE\n");
		
	}
	
	public static void extraMenu(double area)
	{
		Lib.p("\n\tE X T R A S   M E N U\n\n\t[1] - Underlay \t\t- (Super 8mm roll)\n\t[2] - Underlay \t\t- (High Density 11mm Roll)"
				+ "\n\t[3] - Carpet Grippers   - (15m Strip)\n\t[4] - NONE");
	
		double subPrice1 = 49.99, subPrice2 = 89.99, subPrice3 = 9.95;
		double subCost = 0.0, totalbag=0.0;
		int extMenu = 0;
		
		
			
			extMenu = Lib.intRange("\n\n\tPlease select the extras you wish to add: ", 1, 4);
			switch (extMenu)
			{
			case 1:
				Lib.p("\n\tUnderlay - Super 8mm Roll selected!");
				in++;
				totalbag = area/15;
				totalbag = Math.ceil(totalbag);
				subCost = totalbag*subPrice1;
				service.add("We recommend "+totalbag+" Super 8mm Roll(s)");
				cost.add(subCost);
				
				break;
			case 2:
				Lib.p("\n\tUnderlay - High Density 11mm Roll selected!");
				in++;
				totalbag = area/15;
				totalbag = Math.ceil(totalbag);
				subCost = totalbag*subPrice2;
				service.add("We recommend "+totalbag+" High Density 11mm Roll(s)");
				cost.add(subCost);
				break;
			case 3:
				Lib.p("\n\tCarpet Grippers selected!");
				in++;
				totalbag = area/15;
				totalbag = Math.ceil(totalbag);
				subCost = totalbag*subPrice3;
				service.add("We recommend "+totalbag+" Carpet gripper(s)");
				cost.add(subCost);
				break;
			}
			
			
		
	}
	
	
}
