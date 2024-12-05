package ex_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class TestList {

    @Test
    void testInsertFirst() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ListEx.insertFirst(list, 0);
        assertEquals(Arrays.asList(0, 1, 2, 3), list);
    }

    @Test
    void testInsertLast() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ListEx.insertLast(list, 4);
        assertEquals(Arrays.asList(1, 2, 3, 4), list);
    }

    @Test
    void testReplace() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ListEx.replace(list, 4);
        assertEquals(Arrays.asList(1, 2, 4), list);
    }

    @Test
    void testRemoveThird() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ListEx.removeThird(list);
        assertEquals(Arrays.asList(1, 2), list);
    }

    @Test
    void testRemoveEvil() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 666, 3));
        ListEx.removeEvil(list);
        assertEquals(Arrays.asList(1, 2, 3), list);
    }

    @Test
    void testGenerateSquare() {
        ArrayList<Integer> list = ListEx.generateSquare();
        assertEquals(Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100), list);
    }

    @Test
    void testContains() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertTrue(ListEx.contains(list, 2));
        assertFalse(ListEx.contains(list, 4));
    }

    @Test
    void testCopy() {
        ArrayList<Integer> source = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> target = new ArrayList<>(Arrays.asList(4, 5, 6));
        ListEx.copy(source, target);
        assertEquals(Arrays.asList(1, 2, 3), target);
    }

    @Test
    void testReverse() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ListEx.reverse(list);
        assertEquals(Arrays.asList(3, 2, 1), list);
    }

    @Test
    void testReverseManual() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ListEx.reverseManual(list);
        assertEquals(Arrays.asList(3, 2, 1), list);
    }

    @Test
    void testInsertBeginningEnd() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3));
        ListEx.insertBeginningEnd(list, 0);
        assertEquals(Arrays.asList(0, 1, 2, 3, 0), list);
    }
}