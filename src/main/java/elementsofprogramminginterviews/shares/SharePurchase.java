package elementsofprogramminginterviews.shares;

import java.util.Arrays;
import java.util.List;

public class SharePurchase {

    public static void main(String[] args) {
        ShareDayPrice day1 = new ShareDayPrice(9.03, 5.04);
        ShareDayPrice day2 = new ShareDayPrice(4.03, 2.04);
        ShareDayPrice day3 = new ShareDayPrice(2.03, 7.04);
        ShareDayPrice day4 = new ShareDayPrice(7.03, 9.04);
        ShareDayPrice day5 = new ShareDayPrice(5.03, 1.04);
        ShareDayPrice day6 = new ShareDayPrice(1.03, 6.04);
        ShareDayPrice day7 = new ShareDayPrice(0.03, 3.04);
        ShareDayPrice day8 = new ShareDayPrice(6.03, 8.04);
        ShareDayPrice day9 = new ShareDayPrice(8.03, 4.04);
        ShareDayPrice day10 = new ShareDayPrice(3.03, 0.04);

        List<ShareDayPrice> days = Arrays.asList(day1, day2, day3, day4, day5, day6, day7, day8, day9, day10);

        System.out.println("Max profit if buy and sell on different days: " + maxProfitBuySellDiffDays(days));
        System.out.println("max profit if buy and sell on same day: " + maxProfitBuySellSameDay(days));
        System.out.println("max profit if buy and sell on same day: " + maxProfileSingleLoop(days));
    }

    private static double maxProfitBuySellDiffDays(List<ShareDayPrice> dayRange) {
        double max = 0.0;
        // purchase day
        for (int i = 0; i < dayRange.size() - 1; i++) {
            // sell day
            for (int j = i + 1; j < dayRange.size(); j++) {
                double profit = dayRange.get(j).getPriceAtOpening() - dayRange.get(i).getPriceAtOpening();
                if (profit > 0 && profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }

    private static double maxProfitBuySellSameDay(List<ShareDayPrice> dayRange) {
        double max = 0.0;
        for (ShareDayPrice day : dayRange) {
            if (day.getPriceAtOpening() > day.getPriceAtClosing()) {
                double profit = day.getPriceAtOpening() - day.getPriceAtClosing();
                if (profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }

    private static double maxProfileSingleLoop(List<ShareDayPrice> dayRange) {
        Double max = Double.MIN_VALUE;
        Double min = Double.MAX_VALUE;
        for (ShareDayPrice day : dayRange) {
            max = Math.max(day.getPriceAtOpening() - min, max);
            min = Math.min(day.getPriceAtOpening(), min);
        }
        return max;
    }
}
