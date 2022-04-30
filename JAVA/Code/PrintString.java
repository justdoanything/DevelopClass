package JAVA.Code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class PrintString {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
          map.put("사과", 1000);
          map.put("딸기", 2000);
          map.put("포도", 3000);
          map.put("배",  4000);

          System.out.println(map.toString());
          System.out.println(map.values());
          System.out.println(map.keySet().toString());
          System.out.println("문자를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        System.out.println("입력한 문자 : " + inputString);

        if(inputString.equals("e")){

        }

        
        String fruitName = "배";
        
        // 직렬적 = Array 배열
        // 1. String[] = new String[10];
        // 2. List array = new ArrayList<String>();

        String[] fruitNameArray = new String[10];
        // index 접근
        fruitNameArray[0] = "사과";
        fruitNameArray[1] = "배";

        System.out.println(fruitNameArray[0]);


        List nameList = new ArrayList<String>();
        // sub Method 활용
        nameList.add(fruitName);
        nameList.get(0);
        nameList.remove("사과");
        nameList.contains("사과");

        while(true){
            int index = 0;
            fruitNameArray[index++] = scan.nextLine(); // 사과, 배, 
            nameList.contains("사과");
        }
            // 상품 리스트에서 랜덤한 상품을 선택하고 랜덤한 개수를 판매하고 총 누적 매출을 출력한다.
            
            // 상품 리스트에서 랜덤한 상품 선택
                // Random 객체 사용 - 구글링
                // 범위 지정 필요
                // int randNumOfName = random.next();
                // itemNameList.get(randNumOfName);
                // itemPriceList.get(randNumOfName);
            // 랜덤한 판매 개수 선택
            // 판매 현황 출력
                // 상품 이름, 판매한 개수 출력
            // 총 누적 매출 출력
                // 총매출 = 상품 가격 * 개수
        }
        // 단수를 파라미터로 받아서 그 단수를 출력하는 함수
        // 파라미터 : 단수


        // JSON 형식
        {
            // key, value
        //     "사과" : "1000",
        //     "배" : "2000",
        //     "토마토" : "3000"
        // }

        // // key 기준으로 데이터 조작

        // list.add("사과");
        // list.add("사과");
        // list.add("사과");
        // // 사과, 사과, 사과

        // map.add("사과", "1000");
        // map.add("사과", "2000");
        // map.add("사과", "3000");

        // { "사과":"3000" } 


        List<String> list = new ArrayList<>(); // { }
        list.add("사과");
        list.add("배");
        list.add("토마토");
        // { 사과, 배, 토마토 }

        list.get(0); // 사과
        list.get(1); // 배
        list.get(2); // 토마토

        list.contains("사과"); // true
        list.contains("자몽");  // false

        //list.remove("사과");    // { 배, 토마토 }
        list.remove(1); // { 사과, 토마토}
        list.get(1); // 토마토

        String[] array = new String[10]; // { null, null, null, null, null, null, null, null, null }
        array[0] = "사과";
        array[1] = "배";
        array[2] = "토마토";
        // { 사과, 배, 토마토, null, null, null, null, null, null }

        String name = array[0]; // 사과
        name = array[1]; // 배
        name = array[2]; // 토마토

        array[1] = "";
        // { 사과, "", 토마토, null, null, null, null, null, null }
        name = array[1]; // ""
        array[1] = "자몽";
        // { 사과, 자몽, 토마토, null, null, null, null, null, null }

        // 탐색
        boolean isExist = false;
        for(int index = 0; index < 10; index++){
            if(array[index].equals("사과")){
                isExist = true;
            }
        }
        System.out.println("사과가 존재하는가 ? " + isExist);

        for(String fName : array){
            if(fName.equals("사과")){
                isExist = true;
            }
        }
        System.out.println("사과가 존재하는가 ? " + isExist);
        

        Map<String, Integer> map = new HashMap<>(); // { }
        map.put("사과", 0);
        map.put("사과", 1000);
        map.put("배", 2000);
        map.put("토마토", 3000);
        //{ "사과":1000, "배": 2000, "토마토": 3000 }
        
        map.get("사과"); // 1000

        map.containsKey("사과"); // true

        map.remove("사과"); //{ "배": 2000, "토마토": 3000 }
        map.remove("자몽"); // 에러 발생

        // 탐색
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        
        // 값 출력
        list.toString(); // { .. }
        array.toString(); // [ ... ]
        map.toString(); // #FEF3223FF
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        
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