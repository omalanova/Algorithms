package hw1718;

public class CharOddIndex {
    public String outputCharOddIndex(String str) {
        String str_out = "";
        for (int i = 1; i < str.length(); i += 2) {
            str_out += str.charAt(i);
        }
        return str_out;
    }
}
