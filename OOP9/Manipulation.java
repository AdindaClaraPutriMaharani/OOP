public class Manipulation {
    public static void main(String[] args) {
        String name = "NUGRAHA";
        int length = name.length();

        System.out.println("1:");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j < length - i) {
                    System.out.print(name.charAt(j) + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("2:");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i) {
                    System.out.print(name.charAt(i) + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("3:");
            for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == 3 && i < 3) {
                    System.out.print(name.charAt(i) + " ");
                } else if (i == 3) {
                    System.out.print(name.charAt(j) + " ");
                } else if (j == 3 && i > 3) {
                    System.out.print(name.charAt(i) + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}