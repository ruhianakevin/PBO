import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

    private String[] MyTas = {"Backpack","Waistbag"};
    public List <Tas> jenisTas1 = new ArrayList<Tas>();
    public List <Tas> jenisTas2 = new ArrayList<Tas>();

    public static void main(String[] args) {

        System.out.println("===================================================");
        System.out.println("\t\tJenis - jenis Tas");
        System.out.println("===================================================");

        Scanner myObj = new Scanner(System.in);
        Main m = new Main();

        System.out.println("\nPilihlah angka untuk melanjutkan");
        System.out.println("1. Menambahkan jenis tas baru");
        System.out.println("2. Melihat jenis tas");
        System.out.print("\nPilih angka : ");

        String input = myObj.nextLine();
        int code = Integer.parseInt(input);
        System.out.println("===================================================");

        switch (code) {
            case 1:
                m.InputListTas();
                break;
            case 2:
                m.ShowListTas();
                break;

            default:
                System.out.println("Pilihan tidak terdaftar");
                break;
        }

    }

    public void InputListTas(){

        System.out.println("\n---------------------------------------------------");
        System.out.println("\t\tMenambahkan tas");
        System.out.println("---------------------------------------------------\n");
        System.out.println("Pilih jenis tas : ");

        int i=1;
        for (String tas : MyTas){
            System.out.println(i + "." + tas);
            i++;
        }

        System.out.print("Masukkan pilihan : ");
        Scanner myObj = new Scanner(System.in);

        String inputProduct = myObj.nextLine();
        int product = Integer.parseInt(inputProduct);

        switch (product) {
            case 1:
                try {
                    jenisTas1 =  InputTasBackpack();
                } catch (Exception e) {
                    System.out.println("Masukkan data yang valid");
                    System.out.println("Error: "+e.getMessage());
                }
                break;

            case 2:
                try {
                    jenisTas2 =  InputTasWeistbag();
                } catch (Exception e) {
                    System.out.println("Masukkan data yang valid");
                    System.out.println("Error: "+e.getMessage());
                }
                break;

            default:
                break;

        }

        myObj.close();

    }

    public List InputTasBackpack() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("\n============= Jenis tas baru =============");
        
        int jmlData = 2;
        for (int i = 0; i < jmlData; i++) {
            Tas t = new Tas();
            System.out.println("- Jenis ke-" + (i+1) + ":");

            System.out.print("Merk = ");
            String merk = myObj.nextLine();
            t.setMerk(merk);

            System.out.print("Ukuran Tas = ");
            String ukuran = myObj.nextLine();
            t.setUkuran(ukuran);

            System.out.println("----------------------------------------------");
            this.jenisTas1.add(t);
        }

        System.out.println("\n");
        myObj.close();
        return this.jenisTas1;

    }

    public List InputTasWeistbag(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("\n============= Jenis tas baru =============");
        
        int jmlData2 = 2;
        for (int i = 0; i < jmlData2; i++) {
            Tas t2 = new Tas();
            System.out.println("- Jenis ke-" + (i+1) + ":");

            System.out.print("Merk = ");
            String merk = myObj.nextLine();
            t2.setMerk(merk);

            System.out.print("Ukuran tas = ");
            String ukuran = myObj.nextLine();
            t2.setUkuran(ukuran);

            System.out.println("----------------------------------------------");
            this.jenisTas2.add(t2);
       

        }
        System.out.println("\n");
        myObj.close();
        return this.jenisTas2;

    }

    public void ShowListTas(){

        for (String x : MyTas) {
            System.out.println("Tas yang sudah ada yaitu : "+ x);
        }

    }
}