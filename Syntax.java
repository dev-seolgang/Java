// Syntax.java

// 주석: 이 프로그램은 Java의 기본 문법을 보여줍니다.

// 클래스 선언
public class Syntax {
    
    // main 메서드: 프로그램의 진입점
    public static void main(String[] args) {
        
        // 변수 선언과 초기화
        int number = 10;
        String name = "Java";
        double pi = 3.14;
        
        // 출력문
        System.out.println("Hello, " + name + "!");
        System.out.println("Number: " + number);
        System.out.println("Value of Pi: " + pi);
        
        // 조건문
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }
        
        // 반복문
        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // 배열
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array Length: " + numbers.length);
        
        // 배열 반복문
        for (int num : numbers) {
            System.out.println("Array Element: " + num);
        }
    }
}
