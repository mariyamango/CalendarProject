public class Main {
    public static void main(String[] args) {
        String[] months = new String[] {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        for (String month : months) {
            printCalendarForMonth(month,30);
        }
    }

    public static void printCalendarForMonth(String monthName, int daysInMonth) {
        System.out.println(monthName);

        System.out.println("Mo Tu We Th Fr Sa Su");

        for (int i = 1; i <= daysInMonth; i++) {
            System.out.print(i + "  ");
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}