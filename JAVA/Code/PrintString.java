package JAVA.Code;

import java.util.Scanner;
public class PrintString {
    public static void main(String[] args) {
        System.out.println("문자를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        System.out.println("입력한 문자 : " + inputString);

        // 단수를 파라미터로 받아서 그 단수를 출력하는 함수
        // 파라미터 : 단수
    }


    private static void testMethod(int gugudan, String name, String age) {
        // code
        System.out.println(gugudan);
        System.out.println(name);
        System.out.println(age);
    }
    // 함수1

    // 변수 : 타입 이름 = 초기값;
    // 함수 : 접근제어자 (static) 반환형태 함수이름 (파라미터) { 코드 }
    // 접근제어자 : public, private, protected, default 

}