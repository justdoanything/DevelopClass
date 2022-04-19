/*
 * 같은 수가 3번 연속 나오면 이기는 게임
 * 

########## Sample Run

첫 번째 플레이어의 이름을 입력하세요 >> 아무개
두 번째 플레이어의 이름을 입력하세요 >> 홍길동
아무키나 누르세요. 

1번째 게임을 진행합니다.
아무개 >> 1 0 2 
홍길동 >> 2 1 0 
승자가 없습니다. 다시 게임을 진행하세요.

아무키나 누르세요. 

2번째 게임을 진행합니다.
아무개 >> 2 0 2 
홍길동 >> 2 1 0 
승자가 없습니다. 다시 게임을 진행하세요.

아무키나 누르세요. 

3번째 게임을 진행합니다.
아무개 >> 0 2 2 
홍길동 >> 0 0 2 
승자가 없습니다. 다시 게임을 진행하세요.

아무키나 누르세요. 

4번째 게임을 진행합니다.
아무개 >> 1 2 0 
홍길동 >> 2 2 1 
승자가 없습니다. 다시 게임을 진행하세요.

아무키나 누르세요. 

5번째 게임을 진행합니다.
아무개 >> 1 0 0 
홍길동 >> 2 2 0 
승자가 없습니다. 다시 게임을 진행하세요.

아무키나 누르세요. 

6번째 게임을 진행합니다.
아무개 >> 2 2 1 
홍길동 >> 0 0 1 
승자가 없습니다. 다시 게임을 진행하세요.

아무키나 누르세요. 

7번째 게임을 진행합니다.
아무개 >> 2 1 2 
홍길동 >> 0 2 1 
승자가 없습니다. 다시 게임을 진행하세요.

아무키나 누르세요. 

8번째 게임을 진행합니다.
아무개 >> 1 2 1 
홍길동 >> 0 0 0 
8번째 만에 홍길동가 이겼습니다.
 */
package edu_java_2017.question;

import java.util.Scanner;

class Player
{
	String Name;
	
	Player(String name)
	{
		this.Name = name;
	}
	
}


public class hw03 
{	
	public static void main(String[] args) 
	{		
		Scanner scan = new Scanner(System.in);
		boolean play01Result = false, play02Result = false;
		
		System.out.print("첫 번째 플레이어의 이름을 입력하세요 >> ");
		Player play01 = new Player(scan.nextLine());
		
		System.out.print("두 번째 플레이어의 이름을 입력하세요 >> ");
		Player play02 = new Player(scan.nextLine());
		
		int cnt = 1;
		
		while(true)
		{
		}
	}
}
