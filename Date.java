package your_registration_number.java;

public class Date {
    private int day;
    private String month;
    private int year;

    // Constructor
    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter methods
    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Display method
    @Override
    public String toString() {
        return day + " " + month + " " + year;
    }
}
