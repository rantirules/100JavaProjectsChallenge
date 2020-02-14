import java.util.Scanner;
public class Question_05_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int userInput = input.nextInt();
        int spaceControl = ((userInput * 2) - 2);
        int num = 1;
        String spaces = " ";
        for (int i = 1; i<= userInput; i++) { // line control
            for (int k = spaceControl; k>=0; k-=1 ) { // Controls the number of spaces
                System.out.print(spaces);
            }
                for (int l = i; l>=1; l--) { // controls the descending part of the pyramid
                    System.out.print(l + " ");
                }
                for (int j = 2; j<=i; j++) { // controls the ascending part of the pyramid
                    System.out.print(j + " ");
                }
            System.out.println();
            spaceControl-=2;
        }
	}
}