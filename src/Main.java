public class Main {
    public static void main(String[] args) {
        printEmployees();
        calculateTotalSalary();
        findEmployeeWithMinSalary();
        findEmployeeWithMaxSalary();
        calculateAverageSalary();
        printFullNames();
    }

    public static final Employee[] employees = {
            new Employee("Артёмов Артём Артёмович", 10000, 1),
            new Employee("Богданов Богдан Богданович", 11000, 2),
            new Employee("Васильев Василий Васильевич", 12000, 3),
            new Employee("Григорьев Григорий Григорьевич", 13000, 4),
            new Employee("Денисов Денис Денисович", 14000, 5),
            new Employee("Егоров Егор Егорович", 15000, 1),
            new Employee("Игорев Игорь Игоревич", 16000, 2),
            new Employee("Романов Роман Романович", 17000, 3),
            new Employee("Евгеньев Евгений Евгеньевич", 18000, 4),
            new Employee("Леонидов Леонид Леонидович", 19000, 5)
    };

    public static int printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        return 0;
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }


    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) ;
            minSalary = employee.getSalary();
            result = employee;
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) ;
            maxSalary = employee.getSalary();
            result = employee;
        }
        return result;
    }
    public static float calculateAverageSalary(){
        return calculateTotalSalary()/(float) employees.length;
    }
    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getfio());
        }
    }
}

