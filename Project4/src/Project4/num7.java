package Project4;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int won = 0;
		int won1 = 0;
		String choice = "0";
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------");
			
			System.out.print("선택 > ");
			choice = sc.nextLine();
			if(choice.equals("1")) {
				System.out.print("예금액 > ");
				won1 = sc.nextInt();
				sc.nextLine();
				won = won + won1;
			} else if (choice.equals("2")) {
				System.out.print("출금 > ");
				won1 = sc.nextInt();
				sc.nextLine();
				won = won - won1;
			} else if (choice.equals("3")) {
				System.out.println("잔고 > " + won);
			} else if (choice.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
