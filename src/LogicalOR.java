public class LogicalOR {
    public static void main(String[] args) {
        int number = 145;
        if (number < 0 || number > 100){
            System.out.println("Is the number less than 0 OR greater than 100? ");
            System.out.println("Yes! :)");
        }
        else {
            System.out.println("Nope!(");
        }
    }
}
