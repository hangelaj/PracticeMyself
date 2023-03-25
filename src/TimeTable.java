import java.util.Scanner;
public class TimeTable {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What time table would you like? :");
        int TimesTable=reader.nextInt();
        for(int i= 1;i <=12;i++){
            System.out.println(TimesTable + "X"+ i +"="+ TimesTable*i );
        }
    }
}
