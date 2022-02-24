# Chapter 4. 코드 짜기
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

코드는 변수에 naming이 필요하다.
RAM, HDD


int 	num = 1;
(넌 타입이 뭐니? + 연산자는 숫자일땐 덧셈, 문자일땐 이어주기를 하기 때문에)
(naming을 해줘서 나중에 사용할때 얘를 기준으로 호출한다.)
(숫자 형식을 갖고 있는 num 이라는 아이에 1을 할당해 주는 것이다.)
공책에 빈 상자를 그리고 int 라고 타입 적어주고 이름은 num 이고 안에 1을 갖고 있다. ==> RAM에 저장되는 것이다.
(RAM은 휘발성 저장공간... 프로그램이 꺼지면 num은 사라진다. HDD는 비휘발성 저장공간으로 데이터를 저장한다)

int num1 = 1;
int num2 = 1;
int num3 = num1 + num2;
sysout(num3);


간략하게 해보면 int num = 1+1; 을 하면 프로그램은 내부적으로 가상의 변수를 만들어서 1을 넣고 더하고 최종결과를 num에 저장해주는 것이다.


그럼 이렇게 구구단을 출력해보자


```java
public class main {
    public static void main(String[] args){
        System.out.println("문자를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        String test = scan.nextLine();
        System.out.println(test);
    }
}
```

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