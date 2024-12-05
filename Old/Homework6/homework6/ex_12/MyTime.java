package homework6.ex_12;


public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        try {
            if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59)
                    && (second >= 0 && second <= 59)) {
                this.hour = hour;
                this.minute = minute;
                this.second = second;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        }
    }

    @Override
    public String toString() {
        String min = Integer.toString(getMinute());
        String sec = Integer.toString(getSecond());
        String hr = Integer.toString(getHour());
        if (this.getMinute() < 10) {
            min = "0" + Integer.toString(this.getMinute());
        }
        if (this.getSecond() < 10) {
            sec = "0" + Integer.toString(this.getSecond());
        }
        if (this.getHour() < 10) {
            hr = "0" + this.getHour();
        }
        return hr + ":" + min + ":" + sec;
    }

    public MyTime nextSecond() {
        if (this.getSecond() != 59) {
            this.setSecond(this.getSecond() + 1);
        } else {
            this.setSecond(0);

        }
        return this;
    }

    public MyTime nextMinute() {
        if (this.getMinute() != 59) {
            this.setMinute(this.getMinute() + 1);
        } else {
            this.setMinute(0);
        }
        return this;
    }

    public MyTime nextHour() {
        if (this.getHour() != 23) {
            this.setHour(this.getHour() + 1);
        } else {
            this.setHour(0);
        }
        return this;
    }

    public MyTime previousSecond() {
        if (this.getSecond() != 0) {
            this.setSecond(this.getSecond() - 1);
            return this;
        } else {
            this.setSecond(59);
            if (this.getMinute() != 0) {
                this.setMinute(this.getMinute() - 1);
                return this;
            } else {
                this.setMinute(59);
                if (this.getHour() != 0) {
                    this.setHour(this.getHour() - 1);
                    return this;
                } else {
                    this.setHour(23);
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        if (this.getMinute() != 0) {
            this.setMinute(this.getMinute() - 1);
        } else {
            this.setMinute(59);
            if (this.getHour() != 0) {
                this.setHour(this.getHour() - 1);
            } else {
                this.setHour(23);
            }
        }
        return this;
    }

    public MyTime previousHour() {
        if (this.getHour() != 0) {
            this.setHour(this.getHour() - 1);
        } else {
            this.setHour(23);
        }
        return this;
    }
}
