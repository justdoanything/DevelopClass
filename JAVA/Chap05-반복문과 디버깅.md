# Chapter 5. 반복문과 조건문

직관적인 코드와 가독성을 높이기 위해서 코드의 재사용성을 높여야 한다. 반복문, 조건문, 함수, 클래스와 같은 문법을 사용해서 코드의 재사용성을 높일 수 있다. (같은 코드를 적기 귀찮아서 하는 것도 있다.)

구구단 출력 코드를 보면 고정값이 있고 규칙적으로 변하는 값이 있다. 규칙적으로 변하는 값을 변수로 명시하고 규칙을 정해주면 반복문으로 바꿀 수 있다.

<details>

  <summary>구구단 출력 코드</summary>

  ```java
  public static void main(String[] args) {
    System.out.println("2 x 1 = " + (2 * 1));
    System.out.println("2 x 2 = " + (2 * 2));
    System.out.println("2 x 3 = " + (2 * 3));
    System.out.println("2 x 4 = " + (2 * 4));
    System.out.println("2 x 5 = " + (2 * 5));
    System.out.println("2 x 6 = " + (2 * 6));
    System.out.println("2 x 7 = " + (2 * 7));
    System.out.println("2 x 8 = " + (2 * 8));
    System.out.println("2 x 9 = " + (2 * 9));
	}
  ```
</details>

## 반복문(for, while)
- ### for문

![image](https://user-images.githubusercontent.com/21374902/162422450-318ed99c-36ea-45f7-b511-0f70eb4ffb63.png)\
(출처 : https://coding-factory.tistory.com/382)

```java
// 구구단 2단 출력
public static void main(String[] args) {
  for(int index = 1; index <= 9; index++) {
    System.out.println("2 x " + index + " = " + (2 * index));
  }

  for(int index = 1; index < 10; index++){
    
  }
}
```
```java
// 구구단 출력
public static void main(String[] args) {
  for(int num = 2; num <= 9; num++){
    for(int index = 1; index <= 9; index++) {
      System.out.println(num + " x " + index + " = " + (num * index));
    }
  }
}
```

```java
// Array, List 와 같은 객체에서 값을 하나씩 뽑아올 때 쓰는 for문
public static void main(String[] args) {
  ArrayList<String> nameList = new ArrayList<>();
  nameList.add("사과");
  nameList.add("딸기");
  nameList.add("포도");
  nameList.add("배");

  for(String item : itemNameList){
    System.out.println(item);
  }
}
```

- ### while문
for문과 동작은 비슷하게 돌아가지만 표현하는 방식이 다릅니다.
```java
// 구구단 출력
public static void main(String[] args) {
  int num = 2;
  int index = 1;
  while(num <= 9){
    while(index <= 9){
      System.out.println(num + " x " + index + " = " + (num * index));
      index++;
    }
    System.out.println("=================");
    index = 1;
    num++;
  }
}
```

- ### do-while문
```java
// 구구단 출력
public static void main(String[] args){
  int index = 1;
  do {
    System.out.println("2 x " + index + " = " + (2 * index));
    index++;
  }while(index <= 9);
}
```

## Debugging
개발을 하다보면 기능을 만드는 시간보다 버그를 잡는 시간이 더 오래걸리기도 한다. 버그를 찾는 행동을 `디버깅`이라고 한다. 그리고 디버깅을 하다보면 코드의 실행 순서를 라인 단위로 하나씩 볼 수 있기 때문에 프로그램이 어떻게 동작하는지는 눈으로 볼 수 있다.

원하는 지점에 `break point`를 지정하고 `debugging 모드`로 실행하면 된다. 라인 단위로 실행할지, 다음 `break point`로 넘어갈지, 함수 안쪽으로 들어갈 수도 있다.

해당 시점에 프로그램이 갖고 있는 변수의 종류와 값을 확인할 수 있기 때문에 어느 순간에서 잘못된 값이 들어가는지 확인할 수 있다.