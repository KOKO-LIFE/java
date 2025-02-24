import java.util.Scanner;
import java.util.Random;
public class SpinSlotMachine{
	public static void main(String[] args){
	/*	Random rand = new Random();*/
		Scanner sc = new Scanner(System.in);
		/*int ran1 = rand.nextInt(5) + 0;
		int ran2 = rand.nextInt(5) + 0;
		int ran3 = rand.nextInt(5) + 0;*/

		String spin1 = "";
		String spin2 = "";
		String spin3 = "";
		String repeat = "yes";
		String playAgain ="";

		int totalMoney = 0;
		int round = 1;
		int winPrice = 0;

		while (repeat.equals("yes")) {

			System.out.println("Round " +round);
			System.out.println();

			System.out.print("Enter the amount of money to insert into the machine: ");
			int money = sc.nextInt();
			while (money <= 0) {
				System.out.println("invalid Input!");
				System.out.print("Enter the amount of money to insert into the machine again(positive non-zero): $");
				money = sc.nextInt();
			}//input valid in (money)

			int div = money / 100;

			spin1 = spinSlotMachine1(div);//METHOD CALLING
			spin2 = spinSlotMachine1(div);//METHOD CALLING
			spin3 = spinSlotMachine1(div);//METHOD CALLING

			winPrice  += calculateWinnings(spin1, spin2, spin3, money);//METHOD CALLING

			totalMoney += money;

			System.out.println();
			


			

				System.out.println("If you want play again  the game, Enter the yes or no: ");
				playAgain = sc.nextLine();


			boolean check = true;
			while (check) {



				if (playAgain.equals("yes") || playAgain.equals("no")) {
					repeat = playAgain;
					check = false;
					
				}
				else {
					System.out.print("Enter the again yes or no: ");
					
					playAgain = sc.nextLine();					
				}

				

			}//nested while loop 
			// round++;
			// repeat = playAgain;
			System.out.println();
		}//while

		System.out.println();
		System.out.println("***Final stats After the entire game***");
		System.out.println("Total Money entered: " + totalMoney);
		System.out.print("Total money won: "+ winPrice);




	}//main
	public static String spinSlotMachine1( int div){
		Random rand = new Random();
		int ran1 = rand.nextInt(5) + 0;
		


			String str1 = "";
			for(int i = 0; i <= 5; i++){
				if(ran1 == 1){
					str1 = "Melon";
				} else if(ran1 == 2){
					str1 = "Bars";
				} else if(ran1 == 3){
					str1 = "Cherries";
				} else if(ran1 == 4){
					str1 = "Oranges";
				} else if(ran1 == 5){
						str1 = "Plums";
				} else {
					str1 = "bells";
				}

			}//for

			return str1;
	}//Spin1 METHOD CALLING (spinSlotMachine1() )

		/*public static String spinSlotMachine2( int div){
		Random rand = new Random();
		int ran2 = rand.nextInt(5) + 0;
		


			String str2 = "";
			for(int i = 0; i <= 5; i++){
				if(div == ran2){
					str2 = "Plums";
				} else if(div == ran2){
					str2 = "Cherries";
				} else if(div == ran2){
					str2 = "Bars";
				} else if(div == ran2){
					str2 = "bells";
				} else if(div == ran2){
					str2 = "Oranges";
				} else {
					str2 = "Melon";
				}

			}//for

			return str2;

		}//Spin2 METHOD CALLING (spinSlotMachine2() )
		public static String spinSlotMachine3( int div){
		Random rand = new Random();
		int ran3 = rand.nextInt(5) + 0;


			String str3 = "";
			for(int i = 0; i <= 5; i++){
				if(div == ran3){
					str3 = "Melon";
				} else if(div == ran3){
					str3 = "Plums";
				} else if(div == ran3){
					str3 = "Cherries";
				} else if(div == ran3){
					str3 = "Bars";
				} else if(div == ran3){
					str3 = "bells";
				} else {
					str3 = "Oranges";
				}

			}//for

			return str3;
	}//Spin3 METHOD CALLING (spinSlotMachine3() )*/

	public static int calculateWinnings(String spin1, String spin2, String spin3, int moneyEntered){

			int totalMoney;
			if( spin1.equals(spin2) || spin1.equals(spin3) || spin2.equals(spin3)){
				System.out.println("Your Spun: "+ spin1+ ", " + spin2 +", " + spin3);
				System.out.println();
				totalMoney = moneyEntered * 2;




			} else if(spin1.equals(spin2) && spin1.equals(spin3)){
				System.out.println("Your Spun: "+spin1+ ", " + spin2 +", " + spin3);
				System.out.println();
				totalMoney = moneyEntered * 3;



			}else {
				System.out.println("Your Spun: "+spin1+ ", " + spin2 +", " + spin3);
				System.out.println();
				totalMoney = moneyEntered * 0;

			}
			System.out.println("You Win: $"+ totalMoney);
			return totalMoney;//return to main method integer



	}//calculateWinnings()






}//class