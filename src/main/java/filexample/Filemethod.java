package filexample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filemethod {
    Scanner scanner = new Scanner(System.in);

    public void fileadd() {
        System.out.println("Elave edeceyin file adini yazin ?");
        String name = scanner.nextLine();
        File file = new File(name);

        try {
            if (file.createNewFile()) {
                System.out.println("Fayl yaradildi" + file);
            } else {
                System.out.println("bu fayl var");
            }
        } catch (IOException e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
        }
    }


    public void filedelete() {
        System.out.println("Silmek istediyiniz file adini yazin?");
        String name = scanner.nextLine();
        File file = new File(name);

        if (file.exists()) {
            while (true) {
                System.out.println("""
                        Fayl movcuddur silmek istiyirsiz 
                        1.sil
                        2.çıxış elə""");
                int choise = scanner.nextInt();
                switch (choise) {
                    case 1:
                        if (file.delete()) {
                            System.out.println("Silindi");
                            break;
                        } else {
                            System.out.println("siline bilinmedi");
                        }
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Yalnis secim");
                }
                break;
            }
        } else {
            System.out.println("bu fayl yoxdur");
        }
    }

    public void fileall() {
        //Streamnen olan forma
//        String folderPath = "D:\\Fx-fx\\javacom\\DataStructures";
//        try (Stream<Path> paths = Files.walk(Paths.get(folderPath))) {
//            paths.filter(Files::isRegularFile)
//                    .forEach(System.out::println);
//
//        } catch (IOException e) {
//            System.out.println("Xəta baş verdi: " + e.getMessage());
//        }
//    }


        String folderPath = "D:\\Fx-fx\\javacom\\DataStructures";

        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null) {
                System.out.println(folderPath + " içindəki fayllar:");
                for (File file : files) {
                    System.out.println("Faylin adi   " + file.getName() + "  " + "Faylin uzunlugu  " + file.length());
                }
            } else {
                System.out.println("Qovluqda heç bir fayl yoxdur.");
            }
        } else {
            System.out.println("Göstərilən yol mövcud deyil və ya qovluq deyil.");
        }
    }


    public void filewriter() throws IOException {
        while (true) {
            System.out.println("1. Mövcud fayla yazmaq istəyirəm\n" +
                               "2. Yeni fayl əlavə edib yazacam");
            int choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 1:
                    System.out.println("Axtaracağınız faylın adını qeyd edin");
                    String name = scanner.nextLine();
                    File file = new File(name);

                    try {
                        if (file.exists()) {
                            System.out.println("Fayl tapıldı");
                            FileWriter fileWriter = new FileWriter(name, true);
                            System.out.println("Yazmaq istədiyiniz mətn daxil edin");
                            String content = scanner.nextLine();
                            fileWriter.write(content);
                            fileWriter.close();
                            System.out.println("Məlumat fayla əlavə olundu.");
                        } else {
                            System.out.println("Fayl tapılmadı!");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Yeni faylın adını daxil edin");
                        String newFileName = scanner.nextLine();
                        FileWriter writer = new FileWriter(newFileName);
                        System.out.println("Fayla mətn daxil edin");
                        String newContent = scanner.nextLine();
                        writer.write(newContent);
                        writer.close();
                        System.out.println("Məlumat fayla yazıldı.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                default:
                    System.out.println("Düzgün rəqəm daxil edin");
                    break;
            }

            System.out.println("Əlavə əməliyyat etmək istəyirsinizmi? (y/n)");
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}

