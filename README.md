# DevelopClass

1. Visual Code 설치
https://code.visualstudio.com/download

2. JDK 설치 (11 버전 이상)
https://www.oracle.com/java/technologies/downloads/#jdk17-windows

3. vs code에 java extension 설치
Extension Pack for Java

4. 프로젝트 생성
폴더 생성하고 main.java 파일 생성

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("문자를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        String test = scan.nextLine();
        System.out.println(test);
    }
}


5. 추가로 확인해야할 설정
설정 > JAVA > DEBUG > Settings: Cosole : integratedTerminal 확인
ctrl + , > Terminal 검색해도됨



설명해야될거
1. 코드를 실행시켰을 때 돌아가는 방식
우린 VS Code에 영어로된 명령어를 입력하고 프로그램을 "RUN" 했다.
실제 컴퓨터는 0,1로만 이루어져있기 때문에
우리가 프로그램을 실행시키면 VS code는 영어로 된 명령어를 컴퓨터가 이해할 수 있는 문자로 변환시켜주고
변환된 코드를 컴퓨터가 실행시키는 것이다.
컴파일러가 고급언어에서 기계어로 바꿔준다. (자연어) --> (기계어)


2. 프로그램이 동작하는 방식에 대해서 설명해주기
우리가 컴퓨터라는걸 구매하면 H/W가 온다.
(HW)
아무것도 하지 않은채 전원을 바로 키면 ? 아무것도 실행이 되지 않는다.
그래서 우린 처음에 운영체제(OS)를 설치해줘야한다.
Windows, Mac, Linux 등 다양한 운영체제가 존재한다.
(OS)
(HW)
그다음 우리는 JDK와 Visual Code를 설치했다.
여기서 JDK라는건 JVM을 설치하는건데 우리가 짠 Java 코드를 실행시킬 때 필요하다.
JVM이 Java 코드를 실행시켜주는 것이고 OS와 독립적으로 수행한다.
우리가 C, C# 같은 언어는 Windows OS에 종속을 받기 때문에 윈도우에서만 실행할 수 있고 아래 구조로 실행된다.
(Code)
(OS)
(HW)

하지만 JAVA는 JDK (JVM)을 설치했고 JVM이 코드를 실행시켜준다. 따라서 OS에 종속적이지 않게 실행시킬 수 있다.
JAVA는 vscode가 .class 변환해주고 JVM이 .class 파일을 실행시켜 준다.
C언어는 빌드하면 .exe 파일을 만들어주고 .exe파일을 실행하는데 .exe는 MAC에서 돌아가지 않는다.
.exe 파일은 Windows OS단과 합쳐서 동작하기 때문이다
(Code)
(JVM)
(OS)
(HW)

컴퓨터는 0,1 밖에 모르고 더하기 밖에 못한다.
ADD, SUB, SAVE 등 어셈블리어로 변환하고 실행한다.


3. 코드 실행
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
  

4. 코딩은 절차지향
코드는 한줄씩 실행한다고 했다. 
편의점에가서 음료수를 사온다.를 코딩해보자.
	편의점에 간다.
	음료수를 고른다.
	돈을 낸다.

더 자세하게 써보면,
	자리에서 일어난다.
	카페를 나간다.
	편의점을 찾는다.
	편의점으로 걸어간다.
	편의점에서 음료수를 고른다.
	음료수를 집어든다.
	음료수를 카운터로 가져간다.
	돈을 지불한다.
	...
	
더 자세하게 써보면,
	무릎을 n도로 몇 회전력으로 핀다.
	...
	
이렇게 한줄한줄씩 코딩을 하면 된다.
그럼 1+1를 출력하는 것을 코딩해보자.

1+1; 에러가 난다.

1을 준비한다.
1을 준비한다.
2개를 더한다.
더한 것을 출력한다.

코드는 
RAM, HDD




** 우리는 시험을 보는게 아니기 때문에 찾으면서 하는 방법을 터득해야 나중에 혼자서도 잘할 수 있다.
