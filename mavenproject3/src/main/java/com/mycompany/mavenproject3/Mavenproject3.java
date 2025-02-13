/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author IT20
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

    @Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result, "Addition should be correct");
    }

    @Test
    void testString() {
        String str = "Hello, Azure!";
        assertNotNull(str, "String should not be null");
    }
}
