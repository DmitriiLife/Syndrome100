package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    StatisticsService service = new StatisticsService();
    public long[] incomesInBillions = {11, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};


    @Test
    void findMax() {
        assertEquals(12, service.findMax(incomesInBillions));
    }
}