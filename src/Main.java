// Main.java
// Entry point for Student Management System
// Author: Awani Arsh

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to the Student Management System!");

        // Infinite loop for menu until user exits
        while (true) {
            System.out.println("\n==============================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("==============================");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Please enter a valid number!");
                continue;
            }

            switch (choice) {
                case 1 -> manager.addStudent();
                case 2 -> manager.viewStudents();
                case 3 -> manager.searchStudent();
                case 4 -> manager.deleteStudent();
                case 5 -> {
                    System.out.println("👋 Exiting... Have a great day!");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println(" Invalid choice! Please try again.");
            }
        }
    }
}
