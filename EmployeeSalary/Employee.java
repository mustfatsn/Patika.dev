package EmployeeSalary;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        double taxCalculation = 0.0;
        if (this.salary > 1000){
            taxCalculation = this.salary * 0.03;
        }else {
            taxCalculation = 0;
        }
        return taxCalculation;
    }
    double bonus(){
        int overtimePay = 0;
        if (this.workHours > 40){
            overtimePay = (this.workHours - 40) * 30;
        }
        return overtimePay;
    }
    double raiseSalary(){
        int currentYear = 2021;
        double raise = 0;
        if (currentYear - this.hireYear < 10){
            raise = this.salary * 0.05;
        }
        if (currentYear - this.hireYear > 9 && currentYear - this.hireYear < 20){
            raise = this.salary * 0.10;
        }
        if (currentYear - this.hireYear > 19){
            raise = this.salary * 0.15;
        }
            return raise;
    }
    void toStringg(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş: " + ((this.salary + bonus() - tax()) + raiseSalary()));
    }
}
