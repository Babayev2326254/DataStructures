package filexample;

import java.io.IOException;
import java.util.Scanner;


public class Fileinput {
    public static void main(String[] args) throws IOException {

        Filemethod filemethod = new Filemethod();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Fayl idarəetmə Sistemi");
            System.out.println(" 1.Fayl əlavə et\n" +
                               " 2.Fayl sil\n" +
                               " 3.Bütün Fayllarin adını gör\n" +
                               " 4.Fayl sec ve metn yaz                                          \n" +
                               " ");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    filemethod.fileadd();
                    break;
                case 2:
                    filemethod.filedelete();
                    break;
                case 3:
                    filemethod.fileall();
                    break;
                case 4:
                    filemethod.filewriter();
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                default:
                    System.out.println("Again");
            }
        }

    }
}
