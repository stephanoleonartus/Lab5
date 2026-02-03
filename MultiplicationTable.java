import java.util.*;
public class MultiplicationTable {
    public static void printTable(int number){
        for(int i = 1; i <= 12; i++){
            System.out.println(number + " X " + i + " = "+ (number * i));
        }
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number: ");
        int mutl = number.nextInt();
        printTable(mutl);
    }
}
