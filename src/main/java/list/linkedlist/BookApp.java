package list.linkedlist;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BookMethod bookMethod = new BookMethod();
        while (true) {
            System.out.println("Kitabxana BBF");
            System.out.println("""
                    1.Kiatb əlavə et
                    2.Kitab silmə
                    3.Kitab axtar
                    4.Kitab sayını göstər
                    5.Kitab siyahılarını çıxart
                    """);
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    bookMethod.bookadd();
                    break;
                case 2:
                    System.out.println("""
                            1.Ada görə silmə
                            2.İd yə görə silmə""");
                    int a = scanner.nextInt();
                    switch (a) {
                        case 1:
                            bookMethod.booksdeletename();
                            break;
                        case 2:
                            bookMethod.booksdeleteid();
                            break;
                        default:
                            System.out.println("Secdiyiniz secim yoxdur");
                    }
                    break;
                case 3:
                    bookMethod.bookfindname();
                    break;
                case 4:
                    bookMethod.bookcount();
                    break;
                case 5:
                    bookMethod.bookallview();
                default:
                    System.out.println("Secdiyiniz secim yalnisdir");

            }
        }
    }
}
