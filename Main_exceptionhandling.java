public class Main_exceptionhandling {
    public static void main(String[] args) {
        System.out.println("1.ArithmeticException ");
        int a = 10;
        int b = 0;
        try {
            int x = a / b;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("2.ArrayIndexOutOfBoundsException");
        int[] arr = new int[10];
        try {
            arr[12] = 5;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("3.ClassNotFoundException");
        try {
            Class.forName("Class Employee"); // Class Employee is not defined
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("4.NumberFormatException");
        try {
            int num = Integer.parseInt("sss"); // "akki" is not a number
            System.out.println(num);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}