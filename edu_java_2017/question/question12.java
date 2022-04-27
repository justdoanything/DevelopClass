/*
 * 은행계좌 프로그램
 */
package edu_java_2017.question;

import java.util.Scanner;

class bankCustomer
{
}



public class question12 
{
	static Scanner scan = new Scanner(System.in);
	static bankCustomer[] Bcus = new bankCustomer[100];
	static int cusCnt = 0;

	
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.print("[[ (1)신규계좌발급, (2)입금, 출금, 송금 (3)조회, (4)종료 ]] >> ");
			int menuInput = inputExcep();
			
			if(menuInput == 1)
				makeAccount();
			else if(menuInput == 2)
				selectMoney();
			else if(menuInput == 3)
				readAccount();	
			else if(menuInput == 4)
			{
				System.out.println("  [[ 프로그램을 종료합니다. ]]");
				break;
			}
			else
				System.out.println("  [ 메뉴 선택값이 잘못되었습니다. 다시 입력해주세요. ]\n");
		}
	}
	
	static void makeAccount()//신규계좌발급
	{
	}
	
	static String makeRandAccountNumber()//랜덤 계좌번호 반환
	{
		return "";
	}
	
	static int jungbok(String nameORaccount)//이름, 계좌번호가 같은지 체크, 같으면 해당 인덱스 반환, 중복이 없으면 -1 반환
	{		
		return -1;
	}
	
	static void selectMoney()//계좌 조회 -> 입금,출금,송금 선택
	{
	}
		
	static void depositMoney(String input_name, String accountNum)//입금
	{
	}
	
	static void withdrawMoney(String input_name, String accountNum)//출금
	{
	}
	
	static void sendMoney(String input_name, String sendAccountNum)//송금
	{
	}
	
	static void readAccount()//조회
	{
	}

	static void searhAllAccount()//전체 계좌 조회
	{
	}
	
	static boolean searchNameAccount(String input_name)//이름에 해당하는 계좌 조회, 해당 이름의 계좌가 없으면 false, 있으면 true 반환
	{
		return false;
	}
	
	static int checkAccount(String accountNum)//유효한 통장 번호인지 검사, 유효하면 인덱스, 무효하면 -1 반환
	{
		return -1;
	}
	
	//...
	static int inputExcep()
	{
		return -1;
	}		
}
