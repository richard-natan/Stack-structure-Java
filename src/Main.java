import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack();
		Scanner scan = new Scanner(System.in);
		int userOption = 0;

		while (userOption != 4) {
			System.out.println("\n\n1 - Push on Top  ||  2 - Remove from top  || 3 - Show Stack  || 4 - Leave");
			userOption = scan.nextInt();

			if (userOption <= 0 || userOption >= 5) {
				System.out.println("Error, choose a valid option!");
			} else {
				String userInput;

				switch (userOption) {
				case 1:
					System.out.println("\nType a text: ");
					userInput = scan.next();
					scan.nextLine();
					stack.pushOnTop(userInput);
					break;

				case 2:
					if (stack.isEmpty()) {
						System.out.println("\nStack Empty!");
					} else {
						System.out.printf("\nRemoving '%s' from top in Stack...\n", stack.getValueOnTop());
						stack.removeFromTop();
						System.out.println("Successful!!");
					}
					break;

				case 3:
					System.out.println("\nLoading Stack...");
					stack.printStack();
					break;

				case 4:
					System.out.println("\n\nLeaving....");
					break;

				}
			}
		}
		scan.close();
	}
}
