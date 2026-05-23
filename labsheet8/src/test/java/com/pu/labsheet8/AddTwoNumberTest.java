package com.pu.labsheet8;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class AddTwoNumberTest {
    @Test
    void testAdd()
 {
        AddTwoNumber calc = new AddTwoNumber();
        int result = calc.add(2, 3);
        assertEquals(5, result, "Addition should return 5");
    }
    @Test
    void testSubtract() 
{
    	AddTwoNumber calc = new AddTwoNumber();
        int result = calc.subtract(2, 3);
        assertEquals(-1, result, "Subtraction should return -1");
    }
    @Test
    void testMultiplication() 
{
    	AddTwoNumber calc = new AddTwoNumber();
        int result = calc.Multiplication(2, 3);
        assertEquals(6, result, "Multiplication should return 6");
}
    @Test
    void testDiv() 
{
    	AddTwoNumber calc = new AddTwoNumber();
        int result = calc.div(6, 3);
        assertEquals(2, result, "Division should return 2");
}       
}
