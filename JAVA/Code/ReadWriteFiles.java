package JAVA.Code;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadWriteFiles {
    
    public static void main(String[] args){
        String filePath = "/Users/yongwoo/Documents/justdoanything/DevelopClass/JAVA/text";
        
        
        try (
            // 메모장 열기
            BufferedReader br = new BufferedReader(new FileReader(filePath))
            ) {
            
            String line = "";

            System.out.println("======파일 읽기 시작========");
            while(
                // 한줄 읽기
                (line = br.readLine()) != null
                ){
                // 읽은 한줄 출력하기
                System.out.println(line);
            }
            System.out.println("======파일 읽기 끝=======");
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("Exception 발생 : " + e.toString());
        }
    }
}