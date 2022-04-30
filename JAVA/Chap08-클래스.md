# Chapter 8. 클래스

### Class

객체라고도 불리며 객체지향 프로그래밍의 핵심 개념이라고 할 수 있다. 객체는 사물을 뜻하는데 사람, 사과, 동물, 원숭이, 자동차, 버스 등 어떤 사물 하나를 지칭한다.

클래스는 함수와 마찬가지로 중복되는 `코드`를 없애고 `재사용성`을 높이고 `가독성`을 높일 수 있으며 `객체지향`으로 프로그램을 짜기 위해선 `함수(Method)`와 `클래스(Class)`를 잘 활용해야 한다. `객체`와 `클래스`는 같다고 생각해도 무방하다.

edu_java_2017에 있는 코드를 보면 `하나의 .java` 파일 안에 `여러 개의 class`를 선언해서 사용하는 것을 볼 수 있다.
```java
// hw05.java
abstract class life { ... }
class bear extends life	{ ... }
class fish extends life	{ ... }
public class hw05 { ... }	
```

실제 개발을 할 때엔 `하나의 .java` 파일 안에 `여러 개의 class`를 선언하지 않는다. 가독성이 떨어질 뿐더러 코드의 수정이나 유지보수가 어려워질 수 있기 때문이다. 위 코드를 예로 들면, `Bear.java`,`Fish.java`,`hw05.java`로 분리해서 `hw05.java`가 다른 클래스를 호출해서 사용해야 한다.

`.java` 파일 단위를 클래스 또는 객체라고 부를 수 있다.
```java
public class hw05 
{
  Bear bear = new Bear();
  Fish fish = new Fish();
  ...	
}
```

- ### class 사용방법
  - 어떤 class에서 다른 class를 사용하기 위해선 class를 반드시 `생성(초기화)`를 해줘야 한다. 이 때 사용하는 키워드는 `new` 이다. 위 코드를 참고하자.
  - class 안에서 `속성`, `함수`를 정의해서 사용할 수 있다. bear라는 클래스가 이름과 나이, 지역이라는 속성을 갖고 있고 이동한다는 함수를 갖고 있다면 아래와 같이 표현할 수 있다.
    ```java
    public class bear {
      public String name;
      public int age;
      public String region;

      public void moveRight(int pixel) { ... }
    }
    ```
  - class 안에 있는 변수와 함수는 `.`을 통해 값을 변경하거나 꺼내서 사용할 수 있다.
    ```java
    public class hw05 {
      Bear bear = new Bear();
      Fish fish = new Fish();

      bear.name = "테디베어";
      bear.age = 18;
      bear.region = "시베리아"

      System.out.println("곰의 이름은 " + bear.name + "입니다.");
      System.out.println("곰의 나이는 " + bear.age + "입니다.");
      System.out.println("곰의 서식지는 " + bear.region + "입니다.");
      
      // 곰을 이동합니다.
      bear.moveRight(3);
    }
    ```

- ### 자주쓰는 변수 타입의 객체
  - 일반 변수 : int, float, double, array, ...
  - 객체형 변수 : String, List, Map, ... 
    - Array : 데이터가 일렬로 저장되고 `순서(index)`에 의존해서 데이터에 접근
    - List : Array와 유사한 방식이고 사용할 수 있는 서브 함수의 종류가 다르다.
    - Map : 데이터를 Key-Value 쌍으로 저장하고 `Key`에 의존해서 데이터에 접근. JSON 데이터가 Map과 동일하다고 볼 수 있다. 
      ```java
      public class PrintString {
        public static void main(String[] args) {
          
          // Array
          // 1. 변수 선언과 값 입력
          String[] stringArray = new String[5]; // [ null, null, null, null, null ]
          stringArray[0] = "사과";
          stringArray[1] = "딸기";
          stringArray[2] = "포도";
          stringArray[3] = "배";
          // [ "사과", "딸기", "포도", "배", null ]

          // 2. 값 추출
          String fruit = "";
          fruit = stringArray[0]; // 사과
          fruit = stringArray[1]; // 딸기
          fruit = stringArray[2]; // 포도
          fruit = stringArray[3]; // 배

          // 3. 값 제거
          // Array는 초기화를 하면 해당 index의 값이 공백으로 된다.
          fruit[1] = null;
          // [ "사과", "", "포도", "배", null ]

          // 4. 검색
          boolean isExist = false;
          for(int index = 0; index < 5; index++){
            if(stringArray[index].equals("사과")){
              isExist = true;
            }
          }

          // 5. 탐색

          // 6. 값 전체 출력 : for문의 제 2 표현법
          for(String item : stringArray){
            System.out.println(item);
          }

          // List
          // 1. 변수 선언과 값 입력
          List<String> list = new ArrayList<>(); // [ ]
          list.add("사과");
          list.add("딸기");
          list.add("포도");
          list.add("배");
          // [ "사과", "딸기", "포도", "배" ]

          // 2. 값 추출
          fruit = list.get(0); // 사과
          fruit = list.get(1); // 딸기
          fruit = list.get(2); // 포도
          fruit = list.get(3); // 배
          
          // 3. 값 제거
          // Array와 다르게 값을 삭제하고 순서를 재조정해준다.
          list.remove(0);
          list.remove("포도");
          // [ "딸기", "배" ]

          // 4. 검색 
          isExist = list.contains("사과");

          // 5. 탐색
          for(String item : list){
            System.out.println(item);
          }

          // 6. 값 전체 출력
          System.err.println(list.toString());


          // Map
          // JSON 형태의 데이터는 key-value 쌍으로 저장이 된다.
          // { "사과":1000, "딸기":2000, "포도":3000, "배":4000 }
          // 1. 변수 선언과 값 입력
          Map<String, Integer> map = new HashMap<>();
          map.put("사과", 1000);
          map.put("딸기", 2000);
          map.put("포도", 3000);
          map.put("배",  4000);
          // { "사과":1000, "딸기":2000, "포도":3000, "배":4000 }

          // map은 Array나 list와 같이 직렬적으로 쌓이지 않고 key 기준으로 value를 추가 혹은 업데이트를 한다.
          map.put("딸기", 15000);
          map.put("배",  20000);
          // { "사과":1000, "딸기":15000, "포도":3000, "배":20000 }

          // 2. 값 추출
          int price = 0;
          price = map.get("사과");  // 15000
          price = map.get("딸기");  // 2000
          price = map.get("포도");  // 3000
          price = map.get("배");   // 20000

          // 3. 값 제거
          map.remove("사과");
          map.remove("딸기");
          // { "포도":3000, "배":20000 }

          // 4. 검색 : key, value를 따로 검색할 수 있다.
          isExist = map.containsKey("딸기");
          isExist = map.containsValue(15000)

          // 5. 탐색 : key를 먼저 추출하고 값을 검색한다.
          for(String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
          }

          // 6. 값 전체 출력
          System.out.println(map.toString());
          System.out.println(map.keySet().toString()); // key 만 출력
          System.out.println(map.values()); // value 만 출력
        }
      }
      ```

- ### 부록
  - #### null과 공백의 차이
    - null는 `존재하지 않는` 것이고 공백은 `비어있는` 상태라고 생각하면 된다.
    - 물잔에 물이 없는건 `비어있는` 상태고 물잔 자체가 아예 없는건 `존재하지 않는` 상태이다.
    - null인 상태를 접근해서 사용할 때 NullPointException이 발생할 수 있으니 유의하자.
  - #### 함수 오버라이딩 (Method Overloading)
    - 함수는 파라미터의 수와 형식이 다르면 같은 이름을 사용할 수 있다.
      ```java
      public void move(){ }

      // 파라미터의 수가 다름.
      // int 라는 매개변수를 갖기 때문에 사용할 수 있다.
      public void move(int speed){ }

      // 파라미터의 수가 같지만 타입이 다름.
      // int가 아니고 String이기 때문에 사용할 수 있다.
      public void move(String mile){ }

      // 파라미터의 수가 다름.
      public void move(int speed, String mile){ }
      
      // 파라미터의 수가 같고 int, String 타입을 갖지만 순서가 다름.
      public void move(String mile, int speed){ }

      /*
       * 사용할 수 없는 함수
       */

       // 매개변수의 이름이 speed와 mile로 다른 이름을 갖지만 같은 int 변수 1개만 사용하기 때문에 사용할 수 없다.
       public void move(int mile) { }
      ```

  - #### 다형성 (Polymorphism)
    - 정의
      - 하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미한다. 자바에서는 이러한 다형성을 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있도록 하여 구현하고 있다.
    - 상속 (extends)
      - 부모-자식 간의 관계를 사용할 때 사용한다. 부모 클래스에서 선언한 변수와 함수는 자식 클래스에서 따로 선언하지 않고 사용할 수 있다.
      - 공통된 속성이 있을 때 부모 클래스를 만들고 하위 클래스가 상속받아 사용한다. 예를들어 bear, lion 클래스가 있다면 animal 클래스를 만들어서 공통 속성(이름, 나이, 서식지 등)을 정의하고 bear, lion이 상속받아 사용한다. bear, lion 클래스에 안에서 이름, 나이, 서식지 변수를 별도로 선언하지 않고 바로 사용할 수 있다.
        ```java
        class Parent {
          public int age = 20;
          public String name = "Parent";

          public void printName(){ 
            System.out.println("부모입니다.");
          }
        }

        class Child extends Parent { }
        
        public class PrintChild {
          public static void main(String[] args) {
              Parent parent = new Parent();
              Child child = new Child();
              
              // Child 클래스 안에 age, name을 선언하지 않았지만 사용할 수 있다.
              parent.printName();
              child.printName();

              // ============출력결과
              // "부모입니다."
              // "부모입니다."
          }
        }
        ```
    - 함수 오버라이드 (Method Override)
      - 자식 클래스는 부모 클래스에 정의되있는 함수를 따로 선언하지 않고 사용할 수 있다. 하지만 그 함수의 동작을 재정의하고 싶을 땐, @Override를 사용한다.
        ```java
        class Parent {
          public int age = 20;
          public String name = "Parent";

          public void printName(){ 
            System.out.println("부모입니다.");
          }
        }

        // Method Override
        class Child extends Parent { 
          @Override
          public void printName(){
            System.out.println("자식입니다.");
          }
        }
        
        public class PrintChild {
          public static void main(String[] args) {
              Parent parent = new Parent();
              Child child = new Child();
              
              // Child 클래스 안에 age, name을 선언하지 않았지만 사용할 수 있다.
              parent.printName();
              child.printName();

              // ============출력결과
              // "부모입니다."
              // "자식입니다."
          }
        }
        ```

  - ### 함수 선언 위치에 따른 C와 JAVA의 차이점
    - JAVA는 코드가 실행될 때 코드 전체를 한 번 읽어서 클래스와 함수의 위치를 메모리에 올려놓고 실행되기 때문에 `main` 함수보다 아래에 함수를 생성하고 호출해도 정상작동한다.
      ```java
      public static void main(String[] args) {
        // 호출하는 함수가 아래에 위치하고 있지만 정상작동
        printBelowMethod();
      }

      private void printBelowMethod() { ... };
      ```
    - 하지만 C언어는 위에서 아래로 읽으면서 실행되기 때문에 반드시 위쪽에 함수를 선언하고 `main` 함수를 맨 아래에 두고 호출해야 한다.
      ```c
      #include <stdio.h>
      
      void printAboveMethod()
      {
        ...
      }

      int main()
      {
        printAboveMethod(); // 정상 작동
        printBelowMethod(); // 에러 발생
        // 호출하는 함수보다 선언된 위치가 아래이면 에러가 발생한다.
        return 0;
      }

      void printBelowMethod()
      {
        ...
      }
      ```