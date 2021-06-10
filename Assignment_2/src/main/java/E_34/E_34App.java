/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_34;
import java.util.ArrayList;
import java.util.Scanner;

public class E_34App {
    public static final Scanner reader = new Scanner(System.in);
    public static ArrayList<String> employeeNames = new ArrayList<>();
    public static void main(String[] args) {

        fillInEmployees();

        displayEmployees();
        System.out.print("Enter employee name to terminate: ");
        terminateEmployee(reader.nextLine());

        displayEmployees();
    }

    public static void fillInEmployees(){
        employeeNames.add("Mike Oxlong");
        employeeNames.add("Joe Momma");
        employeeNames.add("Yuri Dopted");
        employeeNames.add("Jack Goff");
        employeeNames.add("Ben Dover");

    }


    public static void displayEmployees(){
        System.out.println("There are " + employeeNames.size() + " Employees");

        for(int i = 0 ; i < employeeNames.size(); i++){
            System.out.println(employeeNames.get(i));
        }
    }

    public static void terminateEmployee(String employee){
        employeeNames.remove(employee);
    }
}
