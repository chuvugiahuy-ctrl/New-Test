package Test;
import java.util.Scanner;
public class Mainthread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computer c1 = new Computer();
        //1
        System.out.print("Nhap ID: ");
        int number = sc.nextInt();
        c1.setNumber(number);
        sc.nextLine();
        //2
        System.out.print("Nhap nha san xuat: ");
        String manufacturer = sc.nextLine();
        c1.setManufacturer(manufacturer);
        //3
        System.out.print("Nhap nam san xuat: ");
        int year = sc.nextInt();
        c1.setYear(year);
        //4
        System.out.print("Nhap gia tien: ");
        double price = sc.nextDouble();
        c1.setPrice(price);
        System.out.println("\nThong tin may tinh:");
        System.out.println("ID: " + c1.getNumber());
        System.out.println("Nha san xuat: " + c1.getManufacturer());
        System.out.println("Nam san xuat: " + c1.getYear());
        System.out.println("Gia tien: " + c1.getPrice());

        sc.close();
    }
}
