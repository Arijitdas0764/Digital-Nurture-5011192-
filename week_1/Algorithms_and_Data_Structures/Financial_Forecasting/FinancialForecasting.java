package Java_FSE.week_1.Algorithms_and_Data_Structures.Financial_Forecasting;

import java.util.*;

public class FinancialForecasting {

    private static double[] dp;

    public static void main(String[] args) {
        double initialInvestment = 10000;
        double growthRate = 0.05; // 5%
        int years = 10;

        dp = new double[years + 1];
        Arrays.fill(dp, -1);

        double futureValue = calculateFutureValue(initialInvestment, growthRate, years);
        System.out.println("The future value is: " + futureValue);
    }

    private static double calculateFutureValue(double initialInvestment, double growthRate, int years) {
        if (years == 0) {
            return initialInvestment;
        } 
        else if (dp[years] != -1) {
            return dp[years];
        } 
        else {
            double result = (initialInvestment + calculateFutureValue(initialInvestment, growthRate, years - 1) * growthRate);
            dp[years] = result;
            return result;
        }
    }
}
