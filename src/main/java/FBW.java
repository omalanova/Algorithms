public class FBW {

    public static boolean mod(int a, int b, int c) {
        return a % b == c;
    }

    public static boolean div(int a, int b, int c) {
        return a / b == c;
    }

    public static String fBW() {
        boolean mod3, mod5, mod7, mod10_3, mod10_5, mod10_7, div10_3, div10_5, div10_7;
        String str = "";
        String str_output = "";

        for (int i = 1; i < 100; i++) {
            mod3 = mod(i, 3, 0);
            mod5 = mod(i, 5, 0);
            mod7 = mod(i, 7, 0);
            mod10_3 = mod(i, 10, 3);
            mod10_5 = mod(i, 10, 5);
            mod10_7 = mod(i, 10, 7);
            div10_3 = div(i, 10, 3);
            div10_5 = div(i, 10, 5);
            div10_7 = div(i, 10, 7);


            if (!mod3 && !mod5 && !mod7 && !mod10_3 && !mod10_5 && !mod10_7 && !div10_3 && !div10_5 && !div10_7) {
                str_output += String.valueOf(i) + " ";
                System.out.print(i);
            } else {
                str = "";

                if (mod3) {
                    str += "Fizz";
                }
                if (mod10_3) {
                    str += "Fizz";
                }
                if (div10_3) {
                    str += "Fizz";
                }
                if (mod5) {
                    str += "Buzz";
                }
                if (mod10_5) {
                    str += "Buzz";
                }
                if (div10_5) {
                    str += "Buzz";
                }
                if (mod7) {
                    str += "Woof";
                }
                if (mod10_7) {
                    str += "Woof";
                }
                if (div10_7) {
                    str += "Woof";
                }

                System.out.print(str);
                str_output += str + " ";
            }
        } return str_output;
    }

    public static void main(String[] args) {
        fBW();

    }
}
