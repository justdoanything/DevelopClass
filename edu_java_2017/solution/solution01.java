/*
 * StringBuffer로 문자 랜덤 변환
 * 
 * ==============Sample Run
 문장을 입력하세요.
apple
apple -> aXple
 */
package edu_java_2017.solution;

import java.util.Scanner;

public class solution01 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// 문자 입력 받고
		// 입력받은 문자(String a) 저장하고
		// 범위 내에 랜덤한 숫자 생성(int rdInt)
		// 입력받은 문자(a)에서 n번째 선택하고
		// 선택한 n번째를 랜덤한 영문자(b)로 변환
		// 변환한 전체 문자를 출력
		String stringValue = "apple"; // "a,p,p,l,e"
		
		
		System.out.println(stringValue.length());
		System.out.println(stringValue.charAt(4)); // n번째

		// random으로 나온 숫자 범위 : 0 ~ 4
		stringValue.replace("p","X");


		// 난수 (0~4)
		int rand = 3;

		// System.out.println("문장을 입력하세요.");
		// String inputStr = scan.nextLine();
		
		// StringBuffer sb = new StringBuffer(inputStr);
		
		// Random rand = new Random();
		// int ran = rand.nextInt(inputStr.length());
		
		// sb.setCharAt(ran, 'X');
		
		// System.out.println(inputStr + " -> " + sb);

		if(stringValue == null){

		}	
	}
}
