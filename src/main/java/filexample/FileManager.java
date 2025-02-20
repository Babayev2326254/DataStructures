package filexample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class  FileManager {

    private final Scanner scanner = new Scanner(System.in);

    public void addFile() {
        System.out.println("------------------------");
        System.out.println("Əlavə edəcəyiniz faylın adını yazın:");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("Fayl yaradıldı: " + file);
            } else {
                System.out.println("Bu fayl artıq mövcuddur.");
            }
        } catch (IOException e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
        }
    }

    public void deleteFile() {
        System.out.println("Silmək istədiyiniz faylın adını yazın:");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("""
                    Fayl mövcuddur. Silmək istəyirsiniz?
                    1. Sil
                    2. Çıxış""");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                if (file.delete()) {
                    System.out.println("Fayl silindi.");
                } else {
                    System.out.println("Fayl silinə bilmədi.");
                }
            }
        } else {
            System.out.println("Bu fayl mövcud deyil.");
        }
    }

    public void listFiles() {
        String folderPath = "D:\\Fx-fx\\javacom\\DataStructures";
        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null && files.length > 0) {
                System.out.println(folderPath + " qovluğundakı fayllar:");
                for (File file : files) {
                    System.out.println("Fayl adı: " + file.getName() + ", Fayl ölçüsü: " + file.length() + " bytes");
                }
            } else {
                System.out.println("Qovluqda heç bir fayl yoxdur.");
            }
        } else {
            System.out.println("Göstərilən yol mövcud deyil və ya qovluq deyil.");
        }
    }

    public void writeToFile() throws IOException {
        while (true) {
            System.out.println("""
                    1. Mövcud fayla yazmaq istəyirəm
                    2. Yeni fayl əlavə edib yazmaq istəyirəm""");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    writeToExistingFile();
                    break;
                case 2:
                    createAndWriteToNewFile();
                    break;
                default:
                    System.out.println("Yanlış seçim! Zəhmət olmasa düzgün rəqəm daxil edin.");
            }

            System.out.println("Əlavə əməliyyat etmək istəyirsinizmi? (y/n)");
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    private void writeToExistingFile() {
        System.out.println("Mövcud faylın adını daxil edin:");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.exists()) {
            try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                System.out.println("Yazmaq istədiyiniz mətni daxil edin:");
                String content = scanner.nextLine();
                fileWriter.write(content + "\n");
                System.out.println("Məlumat fayla əlavə olundu.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Fayl tapılmadı!");
        }
    }

    private void createAndWriteToNewFile() {
        System.out.println("Yeni faylın adını daxil edin:");
        String newFileName = scanner.nextLine();

        try (FileWriter writer = new FileWriter(newFileName)) {
            System.out.println("Fayla yazmaq istədiyiniz mətni daxil edin:");
            String newContent = scanner.nextLine();
            writer.write(newContent + "\n");
            System.out.println("Məlumat fayla yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}