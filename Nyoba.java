import java.util.Scanner;
public class Nyoba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] penonton = new String [4][2];
        String nama, next, menu;
        int baris, kolom;

        while (true) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan Anda: ");
            menu = input.nextLine();
            
            if(menu.equals("1")){
                for (int i = 0; i < penonton.length; i++) {
                
                    System.out.print("Masukkan nama :");
                    nama = input.nextLine();
                    System.out.print("Masukkan baris:");
                    baris = input.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = input.nextInt();
                    input.nextLine();
                    
                    penonton[baris-1][kolom-1] = nama;
                    
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = input.nextLine();
                    
                    if (next.equalsIgnoreCase("n")){
                        break;
                    }
                }

            } else if(menu.equals("2")){
                System.out.println("\n==== DAFTAR PENONTON ====");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print(penonton[i][j] + "\t");
                    }
                    System.out.println();
                }

            } else if(menu.equals("3")){
                System.out.println("Terima kasih, selamat tinggal!");
                break;
            }
        }

        input.close();
    }
}
    

