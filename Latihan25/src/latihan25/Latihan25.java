/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan25;
import java.util.Scanner;
public class Latihan25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta user untuk memasukkan nama
        System.out.println("Masukkan nama depan anda untuk di eja : ");
        String nama = scanner.nextLine();

        // Eja nama user
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + nama.charAt(i));
        }
    }
}
  
    

