public class OddEven {
    public String oddEven(int number) {
        String str = new String();
        if (number == 2147483647 + 1) {
            str = "Undefined";
        } else if (number % 2 != 0 && number != 0){
            str = "Odd";
        } else {
            str = "Even";
        } return str;
    }
}
