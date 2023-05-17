package com.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MonthListTest {
    @Test
    public void testMonthList() {
        MonthList monthList = new MonthList();
        List<String> months = monthList.getMonths();

        Assertions.assertNotNull(months);
        Assertions.assertEquals(12, months.size());
        Assertions.assertEquals("agosto", months.get(7));
    }
}
