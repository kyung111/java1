package com.ohgiratters.sechtion1.literal;

public class application1 {
    public static void main(String[] args) {

        System.out.println();
        // 주석
        /* 주석 */
        // 숫자 형태의 값
        // 정수 형태의 값 출력
        System.out.println(123);

        // 실수 형태의 값 출력
        System.out.println(1.23);

        // 문자 형태의 값 출력
        System.out.println('a');   // 문자 형태의 값을 홀따옴표로 감싸줘야 함.
        System.out.println('1');   // 숫자 값이지만 홀따옴표(') 안에 있기에 문자로 판단함
//        System.out.println('ad');  // 두개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다 -> 이때 컨트롤 /를 눌러 주석 처리함
//        System.out.println('');  // 아무 문자도 기록되지 않는 경우도 에러가 발생함
        // 알트+시프트 반향키 > 문단 움직일수 있음
        // 컨트롤+d > 상위 문단 내용 복사
        // /**/ > 주석을 연속으로 하고 싶을 때, ** 사이에 입력하면됨

        // 문자열 형태의 값 출력
        System.out.println("ab");  // 연속으로 단어를 작성하고 싶을때는 " 사용
        System.out.println("문자 작성도 가능");
        System.out.println("123");  // 정수이지만 " 사용으로 문자열로 봐야함
        System.out.println("a");  // " 사용으로 보이는 a는 '(홀따옴표) 사용했을 때의 문자와는 다름

        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);  // true 혹은 false 값을 논리형이라고 함.


    }

}
