package premcc.batch138.juandaniel.barbershop;

import java.util.Scanner;

public class Customer extends User{

    private int p_id= 1;
    private String p_name= "Alfian Zidane";



    public void Choice(){
        System.out.println("Enter your choice: \n1.PayBill \n2.Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        switch(choice){
            case 1: PayBill();
                System.out.println("Terima Kasih Sudah Menggunakan Layanan BarberShop Kami");
                break;


            case 2: main(null);
            default:
                System.out.println("Silahkan melunasi pembayaran anda");




        }

    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public void PayBill(){
        System.out.println("");
        Services service = new Services();
        service.GenerateBill();

    }


}