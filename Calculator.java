import java.util.Scanner;

public class Calculator {
     public static int tambah(int a, int b){
          return a + b;
     } 
     public static int kurang(int a, int b){
          return a - b;
     }
     public static int kali(int a, int b){
          return a*b;
     } 
     public int bagi(int a, int b){
          if (b == 0);{
               throw new ArithmeticException("tidak bisa di bagi dengan nol");
          }
     }
     
     public String Sederhana(int pembilang, int penyebut){
          int faktorPersekutuan = faktorPersekutuanTerkecil(pembilang, penyebut);
          pembilang /= faktorPersekutuan;
          penyebut /= faktorPersekutuan;
          return pembilang +"/" + penyebut;
     }

          private int faktorPersekutuanTerkecil (int a, int b){
          int temp;
          while (b != 0) {
               temp = b;
               b = a % b;
               a = temp;
          }
          return a;
     }

     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          Calculator kalkulator = new Calculator();

          System.out.print("masukkan bilangan pertama:");
          int angka1 = input.nextInt();

          System.out.print("masukkan bilangan ke dua:");
          int angka2 = input.nextInt();

          System.out.println("Hasil penjumlahan: "+tambah(angka1, angka2));
          System.out.println("Hasil Pengurangan: "+kurang(angka1, angka2));
          System.out.println("Hasil perkalian: "+ kali(angka1, angka2));
          System.out.println("Hasil pembagian: "+ kalkulator.bagi(angka1, angka2));

          System.out.print("masukkan pembilang:");
          int pembilang = input.nextInt();

          System.out.print("masukkan penyebut:");
          int penyebut = input.nextInt();

          System.out.println("pecahkan yang telah disederhanakan:"+ kalkulator.Sederhana(pembilang, penyebut));
          
          input.close();
     }
}



