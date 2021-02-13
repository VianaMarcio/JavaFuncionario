package entities;

public class Funcionario {

    public String name;
    public double grossSalary;
    public double tax;
    public double increaseSalary;

    public double NetSalary() {
        return grossSalary - tax;
    }
    public double IncreaseSalary(){
        return grossSalary + (grossSalary * (increaseSalary/100)) - tax;
    }
}
