package weektest5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
    private static List<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = Integer.parseInt(scanner.nextLine());
            switch (selectNo) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {
        System.out.println("--------------");
        System.out.println("계좌생성");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String accNo = scanner.nextLine();
        boolean isFound = findAccount(accNo);

        if (isFound) {
            System.out.println("결과: 이미 존재하는 계좌번호입니다.");
            return;
        }

        System.out.print("계좌주: ");
        String userName = scanner.nextLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account newAccount = new Account(accNo, userName, balance);
        accounts.add(newAccount);
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    private static void accountList() {
        System.out.println("--------");
        System.out.println("2.계좌목록");
        System.out.println("--------");

        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            System.out.println(a.getAccNo() + "\t\t" + a.getUserName() + "\t\t" + a.getBalance());
        }
    }

    private static void deposit() {
        System.out.println("--------");
        System.out.println("3.예금");
        System.out.println("--------");

        System.out.print("계좌번호: ");
        String accNo = scanner.nextLine();

        boolean isFound = findAccount(accNo);

        if (isFound) {
            System.out.print("예금액: ");
            int depositAmount = Integer.parseInt(scanner.nextLine());
            Account account = getAccount(accNo);
            account.setBalance(account.getBalance() + depositAmount);
            System.out.println("결과: 입금이 성공되었습니다");
        } else {
            System.out.println("결과: 잘못된 계좌 번호입니다");
        }
    }

    private static void withdraw() {
        System.out.println("--------");
        System.out.println("4.출금");
        System.out.println("--------");

        System.out.print("계좌번호: ");
        String accNo = scanner.nextLine();

        boolean isFound = findAccount(accNo);

        if (isFound) {
            System.out.print("출금액: ");
            int withdrawAmount = Integer.parseInt(scanner.nextLine());

            Account account = getAccount(accNo);

            if (withdrawAmount <= account.getBalance()) {

                account.setBalance(account.getBalance() - withdrawAmount);

                System.out.println("결과: 출금이 성공되었습니다");
            } else {
                System.out.println("결과: 잔액이 부족합니다");
            }
        } else {
            System.out.println("결과: 잘못된 계좌 번호입니다");
        }
    }

	private static boolean findAccount(String accNo) {
		
		 boolean found = false;
	        for (Account obj : accounts) {
	          if (obj.getAccNo().equals(accNo)) {
	              found = true;
	              break;
	           }
	      }
	        return found;
	}
	private static Account getAccount(String accNo) {
		for (Account account : accounts) {
	        if (account.getAccNo().equals(accNo)) {
	            return account;
	        }
	    }
		return null;
	}
}