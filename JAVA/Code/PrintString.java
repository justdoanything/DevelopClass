package JAVA.Code;

import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
        System.out.println("문자를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        System.out.println("입력한 문자 : " + inputString);
    }
}