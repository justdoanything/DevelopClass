/*
 * 곰과 물고기 
 
 ################ Sample Run
곰 몇 마리 생산할래? (최대 3마리야) >> 1
  [ GOOD : 곰 1마리가 생산되었다! ]

?물고기는 몇마리 생산할래? (최대 10마리야) >> 1
  [ GOOD : 물고기 1마리가 생산되었다! ]


[[ FIELD ]]
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - B - - 
- - - - - - - - - - - - - - - F - - - - 
- - - - - - - - - - - - - - - - - - - - 
  * 곰이 움직일 방향을 선택하세요. 
  * 위(U) / 아래(D) / 왼쪽(L) / 오른쪽(R) >> l
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - B - - - 
- - - - - - - - - - - - - - - F - - - - 
- - - - - - - - - - - - - - - - - - - - 

  * 곰이 움직일 방향을 선택하세요. 
  * 위(U) / 아래(D) / 왼쪽(L) / 오른쪽(R) >> l
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - B - - - - 
- - - - - - - - - - - - - - - F - - - - 
- - - - - - - - - - - - - - - - - - - - 

  * 곰이 움직일 방향을 선택하세요. 
  * 위(U) / 아래(D) / 왼쪽(L) / 오른쪽(R) >> d
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - F B - - - - 
- - - - - - - - - - - - - - - - - - - - 

  * 곰이 움직일 방향을 선택하세요. 
  * 위(U) / 아래(D) / 왼쪽(L) / 오른쪽(R) >> l
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - - - - - - - 
- - - - - - - - - - - - - - B - - - - - 
- - - - - - - - - - - - - - - - - - - - 
  [ GAME COMPLETE : 곰이 물고기를 잡았다!!!! ]

 */
package edu_java_2017.question;

import java.util.Random;
import java.util.Scanner;

//*************************************************** 부모 life 클래스
abstract class life
{
	//행(row), 열(col)
	int row, col;
	
	//이동하는 것을 구현한 move메소드
	//boolean 값을 이용해 이동하는 곳이 유효한 값이면 true, 아니면 false를 반환해 main 함수에서 유효한 턴을 저장하는 Cnt변수 증감에 이용한다.
	abstract boolean move(String direction);
	
	//이동하는 값이 유효한 값인지 아닌지 boolean 값으로 판별, 유효하면 true;
	boolean checkPosition(int row, int col)
	{
		if(row == -1 || row == 10)
			return false;
		if(col == -1 || col == 20)
			return false;
		
		return true;
	}
}


//*************************************************** 자식 bear 클래스
class bear extends life	// 부모 life로부터 변수와 move메소드를 상속 받는 bear 클래스
{
	bear()
	{
		this.row = 0;
		this.col =0;
	}
	
	bear(int row, int col)
	{
		this.row = row;
		this.col = col;
	}

	boolean move(String direction)// 부모 life로 부터 상속받은 추상메소드 move 구현
	{
		return false;
	}
}


//*************************************************** 자식 fish 클래스
class fish extends life		// 부모 life로부터 변수와 메소드를 상속 받는 bear 클래스
{
	fish()
	{
		this.row = 0;
		this.col =0;
	}
	
	fish(int row, int col)
	{
		this.row = row;
		this.col = col;
	}
	
	boolean move(String direction)//bear의 move 메소드와 같은 원리이고 출력만 'B'가 아닌 'F'로 해준다.
	{
		return false;
	}
}


public class question09 
{	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	public static String[][] field = new String[10][20];	//10행 20열의 field 배열
	
	static bear[] bear = new bear[3];	//bear 클래스 
	static fish[] fish = new fish[10]; //fish 클래스
	
	public static void main(String[] args) 
	{
		
	}
}
