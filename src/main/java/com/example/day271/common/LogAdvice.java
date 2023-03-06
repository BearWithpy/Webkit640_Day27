package com.example.day271.common;

public class LogAdvice {
    // AOP 어노테이션 사용 방법
//    https://lasbe.tistory.com/119
    public void printLogging() {
        // AOP 포인트 컷으로 검색된 기능에 추가되는 기능.
        System.out.println(">>>>> printLoging() : 임시 내용 ... >>>>>");
    }

    public void afterLogging() {
        // AOP 포인트 컷으로 검색된 기능에 추가되는 기능.
        System.out.println(">>>>> afterLogging() : 서비스 처리 후 실행 ... >>>>>");
    }
}