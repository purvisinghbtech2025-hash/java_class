public class assignment4 {

    public static void main(String[] args) {

        // autoboxing - primitive to wrapper object
        int num = 25;
        Integer numObj = num;

        double val = 10.5;
        Double valObj = val;

        char ch = 'A';
        Character chObj = ch;

        boolean flag = true;
        Boolean flagObj = flag;

        System.out.println("Autoboxed Integer: " + numObj);
        System.out.println("Autoboxed Double: " + valObj);
        System.out.println("Autoboxed Character: " + chObj);
        System.out.println("Autoboxed Boolean: " + flagObj);
        System.out.println();

        // unboxing - wrapper object back to primitive
        int backToInt = numObj;
        double backToDouble = valObj;

        System.out.println("Unboxed int: " + backToInt);
        System.out.println("Unboxed double: " + backToDouble);
        System.out.println();

        // converting String to primitive/wrapper using parse methods
        String strNum = "150";
        int parsedInt = Integer.parseInt(strNum);

        String strVal = "99.99";
        double parsedDouble = Double.parseDouble(strVal);

        System.out.println("Parsed int from String: " + parsedInt);
        System.out.println("Parsed double from String: " + parsedDouble);
        System.out.println();

        // converting primitive/wrapper to String
        String numToStr = Integer.toString(num);
        String valToStr = Double.toString(val);

        System.out.println("Int to String: " + numToStr);
        System.out.println("Double to String: " + valToStr);
        System.out.println();

        // basic operations using wrapper class methods
        int maxVal = Integer.max(45, 78);
        int minVal = Integer.min(45, 78);
        double sqrtVal = Math.sqrt(numObj);

        System.out.println("Max of 45 and 78: " + maxVal);
        System.out.println("Min of 45 and 78: " + minVal);
        System.out.println("Square root of numObj: " + sqrtVal);
        System.out.println();

        // comparing wrapper objects
        Integer a = 100;
        Integer b = 200;
        System.out.println("a.compareTo(b): " + a.compareTo(b));
    }
}