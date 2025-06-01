import java.util.Scanner;

public class item {

    public static void main(String[] args) {
        Queue itemQueue = new Queue();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Program Antrian Barang");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Masukkan Barang Baru ke Antrian");
            System.out.println("2. Tampilkan Daftar Antrian");
            System.out.println("3. Proses Barang dari Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Masukkan nama barang: ");
                        String newItem = scanner.nextLine();
                        itemQueue.enqueue(newItem);
                        break;
                    case 2:
                        itemQueue.display();
                        break;
                    case 3:
                        String processedItem = itemQueue.dequeue();
                        if (processedItem != null) {
                            System.out.println("Memproses barang: '" + processedItem + "'");
                            System.out.println("'" + processedItem + "' telah dihapus dari antrian.");
                        } else {
                            System.out.println("Antrian kosong. Tidak ada barang untuk diproses.");
                        }
                        break;
                    case 0:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                choice = -1;
            }

        } while (choice != 0);

        scanner.close();
    }
}
