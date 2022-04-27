/*
 * StringBuffer로 문자 랜덤 변환
 * 
 * ==============Sample Run
 문장을 입력하세요.
apple
apple -> aXple
 */
package edu_java_2017.solution;

import java.util.Random;
import java.util.Scanner;

public class solution01 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("문장을 입력하세요.");
		String inputStr = scan.nextLine();
		
		StringBuffer sb = new StringBuffer(inputStr);
		
		Random rand = new Random();
		int ran = rand.nextInt(inputStr.length());
		
		sb.setCharAt(ran, 'X');
		
		System.out.println(inputStr + " -> " + sb);
	}
}