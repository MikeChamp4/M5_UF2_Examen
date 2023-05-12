package mzm.m5_uf2_examen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class M5_UF2_ExamenTest {
    
    
    @Test
    public void testGetNum1() {
        M5_UF2_Examen instance = new M5_UF2_Examen();

        int num1 = 1;
        int num2 = 2;

        int expResult = num1;
        int result = instance.getNum1(num1);
        assertEquals(expResult, result);
    }

}
