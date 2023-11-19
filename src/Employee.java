public class Employee {
    public String FIO;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Employee(String FIO, String position, String email, String phone, int salary, int age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.println("Data: " + FIO + ", position: " + position + ", email: " + email + ", phone: " + phone +
                ", salary: " + salary + ", age: " + age);
    }
    public static void main(String[] args){
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee
                ("Anna", "hairdresser", "anna@mail.com", "+678904", 7908, 25);
        emplArray[1] = new Employee
                ("Alex", "cook", "alex@mail.com", "+5783985" , 6758, 18);
        emplArray[2] = new Employee
                ("Sabina", "cosmetologist", "sabina@mail.com", "+567387", 434, 24);
        emplArray[3] = new Employee
                ("Daemon", "winemaker", "daemon@mail.com","+674887", 5678, 56);
        emplArray[4] = new Employee
                ("Sebastian", "teacher", "sebastian@mail.com","+67445", 1456,43 );

        for (Employee employee : emplArray)
            if (employee.age > 40) employee.info();
    }
}
