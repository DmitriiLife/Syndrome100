package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findSum() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 85;
        long actual = service.findSum(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long actual = service.findMin(incomesInBillions);
        long expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void findAverage() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 7;
        long actual = service.findAverage(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findAboveAverage() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long actual = service.findAboveAverage(incomesInBillions);
        long expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    void findBelowAverage() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long actual = service.findBelowAverage(incomesInBillions);
        long expected = 6;
        assertEquals(expected, actual);
    }
}