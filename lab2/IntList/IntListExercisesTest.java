package IntList;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntListExercisesTest {

    @Test
    public void addConstantTest() {
        IntList L = IntList.of(1);
        IntList excepted = IntList.of(2);
        IntListExercises.addConstant(L, 1);
        for (int i = 0; i < L.size(); i++) {
            assertEquals(excepted.get(i), L.get(i));
        }
    }

    @Test
    public void setToZeroTest() {
        IntList testL1 = IntList.of(55, 22, 45, 44, 5);
        IntListExercises.setToZeroIfMaxFEL(testL1);
        IntList exceptedL1 = IntList.of(0, 22, 45, 0, 0);
        for (int i = 0; i < testL1.size(); i++) {
            assertEquals(exceptedL1.get(i), testL1.get(i));
        }
        IntList testL2 = IntList.of(1, 44, 33, 22, 11);
        IntListExercises.setToZeroIfMaxFEL(testL2);
        IntList exceptedL2 = IntList.of(1, 0, 0, 0, 0);
        for (int i = 0; i < testL2.size(); i++) {
            assertEquals(exceptedL2.get(i), testL2.get(i));
        }
    }

    @Test
    public void TestMax() {
        IntList testL1 = IntList.of(1, 2, 3, 4);
        int exceptedL1 = 4;
        assertEquals(exceptedL1, IntListExercises.max(testL1));
        IntList testL2 = IntList.of(1);
        int exceptedL2 = 1;
        assertEquals(exceptedL2, IntListExercises.max(testL2));
        IntList testL3 = IntList.of(1, 1, 1, 1, 1);
        int exceptedL3 = 1;
        assertEquals(exceptedL3, IntListExercises.max(testL3));
    }

    @Test
    public void squarePrimeTest() {
        IntList testL1 = IntList.of(14, 15, 16, 17, 18);
        Boolean returnL1 = IntListExercises.squarePrimes(testL1);
        assertTrue(returnL1);
        IntList exceptedL1 = IntList.of(14, 15, 16, 289, 18);
        for (int i = 0; i < testL1.size(); i++) {
            assertEquals(exceptedL1.get(i), testL1.get(i));
        }
        IntList testL2 = IntList.of(1, 4, 6, 8);
        boolean returnL2 = IntListExercises.squarePrimes(testL2);
        assertFalse(returnL2);
        IntList exceptedL2 = IntList.of(1, 4, 6, 8);
        for(int i = 0; i < testL2.size(); i++){
            assertEquals(exceptedL2.get(i), testL2.get(i));
        }
    }
}
