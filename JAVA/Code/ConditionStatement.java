package JAVA.Code;

public class ConditionStatement {
    public static void main(String[] args) {
        // System.out.println("문자를 입력하세요 : ");
        // Scanner scan = new Scanner(System.in);
        // String inputString = scan.nextLine();
        // System.out.println("입력한 문자 : " + inputString);

        // /*
        //  * if-else문
        //  */
        // if(inputString.equals("apple")){
        //   System.out.println("입력한 문자는 'apple' 입니다.");
        // } else {
        //   System.out.println("입력한 문자는 'apple'이 아닙니다.");
        // }

        // /*
        //  * if-else if-else문
        //  */
        // if(inputString.equals("apple")){
        //   System.out.println("입력한 문자는 'apple' 입니다.");
        // } else if (inputString.equals("bed")) {
        //   System.out.println("입력한 문자는 'bed' 입니다.");
        // } else if (inputString.equals("cat")) {
        //   System.out.println("입력한 문자는 'cat' 입니다.");
        // } else {
        //   System.out.println("입력한 문자는 'apple'도 'bed'도 'cat'도 아닙니다.");
        // }

        // /*
        //  * switch문
        //  */
        // switch(inputString) {
        //   case "apple":
        //     System.out.println("입력한 문자는 'apple' 입니다.");
        //     break;
        //   case "bed":
        //     System.out.println("입력한 문자는 'bed' 입니다.");
        //     break;
        //   case "cat":
        //     System.out.println("입력한 문자는 'cat' 입니다.");
        //     break;
        //   default:
        //   System.out.println("입력한 문자는 'apple'도 'bed'도 'cat'도 아닙니다.");
        //     break;
        //  }


        String company = "LG";

        // if(company.equals("SK")){
        //   System.out.println("회사명은 SK 입니다.");
        // } else if(company.equals("LG")) {
        //   System.out.println("회사명은 LG 입니다.");
        // } else {
        //   System.out.println("기타 회사 입니다.");
        // }

        switch(company) {
          case "SK":
            System.out.println("회사명은 SK 입니다.");
            break;
          case "LG":
            System.out.println("회사명은 LG 입니다.");
          default:
            System.out.println("기타 회사 입니다.");
            break;
        }

  }
}
