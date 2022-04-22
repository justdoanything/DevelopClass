package JAVA.Code;

public class Child extends Parent { 
    @Override
    public void printName(){
      name = "Child";
      System.out.println("자식의 이름 : " + name);
    }
  }
