public class Main{
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("Welcome to CAB302!");
        System.out.println("This is our first project!");
        for(int i = 0; i < 5; i++) {
            System.out.println("************");
        }
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (4 - i) * 2; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i * 4 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
