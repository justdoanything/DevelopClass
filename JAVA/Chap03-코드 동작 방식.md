# Chapter 3. 코드 동작 방식
우리는 한글로 된 책을 읽는 것을 어려워하지 않는다. `위에서 아래로`, `왼쪽에서 오른쪽`으로 읽으면 되기 때문이다. 

프로그램 또한 마찬가지이다. 프로그램도 Code를 `위에서 아래로`, `왼쪽에서 오른쪽`으로 단순히 `빠르게 실행`시 켜줄 뿐이다. 프로그램이 자체적으로 보이지 않는 로직을 추가하거나 하지 않는다. `우리가 보는 그대로 빠르게 실행시켜 줄 뿐이다.`

즉, 언어에 대한 간단한 문법만 이해한다면 프로그램을 독해하는건 비교적 간단하다. 그리고 우리에겐 `Google` 이라는 해답지를 볼 수 있기 때문에 모르는 부분은 검색하면서 해석하면 된다.

따라서 `프로그램 실행`한다는 것은 명확한 `단 1개의 시작점`이 존재한다는 것이다. (Code에 시작점이 여러개라면 시작할 시작점을 반드시 1개만 정해줘야 한다.)

```java
/* hello.java */
package JAVA.Code;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello! World!");
    }
}
```
위에 있는 간단한 Java 코드를 보자. Code를 실행하면 우리가 시작점을 알려주지 않아도 프로그램은 "Hello! World!" 라는 문장이 출력한다. 

위에서 `1개의 시작점`을 지정해줘야 한다고 했는데 우리는 따로 지정하지 않았음에도 불구하고 Code가 동작한 이유는 Java에선 `public static void main(String[] args) { }`가 시작점이라고 약속했기 때문이다.

즉, Code를 시작하면 Visual Code는 시작점인 `main` 함수를 찾아서 그 안에 있는 코드를 실행한다. 그리고 `main` 함수에서 가장 첫 줄인 `System.out.println("Hello! World!");` 실행한다. 

이 명령어는 TERMINAL에 "Hello! World!" 를 출력하라는 명령어인데 `System.out.println`은 Java에서 기본적으로 제공하는 함수 중에 하나이다. 우리가 고급언어로 `System.out.println()`을 적으면 Visual Code는 `"TERMINAL에 괄호 안에 있는 문구를 출력하라."` 라는 기계어로 번역해주고 컴퓨터는 그 기계어를 실행한다.

`System.out.println("Hello! World!")` 코드를 보면 마침표(.)가 있는 것을 볼 수 있다. 마침표(.)는 상위 카테고리에서 세부 카테고리로 넘어갈 떄 사용한다고 보면 된다. 

예를들어 TV 중에 OLED, LCD가 있고 OLED는 65인치, 75인치이고 LCD는 32, 45인치가 있다고 해보자. 이를 Java식으로 표현하면 아래와 같다.\
TV.OLED.65\
TV.OLED.75\
TV.LCD.32\
TV.LCD.45

Java가 기본적으로 제공하는 함수들이 많은데 그 중에서 `System` 안에 있는 `out` 안에 있는 `println` 이라는 함수를 사용할 때 `System.out.println` 라고 표현한다. println만 쓸 수 있는 방법이 있지만 지금은 다루지 않는다.

### - 참고
Java는 프로그램이 실행될 때, 프로그램이 Code 전체를 읽은 후에 실행된다.\
C언어는 첫 줄부터 하나씩 읽으면서 바로바로 실행한다.

이 차이점은 나중에 함수(method)를 다룰 때 다시 설명할 예정이다.