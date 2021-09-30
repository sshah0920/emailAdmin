package emailadmin;

import java.util.Locale;
import java.util.Scanner;

public class emails extends app {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCap = 1000;
    private String email;
    private String altEmail;
    private String companyName = "stallions";

    // Constructor with FirstName & LastName

    public emails(String firstName, String lastName) {
        // Header for the Application.
        System.out.println("\n****** Company Email Generator ****** \n");

        // Getting the First Name and Last Name from the Parameters.
        this.firstName = firstName;
        this.lastName = lastName;

        // Full Name of the Employee.
        String fullname = (this.firstName + this.lastName).toLowerCase();

        // Printing the Full Name.
        System.out.println("Given Full Name: " + firstName + " " + lastName + "\n");

        // Getting Department Information from the E,mployee.
        this.department = setDept();
        System.out.println("Selected Department: " + this.department);

        // Company Email of the Employee.
        String email = fullname + "." + department.toLowerCase() + "@" + companyName.toLowerCase() + ".com";
        System.out.println("Your Company Email ID is: " + email);

        // Generating a Random Password.
        this.password = passwordGenerator(10);
        System.out.println("\nYour Password is: " + password);

    }

    // Department Confirmation
    private String setDept() {
        System.out.println("SELECT YOUR DEPARTMENT: \n[1] Sales \n[2] Marketing \n[3] Healthcare \n[4] Designing \n[5] Engineering ");
        Scanner input = new Scanner(System.in);
        System.out.println("Department: ");
        int deptSelection = input.nextInt();
        if (deptSelection == 1) {
            return "Sales";
        } else if (deptSelection == 2) {
            return "Marketing";
        } else if (deptSelection == 3) {
            return "Healthcare";
        } else if (deptSelection == 4) {
            return "Designing UI/UX";
        } else if (deptSelection == 5) {
            return "Engineering";
        } else {
            return "General";
        }
    }
    // Set Email Cap

    public void setMailBoxCap(int cap) {
        this.mailBoxCap = cap;
    }

    // Password Generator
    private String passwordGenerator(int length) {
        String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQURSTVUWXYZ1234567890!#$%^&*(){}[]";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int randomValue = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomValue);
        }
        return new String(password);
    }

    // Change Password
    public void changePassword(String password) {
        this.password = password;
    }

    // Alternate Email
    public void setAlternateEmail(String newEmail) {
        this.altEmail = newEmail;
    }

    public int getMailBoxCap()  {
        return mailBoxCap;
    }
    public String getAlternateEmail()  {
        return altEmail;
    }

    public String getPassword() {
        return password;
    }

    public String info() {
        return "Name: " + firstName + " " + lastName + "\n" + "Company Email: " + email +"\n" + "Mailbox Capacity: " + mailBoxCap + " emails";
     }
}
