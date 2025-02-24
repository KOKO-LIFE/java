import java.util.Scanner;
public class DiamondPatternGenerator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num1 = sc.nextInt();
		while (num1 <= 1) {
			System.out.println("Invalid input! Number of rows!!!");
			System.out.print("Enter the number of rows: ");
			num1 = sc.nextInt();
		}

		for (int i = 1; i <= num1 ; i++ ) {
			String str1 = "";
			System.out.println();
			for (int k = num1; k >= i ; k-- ) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i ;j++ ) {
				System.out.print(str1 + "*");
				str1 = "*";
			}

				
		}

		for (int l = 1; l <= num1 - 1; l++){
			String str2 = "";
					System.out.println();

					for (int j = 2 ; j <= num1  ; j++) {
						System.out.print(" ");
					}
					for (int k = num1 - 1 ; k >= l ; k-- ) {
						String subStr = str2 + "*";
						System.out.print(subStr);
						str2 = "*";
					}
					// str2 = "*";
		}


	}//main
}//class