import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        User user = new User();
        User users[] = new User[5];// declaration array
        // users[0]=null users[1] users[2] users[3] users[4]
        int userIndex = 0;
        boolean success = false;
        String search;
        while (true) {
            System.out
                    .println(
                            "\n\nPress 1 For Input\n2 For Display\n3 For Exit\n4 For Search \n5 For Sort Data By Age-asc");
            System.out.println("Enter Your Choice");
            int choice = scr.nextInt();

            switch (choice) {
                case 1:
                    if (userIndex == 5) {
                        System.out.println("All Registration completed...");
                    } else {
                        users[userIndex] = new User();// allocate memory {}
                        users[userIndex].getData();
                        userIndex++;// 1 2 3 4
                    }
                    break;
                case 2:
                    for (int i = 0; i < userIndex; i++) {
                        users[i].printData();
                    }
                    break;
                case 3:
                    System.exit(0);// shutdown your app
                case 4:
                    System.out.println("Enter Name - Search ");
                    search = scr.next();
                    // A B C D
                    // E
                    success = false;
                    for (int i = 0; i < userIndex; i++) {
                        if (users[i].firstName.equals(search)) {
                            users[i].printData();
                            success = true;
                        }
                    }
                    if (success == false) {
                        System.out.println("No User Found!!!");
                    }
                    break;
                case 5:
                    // sort
                    // if(users[j].age > users[j+1].age ){

                    // }
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }// switch
        } // while
    }// main

}// class

class User {
    String firstName;
    String email;
    String password;
    int bornYear;
    int age;

    Scanner scr = new Scanner(System.in);

    void getData() {
        System.out.println("Enter FirstName");
        firstName = scr.next();
        System.out.println("Enter Email");
        email = scr.next();
        System.out.println("Enter Password");
        password = scr.next();
        System.out.println("Enter BornYear");
        bornYear = scr.nextInt();
        calcAge();
    }

    void calcAge() {
        age = 2023 - bornYear;
    }

    void printData() {
        System.out.println("FirstName : " + firstName);
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        System.out.println("Age : " + age);
    }
}
