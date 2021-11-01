package hw1718;

public class ChangeO {
    public static String outputChangeO(String str) {
        str = str.replace('0', 'o');
        return str;
    }

    public static String outChangeO(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                str = str.substring(0, i) + 'o' + str.substring(i + 1, str.length());
            }
            if (i == str.length() - 1 && str.charAt(i) == '0') {
                str = str.substring(0, str.length() - 1) + 'o';
            }
        }

        return str;
    }

//    public static void main(String[] args) {
//        String str = "QAF0rEvery0ne000010";
//        System.out.println(outChangeO(str));
//    }
}
