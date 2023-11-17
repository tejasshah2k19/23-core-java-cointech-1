public class SortingDemo {
    public static void main(String[] args) {
        // sorting
        // 10 30 20 25 63 85 41
        // asc smallest to largest
        // desc largest to smallest

        // asc
        // 10 20 25 30 41 63 85
        // desc
        // 85 63 41 30 25 20 10

        // fl am -> sort -> price -> hight to low , low to high
        // sort -> by rating

        int a[] = { 10, 30, 20, 25, 63, 85, 41 };// 7 size
        // int x[] = new int[20];
        int tmp;
        // 0 1 2 3 4 5

        System.out.println("Before Sorting");
        for (int i = 0; i < 7; i++) {
            System.out.println(a[i]);
        }

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (a[j] > a[j + 1]) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }

        System.out.println("After Sorting");

        for (int i = 0; i < 7; i++) {
            System.out.println(a[i]);
        }

    }
}
