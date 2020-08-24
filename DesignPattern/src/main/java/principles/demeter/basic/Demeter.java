package principles.demeter.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mlx
 */
public class Demeter {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployees(new CollegeManager());
    }

}

/**
 * Employee in school HQ
 */
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 *
 */
class CollegeManager {
    public List<CollegeEmployee> getAllEmployees() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("Employee id: " + i);
            list.add(employee);
        }
        return list;
    }
}

/**
 * SchoolManager's direct friends: Employee, CollegeManager
 *                 indirect friend: CollegeEmployee
 */
class SchoolManager {
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("HQ employee id: " + i);
            list.add(employee);
        }
        return list;
    }

    // this method print school hq and college employees' ids

    void printAllEmployees(CollegeManager manager) {
        /**
         * 1. CollegeEmployee is not SchoolManager's direct friend
         * 2. CollegeEmployee is local variable in SchoolManager
         * 3. Disobey Demeter principle
         */
        List<CollegeEmployee> list1 = manager.getAllEmployees();
        System.out.println("========= College Employees =========");
        for (CollegeEmployee e: list1) {
            System.out.println(e.getId());
        }
        List<Employee> list2 = this.getAllEmployees();
        System.out.println("========= College Employees =========");
        for (Employee e: list2) {
            System.out.println(e.getId());
        }
    }
}