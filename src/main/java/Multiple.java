public class Multiple {
    public String multiple(int m) {
        if (m % 3 == 0 && m % 5 == 0) return "Good Number";
        else if (m % 3 == 0 && m % 5 != 0) return "Bad Number";
        else if (m % 5 == 0 && m % 3 != 0) return "Poor Number";
        else return "-1";
    }

    public static void main(String[] args) {
        Multiple obj1 = new Multiple();
        System.out.println(obj1.multiple(15));
        System.out.println(obj1.multiple(9));
        System.out.println(obj1.multiple(25));
        System.out.println(obj1.multiple(1));

    }
}

