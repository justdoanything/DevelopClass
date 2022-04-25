package JAVA.Code;

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