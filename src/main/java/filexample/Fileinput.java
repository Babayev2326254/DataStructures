package filexample;

import java.io.IOException;
import java.util.Scanner;

public class Fileinput {
    public static void main(String[] args) throws IOException {
        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Fayl İdarəetmə Sistemi");
            System.out.println("1. Fayl əlavə et");
            System.out.println("2. Fayl sil");
            System.out.println("3. Bütün faylların adını gör");
            System.out.println("4. Fayl seç və mətn yaz");
            System.out.println("5. Çıxış");
            System.out.print("Seçiminizi daxil edin: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Yeni sətir əlavə etmək üçün

            switch (choice) {
                case 1:
                    fileManager.addFile();
                    break;
                case 2:
                    fileManager.deleteFile();
                    break;
                case 3:
                    fileManager.listFiles();
                    break;
                case 4:
                    fileManager.writeToFile();
                    break;
                case 5:
                    System.out.println("Sistemdən çıxılır...");
                    return; // Proqramı bitir
                default:
                    System.out.println("Yanlış seçim! Zəhmət olmasa 1-5 aralığında rəqəm daxil edin.");
            }

            System.out.println(); // Boş sətir əlavə etmək üçün
        }
    }
}