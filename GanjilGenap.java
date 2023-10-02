import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan Angka: ");
        int angka = masukan.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }

        masukan.close();
    }
    
}
