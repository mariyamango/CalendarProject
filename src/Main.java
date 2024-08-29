public class Main {
    public static void main(String[] args) {
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int offset = 0;
        for (int i = 0; i < months.length; i++) {
            printCalendarForMonth(months[i], daysInMonth[i], offset);
            offset = (offset + daysInMonth[i]) % 7;
        }
    }

    public static void printCalendarForMonth(String monthName, int daysInMonth, int offset) {
        printMonthName(monthName);
        printDaysNames();
        printCalendar(daysInMonth, offset);
    }

    private static void printCalendar(int daysInMonth, int offset) {
        int dayOfWeek = 0;
        for (int dayOfMonth = 1 - offset; dayOfMonth <= daysInMonth; dayOfMonth++) {
            if (dayOfMonth <= 0) {
                System.out.print("\t");
            } else {
                System.out.printf("%s\t", dayOfMonth);
            }
            if ((dayOfWeek == 6 && dayOfMonth >= 1) || (dayOfMonth == daysInMonth)) {
                dayOfWeek = 0;
                System.out.println();
            } else {
                dayOfWeek++;
            }

        }
    }

    private static void printDaysNames() {
        String[] daysNames = new String[]{"Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"};
        for (String dayName : daysNames) {
            System.out.print(dayName + "\t");
        }
        System.out.println();
    }

    private static void printMonthName(String monthName) {
        System.out.println("\n" + monthName);
    }
}