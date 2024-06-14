package com.lkm.jdbctut;
import java.sql.*;
import java.util.Scanner;

public class ProcessManagementSystem {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/accenture";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    private static Connection conn;
    private static PreparedStatement stmt;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Establish JDBC connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connected to the database!");

            int choice;
            do {
                displayMenu();
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case 1:
                        manageEmployees();
                        break;
                    case 2:
                        manageDepartments();
                        break;
                    case 3:
                        manageProjects();
                        break;
                    case 4:
                        manageTasks();
                        break;
                    case 5:
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 5);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nProcess Management System");
        System.out.println("1. Manage Employees");
        System.out.println("2. Manage Departments");
        System.out.println("3. Manage Projects");
        System.out.println("4. Manage Tasks");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void manageEmployees() throws SQLException {
        int choice;
        do {
            System.out.println("\nEmployee Management");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. View Employees");
            System.out.println("5. Go Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    updateEmployee();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    viewEmployees();
                    break;
                case 5:
                    System.out.println("Going back to the main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void addEmployee() throws SQLException {
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter department ID: ");
        int departmentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String query = "INSERT INTO Employees (EmployeeName, DepartmentID) VALUES (?, ?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, employeeName);
        stmt.setInt(2, departmentID);
        int rowsAffected = stmt.executeUpdate();

        System.out.println(rowsAffected + " row(s) inserted.");
    }

    private static void updateEmployee() throws SQLException {
        // Implementation for updating an employee
    	System.out.print("Enter employee ID to update: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter new employee name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter new department ID: ");
        int departmentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String query = "UPDATE Employees SET EmployeeName = ?, DepartmentID = ? WHERE EmployeeID = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, employeeName);
        stmt.setInt(2, departmentID);
        stmt.setInt(3, employeeID);
        int rowsAffected = stmt.executeUpdate();

        System.out.println(rowsAffected + " row(s) updated.");
    }

    private static void deleteEmployee() throws SQLException {
        // Implementation for deleting an employee
    	  System.out.print("Enter employee ID to delete: ");
    	    int employeeID = scanner.nextInt();
    	    scanner.nextLine(); // Consume newline character

    	    String query = "DELETE FROM Employees WHERE EmployeeID = ?";
    	    stmt = conn.prepareStatement(query);
    	    stmt.setInt(1, employeeID);
    	    int rowsAffected = stmt.executeUpdate();

    	    System.out.println(rowsAffected + " row(s) deleted.");
    }

    private static void viewEmployees() throws SQLException {
        // Implementation for viewing employees
    	String query = "SELECT EmployeeID, EmployeeName, DepartmentID FROM Employees";
        stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        System.out.println("Employees:");
        while (rs.next()) {
            int employeeID = rs.getInt("EmployeeID");
            String employeeName = rs.getString("EmployeeName");
            int departmentID = rs.getInt("DepartmentID");
            System.out.println("ID: " + employeeID + ", Name: " + employeeName + ", Department ID: " + departmentID);
        }
    }
    
    

    private static void manageDepartments() throws SQLException {
        // Implementation for managing departments
    	 int choice;
         do {
             System.out.println("\nDepartment Management");
             System.out.println("1. Add Department");
             System.out.println("2. Update Department");
             System.out.println("3. Delete Department");
             System.out.println("4. View Department");
             System.out.println("5. Go Back");
             System.out.print("Enter your choice: ");
             choice = scanner.nextInt();
             scanner.nextLine(); // Consume newline character

             switch (choice) {
                 case 1:
                     addDepartment();
                     break;
                 case 2:
                     updateDepartment();
                     break;
                 case 3:
                     deleteDepartment();
                     break;
                 case 4:
                     viewDepartments();
                     break;
                 case 5:
                     System.out.println("Going back to the main menu...");
                     break;
                 default:
                     System.out.println("Invalid choice. Please try again.");
             }
         } while (choice != 5);
    }
    

    private static void addDepartment() throws SQLException {
        System.out.print("Enter department name: ");
        String departmentName = scanner.nextLine();

        String query = "INSERT INTO Departments (DepartmentName) VALUES (?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, departmentName);
        int rowsAffected = stmt.executeUpdate();

        System.out.println(rowsAffected + " row(s) inserted.");
    }
    
    private static void updateDepartment() throws SQLException {
        System.out.print("Enter department ID to update: ");
        int departmentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter new department name: ");
        String departmentName = scanner.nextLine();

        String query = "UPDATE Departments SET DepartmentName = ? WHERE DepartmentID = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, departmentName);
        stmt.setInt(2, departmentID);
        int rowsAffected = stmt.executeUpdate();

        System.out.println(rowsAffected + " row(s) updated.");
    }
    
    private static void deleteDepartment() throws SQLException {
        System.out.print("Enter department ID to delete: ");
        int departmentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String query = "DELETE FROM Departments WHERE DepartmentID = ?";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, departmentID);
        int rowsAffected = stmt.executeUpdate();

        System.out.println(rowsAffected + " row(s) deleted.");
    }
    
    private static void viewDepartments() throws SQLException {
        String query = "SELECT DepartmentID, DepartmentName FROM Departments";
        stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        System.out.println("Departments:");
        while (rs.next()) {
            int departmentID = rs.getInt("DepartmentID");
            String departmentName = rs.getString("DepartmentName");
            System.out.println("ID: " + departmentID + ", Name: " + departmentName);
        }
    }
    
    private static void manageProjects() throws SQLException {
        // Implementation for managing projects
    	int choice;
        do {
            System.out.println("\nProject Management");
            System.out.println("1. Add Project");
            System.out.println("2. Update Project");
            System.out.println("3. Delete Project");
            System.out.println("4. View Projects");
            System.out.println("5. Go Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addProject();
                    break;
                case 2:
                    updateProject();
                    break;
                case 3:
                    deleteProject();
                    break;
                case 4:
                    viewProjects();
                    break;
                case 5:
                    System.out.println("Going back to the main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
    private static void addProject() throws SQLException {
        System.out.print("Enter project name: ");
        String projectName = scanner.nextLine();
        System.out.print("Enter department ID: ");
        int departmentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String query = "INSERT INTO Projects (ProjectName, DepartmentID) VALUES (?, ?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, projectName);
        stmt.setInt(2, departmentID);
        int rowsAffected = stmt.executeUpdate();

        System.out.println(rowsAffected + " row(s) inserted.");
    }
    
    private static void updateProject() throws SQLException {
        System.out.print("Enter project ID to update: ");
        int projectID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter new project name: ");
        String projectName = scanner.nextLine();
        System.out.print("Enter new department ID: ");
        int departmentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String query = "UPDATE Projects SET ProjectName = ?, DepartmentID = ? WHERE ProjectID = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, projectName);
        stmt.setInt(2, departmentID);
        stmt.setInt(3, projectID);
        int rowsAffected = stmt.executeUpdate();

        System.out.println(rowsAffected + " row(s) updated.");
    }
    private static void deleteProject() throws SQLException {
        System.out.print("Enter project ID to delete: ");
        int projectID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String query = "DELETE FROM Projects WHERE ProjectID = ?";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, projectID);
        int rowsAffected = stmt.executeUpdate();

        System.out.println(rowsAffected + " row(s) deleted.");
    }
    
    private static void viewProjects() throws SQLException {
        String query = "SELECT ProjectID, ProjectName, DepartmentID FROM Projects";
        stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        System.out.println("Projects:");
        while (rs.next()) {
            int projectID = rs.getInt("ProjectID");
            String projectName = rs.getString("ProjectName");
            int departmentID = rs.getInt("DepartmentID");
            System.out.println("ID: " + projectID + ", Name: " + projectName + ", Department ID: " + departmentID);
        }
    }



    private static void manageTasks() throws SQLException {
        // Implementation for managing tasks
         int choice;
         do {
             System.out.println("\nTask Management");
             System.out.println("1. Add Task");
             System.out.println("2. Update Task");
             System.out.println("3. Delete Task");
             System.out.println("4. View Tasks");
             System.out.println("5. Go Back");
             System.out.print("Enter your choice: ");
             choice = scanner.nextInt();
             scanner.nextLine(); // Consume newline character

             switch (choice) {
                 case 1:
                     addTask();
                     break;
                 case 2:
                     updateTask();
                     break;
                 case 3:
                     deleteTask();
                     break;
                 case 4:
                     viewTasks();
                     break;
                 case 5:
                     System.out.println("Going back to the main menu...");
                     break;
                 default:
                     System.out.println("Invalid choice. Please try again.");
             }
         } while (choice != 5);
     }

     private static void addTask() throws SQLException {
         System.out.print("Enter task name: ");
         String taskName = scanner.nextLine();
         System.out.print("Enter project ID: ");
         int projectID = scanner.nextInt();
         scanner.nextLine(); // Consume newline character

         String query = "INSERT INTO Tasks (TaskName, ProjectID) VALUES (?, ?)";
         stmt = conn.prepareStatement(query);
         stmt.setString(1, taskName);
         stmt.setInt(2, projectID);
         int rowsAffected = stmt.executeUpdate();

         System.out.println(rowsAffected + " row(s) inserted.");
     }

     private static void updateTask() throws SQLException {
         System.out.print("Enter task ID to update: ");
         int taskID = scanner.nextInt();
         scanner.nextLine(); // Consume newline character

         System.out.print("Enter new task name: ");
         String taskName = scanner.nextLine();
         System.out.print("Enter new project ID: ");
         int projectID = scanner.nextInt();
         scanner.nextLine(); // Consume newline character

         String query = "UPDATE Tasks SET TaskName = ?, ProjectID = ? WHERE TaskID = ?";
         stmt = conn.prepareStatement(query);
         stmt.setString(1, taskName);
         stmt.setInt(2, projectID);
         stmt.setInt(3, taskID);
         int rowsAffected = stmt.executeUpdate();

         System.out.println(rowsAffected + " row(s) updated.");
     }

     private static void deleteTask() throws SQLException {
         System.out.print("Enter task ID to delete: ");
         int taskID = scanner.nextInt();
         scanner.nextLine(); // Consume newline character

         String query = "DELETE FROM Tasks WHERE TaskID = ?";
         stmt = conn.prepareStatement(query);
         stmt.setInt(1, taskID);
         int rowsAffected = stmt.executeUpdate();

         System.out.println(rowsAffected + " row(s) deleted.");
     }

     private static void viewTasks() throws SQLException {
         String query = "SELECT TaskID, TaskName, ProjectID FROM Tasks";
         stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery();

         System.out.println("Tasks:");
         while (rs.next()) {
             int taskID = rs.getInt("TaskID");
             String taskName = rs.getString("TaskName");
             int projectID = rs.getInt("ProjectID");
             System.out.println("ID: " + taskID + ", Name: " + taskName + ", Project ID: " + projectID);
         }
     }
}