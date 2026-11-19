package com.bootcampexcercise.module7.activity;

// Needs to be completed
// This program accepts a user name and checks user's validity
// The user name is checked against an array of names.
public class CustomExceptionActivityTest {

    // 1 - Type main method and call validateUser() from it.
    // Call this method with different names to test it.
    public static void main(String[] args) {
        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();
        try {
            obj.validateUser("John");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }

        try {
            obj.validateUser("Alex");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
        try {
            obj.validateUser("Mike");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
        try {
            obj.validateUser("Ilya");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }


    void validateUser(String name) throws CustomExceptionActivity {
        // Array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
        // Flag stores 1 if a match is found else it should remain 0
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            // 2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
            if (name.equals(validUsers[i])) {
                flag = 1;
            }
        }
        // 3 - Check if flag is zero, throw CustomExceptionActivity Exception.
        // You may also have to declare this exception in the method signature using throws.
            if (flag == 0) {
                System.out.println("Access denied for " + name);
                throw new CustomExceptionActivity();
            }

        // 4 - Else if flag is one, print a message "Welcome to Payroll program".
            else {
                System.out.println("Welcome to Payroll program " + name);
            }
    }
}