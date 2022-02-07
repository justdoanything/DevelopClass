# Chapter 3. 코드 실행
코드는 위에서 아래로, 왼쪽에서 오른쪽으로 실행을 빠르게 해주는 것뿐이다.
프로그램을 "시작" 한다는 것은 출발점이 있다는 것이고 출발점은 반드시 1개여야 한다.
그 "시작점"은 Java에선 "public static void main(String[] args)" 이다.
프로그램을 시작하면 VS Code는 main method를 찾아서 실행한다.
(C언어는 위에서부터 하나씩 실행하고 JAVA는 코드 전체를 한번 읽고 그다음 실행한다.)
(프로그램에서 main method가 2개일 경우, 시작하는 함수를 명시해줘야한다.)

코드의 맨 위에서부터 한줄씩 보면 된다.
TV - OLED, LCD - 65인치 같이 상위 카테고리에서 세부 카테고리로 갈때 JAVA는 . 으로 표기한다.

public class main {
    public static void main(String[] args){
        System.out.println("문자를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        String test = scan.nextLine();
        System.out.println(test);
    }
}

import java.util.Scanner;
	java가 기본으로 제공하는 기능 중에서 Scanner를 사용하기 위해서 명시.
	java 안에 util 안에 Scanner 라는 객체를 사용하겠다. 즉 사전을 미리 가져오는 것이다.
	이런게 없이 import java.*; 으로 전체 기능을 가져올 수 있는데 그럼 불필요한 기능까지 가져오기 때문에 용량이 커지고 프로그램이 무거워진다.
	
System.out.println("문자를 입력하세요 : ");
  영어(고급언어)로 콘솔에 "문자를 입력하세요 : "를 출력해라는 명령어이다.
  기본 기능들로 별도의 표기 없이 사용할 수 있다.

Scanner scan = new Scanner(System.in);
	Scanner를 사용하겠다고 명시한거.
String test = scan.nextLine();
	scan이 받은 문자를 test에 저장
System.out.println(test);
	test를 출력