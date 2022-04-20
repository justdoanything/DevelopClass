# Chapter 6. 입력받고 출력하기

- ### 예제코드
  실제 프로그램에선 잘 사용하지 않지만 코딩 테스트나 Java를 연습할 때 임의의 입력을 받기 위해서 사용하는 `Scanner` 객체가 있다. Java에서 기본으로 제공하는 Class이다.
  ```java
  /* 예제 코드 */
  import java.util.Scanner;
  public class PrintString {
      public static void main(String[] args) {
          System.out.println("문자를 입력하세요 : ");
          Scanner scan = new Scanner(System.in);
          String inputString = scan.nextLine();
          System.out.println("입력한 문자 : " + inputString);
      }
  }
  ```

- ### 코드 분석

```java
import java.util.Scanner;
```

- java가 기본으로 제공하는 기능 중에서 Scanner를 사용하기 위해서 명시한다.
- java 안에 util 안에 Scanner 라는 객체를 사용하겠다. 즉 사전을 미리 가져오는 것이다.
- `import java.*;`로 전체 기능을 가져올 수 있는데 그럼 불필요한 기능까지 가져오기 때문에 코드의 용량이 커지고 프로그램이 무거워진다.

```java
System.out.println("문자를 입력하세요 : ");
```

- 영어(고급언어)로 Console 창에 "문자를 입력하세요 : "를 출력하라는 명령어이다.
- 기본 기능으로 `import`를 별도로 표기하지 않아도 사용할 수 있다.

```java
Scanner scan = new Scanner(System.in);
```

- Scanner를 사용하겠다고 명시하고 변수로 선언했다.

```java
String test = scan.nextLine();
```

- 사용자가 입력을 할 수 있도록 `scan.nextLine();` 를 사용한다.
- 입력 받은 문자는 `test` 라는 변수에 저장한다.

```java
System.out.println(test);
```

- 변수 `test`에 저장된 문자를 출력한다.

- ### 코드 모양
  대괄호의 위치는 사람마다 다를 수 있지만 통일성 있게 작성하는 것이 중요하고 JAVA는 대부분 아래와 같이 `Code` 작성 후 바로 `오른쪽`에 대괄호를 작성한다.
  - JAVA
    ```java
    public class PrintString {
      public static void main(String[] args) {
        ...
      }
    }
    ```
  - C#과 같은 코드는 아래와 같이 `Code` 작성 후 `아래쪽`에 대괄호를 작성한다.
  ```java
  public class PrintString
  {
    public static void main(String[] args)
    {
      ...
    }
  }
  ```
