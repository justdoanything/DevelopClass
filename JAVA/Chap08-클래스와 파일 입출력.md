# Chapter 8. 클래스와 파일 입출력

### Class

객체라고도 불리며 객체지향 프로그래밍의 핵심 개념이라고 할 수 있다. 객체는 사물을 뜻하는데 사람, 사과, 동물, 원숭이, 자동차, 버스 등 어떤 사물 하나를 지칭한다.

클래스는 함수와 마찬가지로 중복되는 `코드`를 없애고 `재사용성`을 높이고 `가독성`을 높일 수 있으며 `객체지향`으로 프로그램을 짜기 위해선 `함수(Method)`와 `클래스(Class)`를 잘 활용해야 한다. `객체`와 `클래스`는 같다고 생각해도 무방하다.

edu_java_2017에 있는 코드를 보면 하나의 .java 파일 안에 여러 개의 class를 선언해서 사용하는 것을 볼 수 있다.
```java
// hw05.java
abstract class life { ... }
class bear extends life	{ ... }
class fish extends life	{ ... }
public class hw05 { ... }	
```

실제 개발을 할 때엔 하나의 .java 파일 안에 여러 개의 class를 선언하지 않는다. 가독성이 떨어질 뿐더러 코드의 수정이나 유지보수가 어려워질 수 있기 때문이다. 위 코드를 예로 들면, `Bear.java`,`Fish.java`,`hw05.java`로 분리해서 `hw05.java`가 다른 클래스를 호출해서 사용해야 한다.
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
  - class 안에 있는 변수와 함수는 `.`을 통해 꺼내서 사용할 수 있다.
    ```java
    public class hw05 
    {
      Bear bear = new Bear();
      Fish fish = new Fish();

      bear.name = "곰";
      bear.move(3);
    }
    ```

- ### 자주쓰는 변수 타입의 객체
  - 일반 변수 : int, float, double, ...
  - 객체형 변수 : String, Array, Map, ... 
    - Array : 데이터가 일렬로 저장되고 순서(index)에 의존해서 데이터에 접근
    - Map : 데이터를 Key-Value 쌍으로 저장하고 Key에 의존해서 데이터에 접근

- ### 부록
  - #### 오버라이딩 (Method Overloading0
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
      public void move(int spped, String mile){ }
      
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
        ```java
        class Parent {
          public int age = 20;
          public String name = "Parent";

          public void printName(){ 
            System.out.println(name);
          }
        }

        class Child extends Parent { }
        
        public class PrintChild {
          public static void main(String[] args) {
              Child child = new Child();
              
              // Child 클래스 안에 age, name을 선언하지 않았지만 사용할 수 있다.
              System.out.println(child.age);
              System.out.println(child.name);
              printName();

              // ============출력결과
              // 20
              // Parent
              // Parent
          }
        }
        ```
    - 오버라이드 (Method Override)
      - 자식 클래스는 부모 클래스에 정의되있는 함수를 따로 선언하지 않고 사용할 수 있다. 하지만 그 함수의 동작을 재정의하고 싶을 땐, @Override를 사용한다.
        ```java
        class Parent {
          public int age = 20;
          public String name = "Parent";

          public void printName(){ 
            System.out.println(name);
          }
        }

        class Child extends Parent { 
          @Override
          public void printName(){
            name = "Child";
            System.out.println("자식의 이름 : " + name);
          }
        }
        
        public class PrintChild {
          public static void main(String[] args) {
              Child child = new Child();
              
              // Child 클래스 안에 age, name을 선언하지 않았지만 사용할 수 있다.
              System.out.println(child.age);
              System.out.println(child.name);
              child.printName();

              // ============출력결과
              // 20
              // Parent
              // 자식의 이름 : Child
          }
        }
        ```

  - 함수 (C와 자바의 차이)
