public class Main {
    public static void main(String[] args) {
        String[] months = new String[] {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        for (String month : months) {
            printCalendarForMonth(month);
        }
    }

    public static void printCalendarForMonth(String monthName) {
        System.out.println(monthName);

        System.out.println("Mo Tu We Th Fr Sa Su");
        System.out.println("1  2  3  4  5  6  7");

    }
}