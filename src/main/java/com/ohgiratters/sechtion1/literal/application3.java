package com.ohgiratters.sechtion1.literal;

public class application3 {
    public static void main(String[] args) {

        // 문자열 합치기 결과를 예측하고 사용할 수 있다.
            /* 정리.
                1. 연산 방향은 왼쪽에서 오른쪽으로 읽힌다.
                2. 다수의 문자열이 합칠 경우
             */

        // 1. 두 개의 문자열 합치기
        System.out.println("======= 두 개의 문자열 합치기 ======");
        System.out.println(9 + 9);
        System.out.println("9" + 9);    // 앞에가 문자열이면 뒤에도 문자열로 인식함.
        System.out.println(9 + "9");    // 문자열이기 때문에 구십구가 아닌 구구로 읽음.
        System.out.println("9" + "9");


        // 2. 세 개의 문자열 합치기
        System.out.println("======= 세 개의 문자열 합치기 ======");
        System.out.println(9 + 9 + "9");    // 연산 방향은 왼쪽에서 오른쪽으로 읽기에 값은 189.
        System.out.println(9 + "9" + 9);
            // 위의 코딩 >  중간에 문자열이 있기에 숫자 9와 문자 9 그리고 숫자 9가 합쳐진 값 999 나옴
        System.out.println("9" + 9 + 9);    // 앞에 문자열이기에 뒤에도 문자열로 인식함. 값은 999
        System.out.println("9" + (9 + 9) );    // 괄호를 넣을 경우 먼저 실행됨, 값은 918.

            // 숫자가 많이 나오는 코딩을 짤때에는 문자와 같이 입력하면 보기 편함.
        System.out.println("10과 20의 합 : " + (10 + 20));     // 값. 10과 20의 합 : 30
        System.out.println("10과 20의 차 : " + (10 - 20));     // 값. 10과 20의 차 : -10
        System.out.println("10과 20의 곱 : " + (10 * 20));     // 값. 10과 20의 곱 : 200
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20));   // 값. 10과 20의 나누기 한 몫 : 0
        System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 20));     // 값. 10과 20의 나누기 한 나머지 : 10

        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");      // 값. 기차칙칙폭폭
        System.out.println("기차" + 123 + 45 + "출발");     // 값. 기차12345출발
        System.out.println(123 + 45 + "기차" + "출발");     // 값. 168기차출발




    }






}
