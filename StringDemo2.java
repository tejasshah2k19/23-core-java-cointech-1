public class StringDemo2 {
    public static void main(String[] args) {
        String str = "india";
        // 01234
        // print 1st characters
        // Tejas Shah -> TS
        // how many T present name in a name
        // how many alphbets or digit or special symbol present in string

        // charAt(index) // index -> starts with 0
        System.out.println(str);
        System.out.println(str.charAt(0));// i
        System.out.println(str.charAt(4));// a
        // 0 1 2 3 4
        System.out.println("======================");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));// 0 1 2 3 4
        }
        // run time error -> exception
        // System.out.println(str.charAt(-1));
        // System.out.println(str.charAt(5));

        System.out.println("================");

        String str2 = "jony jony yes papa";
        // what is the index of p ?
        // p is present in str2?
        int x = str2.indexOf('p');// 14
        System.out.println(x);
        System.out.println(str2.indexOf('a'));// 15
        System.out.println(str2.indexOf('J'));// -1
        System.out.println(str2.indexOf("papa"));// 14
        System.out.println(str2.indexOf("jony"));// 0

        String str3 = "jony yes jony yes jony yes";
        System.out.println(str3.indexOf("jony"));// 0
        System.out.println(str3.lastIndexOf("jony"));// 18

        System.out.println("===========================");

        // i am king king is magician
        // ng cian king

        String str4 = "i am king king is a magician";
        System.out.println(str4.contains("ing"));// true
        System.out.println(str4.contains("magician"));// true
        System.out.println(str4.contains("Magician"));// false
        System.out.println(str4.contains("ak"));// false
        System.out.println("===============================");

        String str5 = "reserve bank of india";
        System.out.println(str5.substring(5));//
        System.out.println(str5.substring(5, 10));// 5,9
        // 5 : inclusive , 10 : exclusive{ 5 6 7 8 9 }

        System.out.println("===========================");
        String email = "abc@gmail.com";

        boolean ans = email.endsWith("@gmail.com"); // boolean
        System.out.println(ans);// true
        System.out.println(email.endsWith("@gmail.com")); // true
        System.out.println(email.endsWith("yopmail.com"));// false

        String str6 = "india is good country";
        System.out.println(str6.startsWith("india"));// true

        System.out.println("===========================");

        String str7 = "jony jony yes papa";
        String result[] = str7.split(" ");// 4

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);

    }
}
