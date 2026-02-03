public class Calculator {

    public static void calculator(double a, double b, char oparator){
        switch(oparator){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            
        }
    }
    public static void main(String[] args){
        calculator(2, 3,  '+');
    }
}
