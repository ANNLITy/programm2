public class Employee {
    private final String fio;
    private int department;
    private int salary;
    public int id;
    public static Integer idCounter = 1;

    public Employee(String fio,int salary, int department) {
        this.id=idCounter++;
        this.fio= fio;
        this.salary=salary;
        this.department=department;
    }

    public String getfio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Integer getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(Integer idCounter) {
        Employee.idCounter = idCounter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Fio=" + fio +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
