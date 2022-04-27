/*
 * 지명과 위치정보 관리
 */
package edu_java_2017.question;

import java.util.HashMap;
import java.util.Scanner;

class Location
{
	String name;
	double hardness; //경도
	double latitude; 	//위도
	String HardLati;
	
	HashMap<String, String> location = new HashMap<>();
	
	Location(String Name, String hard, String lati)
	{
	}
}


public class question06 
{
	static Scanner scan = new Scanner(System.in);
	static Location[] loc =new Location[100];
	
	public static void main(String[] args) 
	{
		String input;
		
		insertLocation();
		
		System.out.println("원하는 지명을 입력하세요 : ");
		input = scan.nextLine();
		
		check(input);
	}
	
	static void insertLocation()
	{
	}
	
	static void check(String input)
	{
	}
}
