# Java

### 1. 주석 (Comments):

Java에서는 코드에 설명을 추가하기 위해 주석을 사용합니다. 주석은 컴파일러에 의해 무시되며 코드 실행에 영향을 주지 않습니다.

```java
// 이것은 한 줄 주석입니다.

/*
   이것은
   여러 줄 주석입니다.
*/
```

### 2. 데이터 타입 (Data Types):

Java는 기본 데이터 타입과 참조 데이터 타입을 제공합니다.

#### 기본 데이터 타입 (Primitive Data Types):

- `int`: 정수 (예: 42)
- `double`: 실수 (예: 3.14)
- `boolean`: 논리 (true 또는 false)
- `char`: 문자 (예: 'A')
- `byte`, `short`, `long`, `float`: 다양한 정수 및 실수 데이터 타입

#### 참조 데이터 타입 (Reference Data Types):

- `String`: 문자열 (예: "Hello, World!")
- 클래스, 인터페이스 등

### 3. 변수 (Variables):

변수는 데이터를 저장하기 위한 공간입니다.

```java
int age = 30;
double pi = 3.14;
boolean isJavaFun = true;
String greeting = "Hello, World!";
```

### 4. 연산자 (Operators):

Java는 다양한 연산자를 지원합니다. 예를 들어, 산술 연산자 (+, -, *, /), 비교 연산자 (==, !=, >, <), 논리 연산자 (&&, ||), 대입 연산자 (=) 등이 있습니다.

### 5. 조건문 (Conditional Statements):

- `if`: 조건에 따라 코드 실행
- `else`: 조건에 부합하지 않을 때 실행
- `else if`: 다중 조건 검사

```java
if (condition) {
    // 코드 실행
} else if (anotherCondition) {
    // 다른 코드 실행
} else {
    // 기본 코드 실행
}
```

### 6. 반복문 (Loops):

- `for`: 반복 횟수가 정해진 반복문
- `while`: 조건이 참인 동안 반복
- `do-while`: 최소한 한 번은 반복

```java
for (int i = 0; i < 10; i++) {
    // 코드 반복 실행
}

while (condition) {
    // 코드 반복 실행
}

do {
    // 코드 반복 실행
} while (condition);
```

### 7. 배열 (Arrays):

배열은 여러 데이터 항목을 담는 자료구조입니다.

```java
int[] numbers = {1, 2, 3, 4, 5};
String[] colors = new String[3]; // 배열 크기 지정
```

### 8. 메서드 (Methods):

메서드는 코드를 재사용하기 위한 함수입니다.

```java
public int add(int a, int b) {
    return a + b;
}
```

### 9. 클래스 (Classes):

Java는 객체 지향 프로그래밍을 지원하며, 클래스를 사용하여 객체를 정의합니다.

```java
public class Person {
    String name;
    int age;

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
```

### 10. 예외 처리 (Exception Handling):

Java에서는 예외를 처리하기 위한 `try-catch` 블록을 사용합니다.

```java
try {
    // 예외 발생 가능한 코드
} catch (Exception e) {
    // 예외 처리 코드
}
```

### 11. 패키지 (Packages):

클래스를 구조화하기 위해 패키지를 사용합니다.

```java
package com.example.myapp;
```

### 12. 인터페이스 (Interfaces):

인터페이스를 사용하여 클래스가 구현해야 하는 메서드를 정의할 수 있습니다.

```java
public interface Shape {
    double getArea();
    double getPerimeter();
}
```

### 13. 상속 (Inheritance):

상속을 사용하여 새로운 클래스를 기존 클래스의 속성과 메서드를 상속받아 정의할 수 있습니다.

```java
public class Animal {
    // 속성과 메서드
}

public class Dog extends Animal {
    // Dog 클래스는 Animal 클래스를 상속받음
}
```

### 14. 패키지 라이브러리 (Library Packages):

Java는 다양한 패키지 라이브러리를 제공하며, 이를 사용하여 파일 다루기, 네트워크 통신, 데이터베이스 연결, 그래픽 처리 등을 수행할 수 있습니다.
