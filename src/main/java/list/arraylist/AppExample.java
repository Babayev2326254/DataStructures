package list.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class AppExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedList<Listexample> linkedList = new LinkedList<>();
        ArrayList<Listexample> arrayList = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Şirkət İşçi İdarəetmə Sistemi ---");
            System.out.println("1. İşçi əlavə et");
            System.out.println("2. İşçi sil");
            System.out.println("3. İşçi yenilə");
            System.out.println("4. İşçiləri çap et");
            System.out.println("5. Çıxış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Listexample person = new Listexample(scanner.nextInt(), scanner.next(), scanner.next());
                    arrayList.add(person);
                    break;
                //linkedList.add(person);
                case 2:
                    int a = scanner.nextInt();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i).getId() == a) {
                            arrayList.remove(i);
                        }
                    }
                    break;
                case 3:
                    int b = scanner.nextInt();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i).getId() == b) {
                            System.out.println("""
                                    1.Adini deyis 
                                    2. Position deyis""");
                            int choises = scanner.nextInt();
                            switch (choises) {
                                case 1:
                                    System.out.println("Yeni adi daxil et");
                                    arrayList.get(i).setName(scanner.next());
                                    break;
                                case 2:
                                    System.out.println("yeni positionu daxil et");
                                    arrayList.get(i).setPosition(scanner.next());
                                    break;

                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println(arrayList);
                    break;
                default:
                    System.out.println("Yeniden sina");

            }
        }
    }
}
