# 사전준비
###### 1. Visual Code 설치
    - https://code.visualstudio.com/download
    - 운영체제에 맞는 프로그램으로 설치

###### 2. OpenJDK 설치 
    - https://github.com/ojdkbuild/ojdkbuild
    - 운영체제에 맞는 프로그램으로 설치
    - Windows : java-11-openjdk-11.0.14.9-1.windows.ojdkbuild.x86_64.msi

###### 3. VS Code에 Java Extension 설치
    - 왼쪽 메뉴에 `Extensions` 메뉴 혹은 `Ctrl+Shift+X`
    - `java` 검색 후 `Extension Pack for Java` 설치

###### 4. 프로젝트 생성
    - 원하는 경로에 빈 폴더를 생성
    - `File → Open Folder`로 빈 폴더 열기
    - `New File` 하고 파일 이름을 `main.java` 으로 생성
    - 아래 Code 붙여넣기
        ```java
        import java.util.Scanner;
        public class main {
            public static void main(String[] args){
                System.out.println("문자를 입력하세요 : ");
                Scanner scan = new Scanner(System.in);
                String test = scan.nextLine();
                System.out.println(test);
            }
        }
        ```
###### 5. VS Code에서 추가로 확인해야할 설정
    - `Ctrl + ,` → `Terminal` 검색 → Java Debug → Cosole : integratedTerminal 확인