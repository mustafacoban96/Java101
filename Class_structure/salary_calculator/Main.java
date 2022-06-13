import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int salary, workHour, hireYear;

        Scanner input = new Scanner(System.in);
        System.out.print("Adı: ");
        name = input.nextLine();
        System.out.print("Maaş: ");
        salary = input.nextInt();
        System.out.print("Haftalık calısma saati: ");
        workHour = input.nextInt();
        System.out.print("Başlangic yılı: ");
        hireYear = input.nextInt();

        Employee employee1= new Employee(name,salary,workHour,hireYear);

        System.out.println("Vergi: " + employee1.tax());
        System.out.println("Bonus " + employee1.fbonus());
        System.out.println("Maaş artışı " + employee1.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (employee1.getSalary()+ employee1.fbonus()- employee1.tax()));
        System.out.println("Toplam maaş: " + (employee1.raiseSalary()+employee1.getSalary()));


    }
}