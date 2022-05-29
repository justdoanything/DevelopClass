package JAVA.Code;

import java.util.ArrayList;

public class LoopStatement {
  public static void main(String[] args) {
    // for문 - 구구단 2단 출력
    for (int index = 1; index <= 9; index++) {
      System.out.println("2 x " + index + " = " + (2 * index));
    }

    // 이중 for문 - 2~9단 출력
    for (int num = 2; num <= 9; num++) {
      for (int index = 1; index <= 9; index++) {
        System.out.println(num + " x " + index + " = " + (num * index));
      }
    }

    // Array, List 와 같은 객체에서 값을 하나씩 뽑아올 때 쓰는 for문
    ArrayList<String> nameList = new ArrayList<>();
    nameList.add("사과");
    nameList.add("딸기");
    nameList.add("포도");
    nameList.add("배");

    for(String item : nameList){
      System.out.println(item);
    }

    // 이중 while문 - 2~9단 출력
    int num = 2;
    int index = 1;
    while (num <= 9) {
      while (index <= 9) {
        System.out.println(num + " x " + index + " = " + (num * index));
        index++;
      }
      System.out.println("=================");
      index = 1;
      num++;
    }
 
    // do-while문 - 2단 출력
    int doIndex = 1;
    do {
      System.out.println("2 x " + doIndex + " = " + (2 * doIndex));
      doIndex++;
    } while (doIndex <= 9);
  }
}
