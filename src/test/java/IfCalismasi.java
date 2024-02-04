public class IfCalismasi {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 6;

        boolean condition1 = number1 > number2;
        boolean condition2 = number1 == number2;

        if (condition1) {
            System.out.println("buyukmus");
        } else if (condition2) {
            System.out.println("esit");
        } else {
            System.out.println("kucukmus");
        }
    }
}
