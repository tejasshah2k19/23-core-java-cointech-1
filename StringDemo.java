public class StringDemo {
    public static void main(String[] args) {
        // String ->class -> multiple characters

        String str = "india";
        String str2 = new String("india");

        System.out.println(str);
        System.out.println(str2);

        // java api ->

        String strX = "india";
        String strY = "india";
        String strZ = "India";

        boolean ans = strX.equals(strY); // compare two string and return true or false
        System.out.println(ans);// true
        ans = strX.equals(strZ);
        System.out.println(ans);// false
        // how to ignore the case?
        ans = strX.equalsIgnoreCase(strZ);
        System.out.println(ans);// true

        // how many characters are present in a string ?
        int len = strX.length();// return length = total number of characters in string
        System.out.println(len);

        // you want to convert entire string into uppercase
        String upper = strX.toUpperCase();
        System.out.println(upper);
        System.out.println(strX);

        // you want to convert entire string into lowercase- does not modify source
        String lower = strZ.toLowerCase();
        System.out.println(lower);
        System.out.println(strZ);

    }
}
