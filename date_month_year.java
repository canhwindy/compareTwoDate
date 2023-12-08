package loc20_day_ddmmyy;

public class date_month_year {
    private int date;
    private int month;
    private int year;

    public void checkDateInvalid(String ngayThangNam) {
        String[] tungPhan = ngayThangNam.split("/");
        int day = Integer.parseInt(tungPhan[0]);
        int month = Integer.parseInt(tungPhan[1]);
        int year = Integer.parseInt(tungPhan[2]);

        if (month > 12 || day > 31) {
            System.out.println("Invalid Date");
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
            System.out.println("Invalid Date");
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            System.out.println("Invalid Date");
        } else if (month == 2 && day > 29) {
            System.out.println("Invalid Date");
        }
    }

    public void compareTwoDate(String n1, String n2) {
        String[] tungPhan = n1.split("/");
        int day = Integer.parseInt(tungPhan[0]);
        int month = Integer.parseInt(tungPhan[1]);
        int year = Integer.parseInt(tungPhan[2]);

        String[] tungPhan2 = n2.split("/");
        int day1 = Integer.parseInt(tungPhan2[0]);
        int month1 = Integer.parseInt(tungPhan2[1]);
        int year1 = Integer.parseInt(tungPhan2[2]);

        if (year < year1) {
            System.out.println("Date 1 is before Date 2");
        } else if (year > year1) {
            System.out.println("Date 2 is before Date 1");
        } else {
            if (month < month1) {
                System.out.println("Date 1 is before Date 2");
            } else if (month > month1) {
                System.out.println("Date 2 is before Date 1");
            } else {
                if (day < day1) {
                    System.out.println("Date 1 is before Date 2");
                } else if (day > day1) {
                    System.out.println("Date 2 is before Date 1");
                } else {
                    System.out.println("Date 1 == Date 2");
                }
            }
        }
    }
}
