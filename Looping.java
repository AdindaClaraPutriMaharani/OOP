public class Looping {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();


        int sum = 1;
        for (int i = 1; i <= 7; i++) {
            System.out.print(sum + " ");
            sum += i;
        }
        System.out.println();


        int value = -3;
        for (int i = 1; i <= 7; i++) {
            System.out.print(value + " ");
            value += i + 1;
        }
        System.out.println();


        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 8; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
        

        a = 0;
        b = 1;
        int c = 2;
        System.out.print(a + " " + b + " " + c + " ");
        
        for (int i = 3; i < 8; i++) {
            int next = a + b + c;
            System.out.print(next + " ");
            a = b;
            b = c;
            c = next;
        }
    }
}