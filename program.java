package entities;

import entities.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Entre com o nome do funcionario, o salario bruto e a taxa de imposto: ");
        funcionario.name = sc.nextLine();
        funcionario.grossSalary = sc.nextDouble();
        funcionario.tax = sc.nextDouble();
        System.out.println(" ");
        System.out.println("Employee: " + funcionario.name + ", $ " + funcionario.NetSalary());
        System.out.println(" ");
        System.out.println("Which percentage to increase salary? ");
        funcionario.increaseSalary = sc.nextDouble();
        System.out.println(" ");
        System.out.println("Updated data: " + funcionario.name + ", $ " + funcionario.IncreaseSalary());




        sc.close();
    }
}
