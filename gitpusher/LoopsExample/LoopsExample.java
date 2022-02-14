package LoopsExample;

class LoopsExample {
    private static void loopingExample() {
        String astr = "*";
        String divider = "..........";

        System.out.println("1)");
        
        for (int i = 1; i <= 4; i++) {
            // Only works on Java 11+, below that, we need to use a StringBuilder
            System.out.println(astr.repeat(i));
        }

        System.out.println(divider + "\n2)\n" + divider);

        for (int i = 4; i > 0; i--) {
            System.out.println(astr.repeat(i));
        }

        System.out.println(divider + "\n3)\n" + divider);

        for (int i = 0; i < 4; i++) {
            System.out.println(" ".repeat(6 - i) + "*".repeat(2 * i + 1) + " ".repeat(6 - i));
        }

        System.out.println(divider + "\n4)\n" + divider);

        for (int i = 3; i >= 0; i--) {
            System.out.println(" ".repeat(6 - i) + "*".repeat(2 * i + 1) + " ".repeat(6 - i));
        }
    }

    public static void main(String[] args) {
        loopingExample();
    }
}
