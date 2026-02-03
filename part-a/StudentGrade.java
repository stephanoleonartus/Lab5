import java.util.Scanner;
public class StudentGrade{
    
    public static char getGrade (int score){
        if(score >= 70){
            
        return 'A';
        }else if(score >= 60 && score <= 69){
            return 'B';
        }else if(score >= 50 && score <= 59){
            return 'C';
        }else if(score >= 40 && score <= 49){
            return 'D';
        }else{
            return 'F';
        }
    }
    public static void main(String[] args){
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter grade: ");
        int score = grade.nextInt();
        char mark = getGrade(score);
        
        System.out.println(mark );

    }
}