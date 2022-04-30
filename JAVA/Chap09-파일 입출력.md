# Chapter 9. 파일 입출력

프로그램은 우리가 손으로 하던 일을 자동화 시켜주는 과정이다. 가장 먼저 우리가 메모장에 글을 `읽는` 과정과 `쓰는` 과정을 `행동(line)` 단위로 생각해보자.
- `메모장 열기` -> `한줄씩 읽기` -> `파일 닫기`
- `메모장 열기` -> `글 쓰기` -> `저장하기` -> `파일 닫기`

파일을 열어서 기존에 있던 내용을 읽고 수정하는 과정을 써보자.
- `메모장 열기` -> `한줄씩 읽기` -> `글 수정(쓰기)` -> `저장하기` -> `파일 닫기`

우린 위와 같은 일련의 동작들을 프로그램 언어로 정의만 해주면 된다. 가장 먼저 `파일을 읽고` 안에 있는 `내용을 출력`하는 프로그램을 작성해보자.

## BufferedReader
JAVA에서 파일을 읽을 수 있는 방법은 여러가지다 있다. 파일 읽기를 지원해주는 클래스는 `FileReader`,`BufferedReader`,`Scanner`,`Files` 등 여러가지가 존재한다. 

이 예제에선 `BufferedReader`를 사용한다. 위에서 명시한 과정을 주석으로 나타내기 위해서 코드 형식을 나눴다.
```java
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadWriteFiles {
    
    public static void main(String[] args){
        String filePath = "/Users/yongwoo/Documents/justdoanything/DevelopClass/JAVA/text";
        
        List list = new ArrayList<String>();
        try (
            // 1. 메모장 열기
            BufferedReader br = new BufferedReader(new FileReader(filePath))
            ) {
            
            String line = "";

            System.out.println("======파일 읽기 시작========");
            while(
                // 2. 한줄씩 읽기
                (line = br.readLine()) != null
                ){
                // 3. 읽은 한줄 출력하기
                System.out.println(line);
                list.add(line);
            }
            System.out.println("======파일 읽기 끝=======");
            
            // 4. 파일 닫기
            br.close();
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("Exception 발생 : " + e.toString());
        }



        // list 데이터 조작
        // 로직 다 처리

        // list -> 파일에 쓰기 : fileWrite
    }
}
```
- ### 자원 해제
위에서 line 단위로 명시한 순서에 있던 `파일 닫기`는 코드에 있지 않다. 예전 방식으로 코드를 작성하면 `br.close();` 라는 문장을 써줘야하는데 JAVA의 `try-with-resources` 문법을 사용하면 파일을 닫는 (자원을 해제하는) 코드를 별도로 작성하지 않아도 JAVA가 자동으로 해준다.

`try-with-resources` : try 괄호 안에 자원을 해제할 객체를 쓰는 방식으로 `try(BufferedReader br = new BufferedReader(new FileReader(filePath))) { ... }` 코드이다.

- ### Exception 처리
`try-catch` : File을 제어하는 객체를 사용하면 그 객체에서 Exception을 발생시키는데 이러한 객체를 사용하려면 반드시 Exception 처리를 해줘야 한다. `try-catch` 문을 사용하거나 `throws`를 사용하면  된다.

`try-catch`문은 함수 내에서 Exception 처리를 따로 명시할 수 있고 `throws`는 상위 객체로 Exception을 던지는 것이다.
 
```java
public class ExceptionHandler {
    
    /*
     * try-catch문
     * finally는 Exception이 발생하던 안하던 try-catch문이 끝나면 마지막으로 무조건 실행된다.
     */
    public static void main(String[] args){
        String filePath = "/Users/yongwoo/Documents/justdoanything/DevelopClass/JAVA/text";
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            ...
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("Exception 발생 : " + e.toString());
        }finally{
            // 파일 닫기
            if(br != null) br.close();
        }
    }
}
```
```java
public class ExceptionHandler {
    
    /*
     * throws문
     * throws 문을 써주게 되면 함수 내에서 try-catch문을 써주지 않아도 된다.
     */
    public static void main(String[] args) throws Exception {
        String filePath = "/Users/yongwoo/Documents/justdoanything/DevelopClass/JAVA/text";
        
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        ...
        if(br != null) br.close();
    }
}
```

## BufferedWriter
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteFiles {
    
    public static void main(String[] args){
        String filePath = "/Users/yongwoo/Documents/justdoanything/DevelopClass/JAVA/text";
        
        // 파일 읽기
        readFile(filePath);

        // 파일 쓰기
        writeFile(filePath);
        
    }

    private static void readFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            
            String line = "";

            System.out.println("======파일 읽기 시작========");
            while(
                // 2. 한줄씩 읽기
                (line = br.readLine()) != null
                ){
                // 3. 읽은 한줄 출력하기
                System.out.println(line);
            }
            System.out.println("======파일 읽기 끝=======");
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("Exception 발생 : " + e.toString());
        }
    }

    private static void writeFile(String filePath) {
        // 덮어쓰기
        // try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {

        // 이어쓰기
        String line = "";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            System.out.println("======파일 쓰기 시작========");
            line = "새로운 라인 첫번째입니다.";
            bw.write(line);
            bw.newLine();
            System.out.println(line);
            
            line = "새로운 라인 두번째입니다.";
            bw.write(line);
            bw.newLine();
            System.out.println(line);
            
            bw.flush();
            System.out.println("======파일 쓰기 끝========");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception 발생 : " + e.toString());
        }
    }
}
```

## 파일 수정하기
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFiles {
    
    public static void main(String[] args){
        String filePath = "/Users/yongwoo/Documents/justdoanything/DevelopClass/JAVA/text";
        
        // 파일 읽기
        readFile(filePath);

        // 파일 쓰기
        writeFile(filePath);
        
        // 파일 수정
        updateFile(filePath);
    }

    private static void readFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            
            String line = "";

            System.out.println("======파일 읽기 시작========");
            while(
                // 2. 한줄씩 읽기
                (line = br.readLine()) != null
                ){
                // 3. 읽은 한줄 출력하기
                System.out.println(line);
            }
            System.out.println("======파일 읽기 끝=======");
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("Exception 발생 : " + e.toString());
        }
    }

    private static void writeFile(String filePath) {
        // 덮어쓰기
        // try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {

        // 이어쓰기
        String line = "";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            System.out.println("======파일 쓰기 시작========");
            line = "새로운 라인 첫번째입니다.";
            bw.write(line);
            bw.newLine();
            System.out.println(line);
            
            line = "새로운 라인 두번째입니다.";
            bw.write(line);
            bw.newLine();
            System.out.println(line);
            
            bw.flush();
            System.out.println("======파일 쓰기 끝========");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception 발생 : " + e.toString());
        }
    }

    private static void updateFile(String filePath) {
        List<String> lineList = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            
            String line = "";

            System.out.println("======파일 수정 시작========");
            while((line = br.readLine()) != null){
                lineList.add(line);
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, false))){
                if(lineList.get(1) != null)
                lineList.remove(1);
                lineList.add(1, "수정한 라인입니다.");

                for(String writeLine : lineList){
                    bw.write(writeLine);
                    bw.newLine();
                }
                bw.flush();
            }catch(Exception ee) {
                ee.printStackTrace();
                System.out.println("Exception 발생 : " + ee.toString());    
            }

            System.out.println("======파일 수정 끝=======");
            
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("Exception 발생 : " + e.toString());
        }
    }
}
```