package JAVA.Code;

public class PrintChild {
    public static void main(String[] args) {
        Child child = new Child();
        
        // Child 클래스 안에 age, name을 선언하지 않았지만 사용할 수 있다.
        System.out.println(child.age);
        System.out.println(child.name);
        child.printName();
    }
}
