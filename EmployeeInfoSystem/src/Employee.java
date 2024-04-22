public class Employee {

    String fullName;
    double salary;
    int weeklyWorkingHours;
    int hireYear;

    Employee(String fullName, double salary, int weeklyWorkingHours, int hireYear) {
        this.fullName = fullName;
        this.salary = salary;
        this.weeklyWorkingHours = weeklyWorkingHours;
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Name: " + this.fullName + "\n" +
                "Salary: " + salary + "\n" +
                "Weekly Total Working Hours: " + this.weeklyWorkingHours + "\n" +
                "Hire Year: " + this.hireYear + "\n" +
                "Tax: " + this.tax() + "\n" +
                "Bonus: " + this.bonus() +"\n" +
                "Raise: " + this.raise() +"\n" +
                "Salary with taxes and bonus: " + (salary + this.bonus() - this.tax()) +"\n" +
                "Total salary: " + (salary + this.bonus() - this.tax()+this.raise());
    }

    double tax() {
        double tax;
        if (this.salary >= 1000) {
            tax = (this.salary * 3) / 100;
        } else {
            tax = 0.0;
        }
        return tax;
    }

    double bonus() {
        double bonus;
        if (this.weeklyWorkingHours > 40) {
            bonus = (this.weeklyWorkingHours - 40) * 30;
        } else {
            bonus = 0.0;
        }
        return bonus;
    }

    double raise() {
        double raise;
        int workingYear = 2021 - this.hireYear;
        if (workingYear < 10) {
            raise = (this.salary * 5) / 100;
        } else if (workingYear < 20 && workingYear > 9) {
            raise = (this.salary * 10) / 100;
        } else {
            raise = (this.salary * 15) / 100;
        }
        return raise;
    }


}
