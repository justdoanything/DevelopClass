# Chapter 7. 조건문과 함수

### 조건문(if, switch)

반복문은 반복문을 사용하지 않아도 코드 동작에는 이상이 없다. 하지만 조건문은 우리가 `로직`을 만들기 위해선 반드시 필요한 문법이다. 사용법 또한 간단하기 때문에 바로 예제를 살펴보자.

조건문은 `if-else문`, `if-else if-else문`, `switch`문으로 사용할 수 있다.

- #### if문

  - 문법 형식
    ```java
    if( 조건식 ) { 실행할 Code }
    else if ( 조건식 ) { 실행할 Code }
    else { 실행할 Code }
    ```
  - 예제코드
    ```java
    /* 예제 코드 */
    import java.util.Scanner;
    public class PrintString {
        public static void main(String[] args) {
            System.out.println("문자를 입력하세요 : ");
            Scanner scan = new Scanner(System.in);
            String inputString = scan.nextLine();
            System.out.println("입력한 문자 : " + inputString);

            /*
            * if-else문
            */
            if(inputString.equals("apple")){
              System.out.println("입력한 문자는 'apple' 입니다.");
            } else {
              System.out.println("입력한 문자는 'apple'이 아닙니다.");
            }

            /*
            * if-else if-else문
            */
            if(inputString.equals("apple")){
              System.out.println("입력한 문자는 'apple' 입니다.");
            } else if (inputString.equals("bed")) {
              System.out.println("입력한 문자는 'bed' 입니다.");
            } else if (inputString.equals("cat")) {
              System.out.println("입력한 문자는 'cat' 입니다.");
            } else {
              System.out.println("입력한 문자는 'apple'도 'bed'도 'cat'도 아닙니다.");
            }
        }
    }
    ```

- #### switch
  - 문법 형식
    ```java
    switch ( 비교할 객체 ) {
      case 일치조건1 : 
        실행할 코드
        break;
      case 일치조건2 :
        실행할 코드
        break;
      case 일치조건3 : 
        실행할 코드
        break;
      default:
        실행할 코드
        break;
    }
    ```
  - 🚨 주의사항
    - `switch`문에서 `case` 단위로 `break;`를 써줘야 한다. 경우에 따라서 빼주기도 하지만 `break;`가 있고 없고의 차이를 반드시 알아야 한다.
    - `break;` 적지 않으면 코드가 `위에서 아래로 실행`되면서 모든 case를 실행한다.
      ```java
      /*
       * 아래의 코드는 결과는 다음과 같다.
       * ================================ 출력
       * 입력한 문자는 'apple' 입니다.
       * 입력한 문자는 'bed' 입니다.
       * 입력한 문자는 'cat' 입니다.
       * 입력한 문자는 'apple'도 'bed'도 'cat'도 아닙니다.
       */
      switch ( inputString ) {
        case "apple" : 
          System.out.println("입력한 문자는 'apple' 입니다.");
        case "bed" :
          System.out.println("입력한 문자는 'bed' 입니다.");
        case "cat" : 
          System.out.println("입력한 문자는 'cat' 입니다.");
        default:
          System.out.println("입력한 문자는 'apple'도 'bed'도 'cat'도 아닙니다.");
      }
      ```
  - 예제코드

    ```java
    /* 예제 코드 */
    import java.util.Scanner;
    public class PrintString {
        public static void main(String[] args) {
            System.out.println("문자를 입력하세요 : ");
            Scanner scan = new Scanner(System.in);
            String inputString = scan.nextLine();
            System.out.println("입력한 문자 : " + inputString);

            /*
            * switch문
            */
            switch(inputString) {
              case "apple":
                System.out.println("입력한 문자는 'apple' 입니다.");
                break;
              case "bed":
                System.out.println("입력한 문자는 'bed' 입니다.");
                break;
              case "cat":
                System.out.println("입력한 문자는 'cat' 입니다.");
                break;
              default:
                System.out.println("입력한 문자는 'apple'도 'bed'도 'cat'도 아닙니다.");
                break;
            }
        }
    }
    ```

### 함수(Method)

반복문을 사용하고 조건문을 사용해도 `코드`를 여전히 길다. 중복되는 `코드`를 없애고 `재사용성`을 높이고 `가독성`을 높일 수 있다.

- #### Method
  - 중복된 코드를 함수로 분리하고 함수를 호출해서 사용할 수 있다.
  - 함수는 반드시 클래스 안에 작성되어야 한다.
  - 함수를 선언하는 형식\
    `접근제어자` `(static)` `반환할 객체 타입` `함수 이름` ( `파라미터` ) { ... }
    - ###### 접근제어자
      - public : 어떤 class에서도 호출할 수 있음
      - protected : 동일한 package 내에 있는 class이거나 파생된 class에서만 호출할 수 있음
      - default: 동일한 package 내에 있는 class에서만 호출할 수 있음
      - private : 자기 class 안에서만 호출할 수 있음
    - ###### static
      - 생략할 수 있음
      - `static`을 사용하면 프로그램이 시작할 때 생성 됨. (Memory에 올라감)
    - ###### 반환할 객체 타입
      - int, String, Map 등 함수가 반환할 타입을 미리 정해야 한다.
      - 아무런 객체도 반환하지 않는다면 `void`를 사용하면 된다.
    - ###### 함수 이름
      - 변수 이름처럼 고유한 값을 가져야 한다.
      - 일반적으로 class 내에서만 고유하면 되기 때문에 다른 class 내에선 같은 이름의 함수를 만들 수 있다.
        ```java
        class Car {
          public void move() { ... }
        }

        class Bus {
          public void move() { ... }
        }
        ```

    - ###### 파라미터
      - 외부에서 값을 받아 함수 내에서 변수로 사용하고 싶을 땐 파라미터를 이용하면 된다.
  - `public static void main(String[] args)`도 `main` 이라는 이름을 갖는 함수이다.
  - 예제코드
    ```java
    public class LoopStatement {
      // 입력받은 단을 출력하는 프로그램
      public static void main(String[] args) {
        // 5단 출력
        printGugudan(5);

        // 22단 출력
        printGugudan(22);
      }

      private static void printGugudan(int dan) {
        for(int index = 1; index <= 9; index++) {
          System.out.println(dan + " x " + index + " = " + (dan * index));
        }
      }
    }
    ```