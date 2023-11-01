public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer("india");

        System.out.println(sb); // blank
        System.out.println(sb1);// india

        sb1.reverse(); // aidni
        System.out.println(sb1);
        System.out.println(sb1.length());

        StringBuffer sb2 = new StringBuffer("amazon");
        sb2.append(" web services");
        System.out.println(sb2);// amazon web services

        String s = sb2.toString();

        StringBuffer sb3 = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb3);

        sb3.insert(5, "XXXXX");
        System.out.println(sb3);
        sb3.delete(5, 10);// 5 6 7 8 9
        System.out.println(sb3);

        sb3.indexOf("");
        sb3.lastIndexOf("");

        StringBuffer s1 = new StringBuffer("edu");
        StringBuffer s2 = new StringBuffer("Edu");
        StringBuffer s3 = new StringBuffer("edu");

        System.out.println(s1.compareTo(s2));// 32 s1 - s2
        System.out.println(s1.compareTo(s3));// 0
        // ASCII -- ANSI
        // 256 character

        // UNICODE -> 65536 -> java
        // binary-> 010101
        // A -> 65 -> 1000001 E -> 69
        // a -> 97 b->98 c->99 d->100 e->101

        // s1 edu
        // s2 Edu
        // --------
        // 32

        // s1 edu
        // s3 edu
        // --------
        // 000 => 0

        StringBuilder sb33 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb33);

        sb33.insert(5, "XXXXX");
        System.out.println(sb3);
        sb33.delete(5, 10);// 5 6 7 8 9
        System.out.println(sb33);

    }
}
