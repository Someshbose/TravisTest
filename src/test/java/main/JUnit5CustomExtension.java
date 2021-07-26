package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(CustomExtension.class)
public class JUnit5CustomExtension {

    @Test
    @DisplayName("MyQuirkTest")
    public void myCustomeTest(){
        System.out.println("Call for a test method");
    }
}
