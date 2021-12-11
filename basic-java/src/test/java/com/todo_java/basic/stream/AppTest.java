package com.todo_java.basic.stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @DisplayName("스트림 테스트")
    @Test void testMain(){
        //given
        App app = new App();
        
        //when
        
        //then
        assertThat(0).isEqualTo(1);
    }
}
