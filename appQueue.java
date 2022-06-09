package pkgQueue;
import java.util.Scanner;
public class appQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        cQueue antrean = new cQueue();
        int pilih = 0;
        do {
            System.out.println("Aplikasi Antrean");
            System.out.println("1. Masuk");
            System.out.println("2. Keluar");
            System.out.println("3. Lihat");
            System.out.println("4. Exit");
            System.out.print("pilih > ");
            pilih = scan.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Nama barang > ");
                    String barang = scan.next();
                    cNode baru = new cNode(barang);
                    antrean.enqueue(baru);
                    break;
                case 2:
                    cNode keluar = antrean.dequeue();
                    if (keluar != null) {
                        System.out.println(keluar.getBarang()+" keluar");
                    }
                    break;
                case 3:
                    antrean.viewQueue();
                    break;
                case 4:
                    System.out.println("PROGRAM STOPPED");
                    break;
            }
        } while (pilih != 4);
    }
}
