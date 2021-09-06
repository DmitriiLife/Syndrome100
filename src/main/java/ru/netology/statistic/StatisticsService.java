package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = 0;
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }
    public long findSum(long[] incomes) {
        long current_sum = 0;
        for (long income : incomes)
                current_sum += income;
        return current_sum;
    }

    public long findMin(long[] incomes) {
        int current_min_index = 0;
        long current_min = incomes[0];
        for (long income : incomes)
            if (current_min > income)
                current_min = income;
        return current_min;
    }

    public long findAverage(long[] incomes) {
        long sum = findSum(incomes);
        return sum / incomes.length;
    }

    public long findAboveAverage(long[] incomes) {
        double average = findAverage(incomes);
        long Month = 0;
        for (long income : incomes) {
            if (income < average) {
                Month++;
            }
        }
        return Month;
    }

    public long findBelowAverage(long[] incomes) {
        double average = findAverage(incomes);
        long Month = 0;
        for (long income : incomes) {
            if (income > average) {
                Month++;
            }
        }
        return Month;
    }
}
