package cw1;

import java.util.Scanner;

class CompanyApp {
     private static final int ADD_EMPLOYEE = 0;
     private static final int FIND_EMPLOYEE = 1;
     private static final int EXIT = 2;

     private static Scanner sc = new Scanner(System.in);

     public static void main(String[] args) {
         Company company = new Company();
         int userOption;
         do {
             printOptions();
             System.out.println("Wybierz opcję:");
             userOption = sc.nextInt();
             sc.nextLine();

             switch (userOption){
                 case ADD_EMPLOYEE:
                     Employee employee = readAndCreateEmploye();
                     company.addEmployee(employee);
                     break;
                 case FIND_EMPLOYEE:
                     findEmployee(company);
                     break;
                 case EXIT:
                     System.out.println("Do zobaczenia  ");

             }


         } while (userOption != EXIT);
     }

    private static void findEmployee(Company company) {
        System.out.println("Podaj imię: ");
        String firstName = sc.nextLine();

        System.out.println("Podaj nazwisko: ");
        String lastName = sc.nextLine();

        Employee employee = company.getEmployee(firstName, lastName );
        if (employee == null)
            System.out.println("Brak takiego pracownika");
        else
            System.out.println(employee);
    }

    private static Employee readAndCreateEmploye() {
        System.out.println("Podaj imię: ");
        String firstName = sc.nextLine();

        System.out.println("Podaj nazwisko: ");
        String lastName = sc.nextLine();

        System.out.println("Podaj wypłatę: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        return new Employee(firstName, lastName, salary);
    }


    private static void printOptions() {
        System.out.println(ADD_EMPLOYEE + " - Dodanie pracownika");
        System.out.println(FIND_EMPLOYEE + " - Wyszukiwanie pracownika");
        System.out.println(EXIT + " - Wyjście");
    }
}
