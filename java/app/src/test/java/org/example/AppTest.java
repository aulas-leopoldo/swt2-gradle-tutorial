/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
//        WebDriver webDriver = new ChromeDriver();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
