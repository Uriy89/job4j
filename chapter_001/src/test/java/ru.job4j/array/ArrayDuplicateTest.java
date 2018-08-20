package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.*;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"London", "New-York", "Moskow", "London"};
        String[] except = {"London", "New-York", "Moskow"};
        ArrayDuplicate dupl = new ArrayDuplicate();
        String[] result = dupl.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}
