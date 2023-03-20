package bt1;

public class NextDayCalculator {

    public static String nextDay(int day, int month, int year) {

        boolean month30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean month31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10;
        boolean normalDay = day >= 1 && day < 30;
        if (month == 2) {
            boolean dayOfMonth2 = day >= 1 && day < 28;

            if (year == 2018) {
                if (dayOfMonth2) {
                    day++;
                } else if (day == 28) {
                    day = 1;
                    month++;
                }
            } else if (year == 2020) {
                if (dayOfMonth2) {
                    day++;
                } else if (day == 29) {
                    day = 1;
                    month++;
                }
            }
        } else {
            if (normalDay) {
                day++;
            } else {
                if (month31) {
                    if (day == 31) {
                        day = 1;
                        month++;
                    }
                } else if (month30) {
                    if (day == 30) {
                        day = 1;
                        month++;
                    }
                } else if (month == 12) {
                    if (day == 31) {
                        day = 1;
                        month = 1;
                        year++;
                    }
                }
            }
        }

        return day + "/" + month + "/" + year;
    }
}
