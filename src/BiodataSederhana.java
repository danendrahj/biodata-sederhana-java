import java.util.ArrayList;
import java.util.Scanner;

class Person {
    String firstName;
    String tanggalLahir;
    String jenisKelamin;
    String alamat;
    String nomorTelepon;
    String email;
    String pendidikan;
    String pekerjaan;
    String hobi;
    String keterampilan;
    String statusPernikahan;

    public Person(String firstName, String tanggalLahir, String jenisKelamin, String alamat, String nomorTelepon, String email, String pendidikan, String pekerjaan, String hobi, String keterampilan, String statusPernikahan) {
        this.firstName = firstName;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.pendidikan = pendidikan;
        this.pekerjaan = pekerjaan;
        this.hobi = hobi;
        this.keterampilan = keterampilan;
        this.statusPernikahan = statusPernikahan;
    }

    public void displayBiodata() {
        System.out.println("\nBiodata:");
        System.out.println("Nama Lengkap: " + firstName);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Email: " + email);
        System.out.println("Pendidikan: " + pendidikan);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Hobi: " + hobi);
        System.out.println("Keterampilan: " + keterampilan);
        System.out.println("Status Pernikahan: " + statusPernikahan);
    }
}

public class BiodataSederhana {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Person> people = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Biodata");
            System.out.println("2. Tampilkan Semua Biodata");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addBiodata();
                    break;
                case 2:
                    showAllBiodata();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }

    public static void addBiodata() {
        System.out.print("Nama Lengkap Anda : ");
        String firstName = scanner.nextLine();

        System.out.print("Tanggal Lahir : ");
        String tanggalLahir = scanner.nextLine();

        System.out.print("Jenis Kelamin : ");
        String jenisKelamin = scanner.nextLine();

        System.out.print("Alamat : ");
        String alamat = scanner.nextLine();

        System.out.print("Nomor Telepon : ");
        String nomorTelepon = scanner.nextLine();

        System.out.print("Email : ");
        String email = scanner.nextLine();

        System.out.print("Pendidikan : ");
        String pendidikan = scanner.nextLine();

        System.out.print("Pekerjaan : ");
        String pekerjaan = scanner.nextLine();

        System.out.print("Hobi : ");
        String hobi = scanner.nextLine();

        System.out.print("Keterampilan : ");
        String keterampilan = scanner.nextLine();

        System.out.print("Status Pernikahan : ");
        String statusPernikahan = scanner.nextLine();

        Person person = new Person(firstName, tanggalLahir, jenisKelamin, alamat, nomorTelepon, email, pendidikan, pekerjaan, hobi, keterampilan, statusPernikahan);
        people.add(person);

        System.out.println("Biodata berhasil ditambahkan!");
    }

    public static void showAllBiodata() {
        if (people.isEmpty()) {
            System.out.println("Belum ada biodata yang ditambahkan.");
        } else {
            for (Person person : people) {
                person.displayBiodata();
            }
        }
    }
}
