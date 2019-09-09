/*Write a Java program to print the following columns of values. Use \t for the tabs between the columns.
        Cost      Quantity   Total
        $1,000.00   4       $4,000.00
        $   50.00   8         $400.00
        ______________________________
        TOTAL:      12      $4,400.00*/

public class Main {
    public static void main(String[] args) {
        System.out.printf("\n%-10s\t%-8s\t%-10s", "Cost", "Quantity", "Total");
        System.out.printf("\n%10s\t%8s\t%10s", "$1,000.00", "4", "$4,000.00");
        System.out.printf("\n%10s\t%8s\t%10s", "$50.00", "8", "$400.00");
        System.out.printf("\n____________________________");
        System.out.printf("\n%-10s\t%8s\t%10s", "TOTAL", "12", "$4,400.00");
    }
}
