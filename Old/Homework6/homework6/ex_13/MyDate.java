package homework6.ex_13;

public class MyDate {
    String[] MONTHS = {"Jan", "Feb", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public boolean isValidDate(int year, int months, int day) {
        if ((year >= 1 && year <= 9999) && (months >= 1 && months <= 12)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day > 0 && day < 32) {
                        return true;
                    }
                    break;
                case 2:
                    if ((isLeapYear(year) && day > 0 && day < 30) || (!isLeapYear(year) && day > 0 && day < 29))
                        return true;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day > 0 && day < 31) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public int getDayOfWeek(int year, int month, int day) {
        //Gauss's algorithm for determining the day of the week
        if ((day += month) < 3) {
            year--;
        } else {
            year = year - 2;
        }
        return (23 * month / 9 + day + 4 + year / 4 - year / 100 + year / 400) % 7;
    }

    public void setDate(int year, int month, int day) {
        try {
            if (isValidDate(year, month, day)) {
                this.year = year;
                this.month = month;
                this.day = day;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year, month, or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        try {
            if (year >= 1 && year <= 9999) {
                this.year = year;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        try {
            if (month >= 1 && month <= 12) {
                this.month = month;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int dayMax = 0;
        switch (this.getMonth()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayMax = 31;
                break;
            case 2:
                if (isLeapYear(this.year))
                    dayMax = 29;
                else dayMax = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayMax = 30;
                break;
        }
        try {
            if (day > 0 && day <= dayMax) {
                this.day = day;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid month!");
        }
    }

    public int dayMax() {
        int dayMax = 0;
        switch (this.getMonth()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayMax = 31;
                break;
            case 2:
                if (isLeapYear(this.year))
                    dayMax = 29;
                else dayMax = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayMax = 30;
                break;
        }
        return dayMax;
    }


    public MyDate nextDay() {
        if (this.getDay() != this.dayMax()) {
            ++this.day;
        } else {
            this.day = 1;
            if (this.month == 12) {
                this.month = 1;
                ++this.year;
            } else {
                ++this.month;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        int tempMonth = this.getMonth() + 1;
        if (this.getMonth() == 12) {
            tempMonth = 1;
        }
        MyDate temp = new MyDate(this.getYear(), tempMonth, 1);
        if (this.dayMax() > temp.dayMax()) {
            this.setDay(this.dayMax());
        }
        if (this.month == 12) {
            this.setMonth(1);
            ++this.year;
        } else ++this.month;

        return this;
    }

    public MyDate nextYear() {
        try {
            if (this.year < 10000) {
                ++this.year;
                return this;
            }
            if (isLeapYear(this.getYear())) {
                if ((this.getMonth() == 2) && (this.getDay() == 29)) {
                    this.setDay(28);
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Year out of range!");
        }

        return this;
    }

    public MyDate previousDay() {
        if (this.day != 1) {
            --this.day;
        } else {
            if (this.getMonth() != 1) {
                this.day = this.dayMax();
                --this.month;
            } else {
                this.day = 31;
                this.month = 12;
                --this.year;
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        int tempMonth = this.getMonth() - 1;
        if (this.getMonth() == 1) {
            tempMonth = 12;
        }
        MyDate temp = new MyDate(this.getYear(), tempMonth, 1);
        if (this.dayMax() > temp.dayMax()) {
            this.setDay(this.dayMax());
        }
        if (this.getMonth() != 1) {
            --this.month;
        } else this.month = 12;

        return this;
    }

    public MyDate previousYear() {
        try {
            if (this.year > 0) {
                --this.year;
            }
            if (isLeapYear(this.getYear())) {
                if ((this.getMonth() == 2) && (this.getDay() == 29)) {
                    this.setDay(28);
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Year out of range!");
        }
        return this;
    }
}
