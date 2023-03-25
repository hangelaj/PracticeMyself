public class LogicalNOT {
    public static void main(String[] args) {
        String text = "water";
        if(!(text.equals("milk")))
        {
            System.out.println("Is the string equal to 'milk'?");
            System.out.println("is false");
        }
        else {
            System.out.println(" is true");
        }
    }
}
