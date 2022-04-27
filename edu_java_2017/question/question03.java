/*
 * 포인트 관리
 */
package edu_java_2017.question;

import java.util.Scanner;
import java.util.Vector;

class Point
{
}

public class question03 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		String input;
		
		Vector<Point> list = new Vector<>();
		
		while(true)
		{
			System.out.print("이름과 포인트 입력 >> (이용우,100)");
			input = scan.nextLine();
		}	
	}
}
