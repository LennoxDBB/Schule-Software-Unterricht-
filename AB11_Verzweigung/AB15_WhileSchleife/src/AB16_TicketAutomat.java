import java.text.DecimalFormat;
import java.util.Scanner;

public class AB16_TicketAutomat {
	
	public static void main(String[] args) {
		
		String pattern = ",##0.00";
		DecimalFormat df = new DecimalFormat(pattern);
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int price = 1320;
		int maxTicket = 3;
		String confirm = "";
		
		System.out.print("Geben Sie an wie viele Tickets Sie kaufen möchten\n>> ");
		int ticketAmount = scanner.nextInt();
		
		//TICKET ANZAHL CHECK
		if(ticketAmount > maxTicket) {
			System.out.println("Sie können nicht mehr als " + maxTicket + " Tickets auf einmal kaufen!");
			scanner.close();
		} else if(ticketAmount <= 0) {
			System.out.println("Sie müssen mindestens ein Ticket kaufen!");
		} else {	
			String s = " Tickets";
			if(ticketAmount == 1) s = " Ticket";
			price *= ticketAmount; 
			System.out.print("Wenn Sie " + ticketAmount + s + " für " + df.format((double) price / 100) + "€ kaufen möchten, tippen Sie 'BESTÄTIGEN'\n>> ");
			confirm = scanner.next();
		}
		
		//TICKET KAUF
		if(confirm.equals("BESTÄTIGEN")) {
			System.out.println("Bitte werfen Sie Münzen ein (in ct bzw. €):");
			while(sum < price)  {
				System.out.print(">> ");
				double input = scanner.nextDouble();
				if(!(input == 10 || input == 20 || input == 50 || input == 1 || input == 2)) {
					System.out.println("Bitte geben Sie eine gültige Währung an! \n[10ct, 20ct, 50ct, 1€, 2€]");
					continue;
				}
				if(input == 1 || input == 2) input *= 100;
				sum += input;
				if(sum < price) {
					System.out.println("[" + df.format((double) sum / 100) + "€ | " + df.format((double) price / 100) + "€]");
				}
			}
			
			//KAUF ABGESCHLOSSEN
			System.out.print("\nVielen Dank für Ihren Kauf!");
			int backMoney, amount, coin;
			backMoney = sum - price;
			amount = 0;
			coin = 0;
			String currency = "ct";
			System.out.println(" (Ihr Rückgeld: " + df.format((double) backMoney / 100) + "€)");
			
			//GELDRÜCKGABE
			while(backMoney > 0) {
				if(backMoney / 100 != 0) {
					amount = backMoney / 100;
					backMoney %= 100;
					coin = 1;
					currency = "€";
				} else if(backMoney / 50 != 0) {
					amount = backMoney / 50;
					backMoney %= 50;
					coin = 50;
				} else if(backMoney / 20 != 0) {
					amount = backMoney / 20;
					backMoney %= 20;
					coin = 20;
				} else if(backMoney / 10 != 0) {
					amount = backMoney / 10;
					backMoney %= 10;
					coin = 10;
				}
				System.out.println("+ " + coin + currency + " (" + amount + "x)");
				currency = "ct";
			}
		} else {
			System.out.println("Der Ticketkauf wurde abgebrochen!");
		}
		scanner.close();
	}
}