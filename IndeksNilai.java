import java.util.Scanner;

public class IndeksNilai {
    public static void main(String[] args) throws Exception {
        Double nilai;
        String indeksNilai;

        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai");
        nilai = masukan.nextDouble();

        if (nilai >= 75) {
            indeksNilai = "A";
        }else if (nilai >= 65) {
            indeksNilai = "B";
        }else if (nilai >= 55) {
            indeksNilai = "C";
        }else {
            indeksNilai = "E";
        }

        System.out.println("Indeks Nilai: " + indeksNilai);
        masukan.close();
    }
    
}
