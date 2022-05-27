package Lesson_3;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone, salary, age);
    }

    public void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Employee[] Enterprise = new Employee[5];
        Enterprise[0] = new Employee("Ivanov Ivan", "Sales Representative", "ivanov@mailbox.com", "380503456783", 30000, 33);
        Enterprise[1] = new Employee("Sidorov Sidor", "Finance analyst", "sidirov@mailbox.com", "380685678999", 50000, 27);
        Enterprise[2] = new Employee("Petrova Anna", "Front-end developer", "petrova@mailbox.com", "380509955666", 40000, 47);
        Enterprise[3] = new Employee("Pavlenko Petr", "Full-stack developer", "pavlenko@mailbox.com", "380678976321", 50000, 29);
        Enterprise[4] = new Employee("Filipova Marta", "Architect", "filipova@mailbox.com", "380992131456", 60000, 45);

        for (int i = 0; i < Enterprise.length; i++)
            if (Enterprise[i].age > 40) {
                Enterprise[i].print();
            }
    }
}

