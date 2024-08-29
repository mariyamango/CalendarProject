public class Main {
    public static void main(String[] args) {
        String[] months = new String[] {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        for (String month : months) {
            printCalendarForMonth(month);
        }
    }

    public static void printCalendarForMonth(String monthName) {
        System.out.println(monthName);
    }
}