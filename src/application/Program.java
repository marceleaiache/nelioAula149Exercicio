package application;

import entities.Department;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entites.enums.*;
import entities.Worker;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String workerName = sc.nextLine();

        System.out.println("Level: ");
        String workerLevel = sc.nextLine();

        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();

        //INSTANCIANDO UM NOVO OBJETO DO TIPO WORKER e -> associando a um outro objeto do tipo departamento
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
                new Department(departmentName));

        System.out.println("How many contracts to this worker?");
        int numberOfContracts = sc.nextInt();
        sc.nextLine();

        for(int i=1; i<numberOfContracts; i++) {
            System.out.printf("Enter contract #.%d data: %n", i+1);
            System.out.printf("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        System.out.println("Name: ");
        System.out.println("Departement: " + Department.get.Name);
        System.out.println("Income for : ");



        System.out.println();

        sc.close();
    }
}
