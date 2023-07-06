package com.example.dependencyinjectionsample.chapter03.used;

import org.springframework.stereotype.Component;

/**
 * 인사 인터페이스
 */

public interface Greet {
    /**
     * 인사하기
     */
    void greeting();
}
