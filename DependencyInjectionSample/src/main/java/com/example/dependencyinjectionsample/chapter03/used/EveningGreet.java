package com.example.dependencyinjectionsample.chapter03.used;

import org.springframework.stereotype.Component;

/**
 * Greet 구현 클래스<br>
 * 저녁 인사 하기
 */

@Component //인스턴스를 생성하려는 클래스에 어노테이션을 부여 
public class EveningGreet implements Greet{
    @Override
    public void greeting() {
        System.out.println("---------------");
        System.out.println("좋은 저녁입니다.");
        System.out.println("---------------");
    }
}
