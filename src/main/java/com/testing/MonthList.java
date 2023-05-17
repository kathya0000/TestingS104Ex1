package com.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonthList {
    private List<String> months;

    public MonthList() {
        String[] monthNames = {
                "enero", "febrero", "marzo", "abril",
                "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre", "noviembre", "diciembre"
        };

        months = new ArrayList<>(Arrays.asList(monthNames));
    }

    public List<String> getMonths() {
        return months;
    }
}