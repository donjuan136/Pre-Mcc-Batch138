package premcc.batch138.juandaniel.barbershop;


import java.util.Scanner;

public class HairArtist extends User {

    private int h_id=1;
    private String h_name="Juan Daniel";

    public int getD_id() {
        return h_id;
    }

    public void setD_id(int h_id) {
        this.h_id = h_id;
    }

    public String getD_name() {
        return h_name;
    }

    public void setD_name(String h_name) {
        this.h_name = h_name;
    }

    public void Choice(){
        System.out.println("Enter your choice: \n1.CheckCustomer \n2.Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice){
            case 1:CheckCustomer1();
                break;
            case 2 : main(null);
                break;
        }
    }

    public void CheckCustomer1(){
        Customer C = new Customer();
        String p_name =C.getP_name();
        int p_id = C.getP_id();
        System.out.println("HairArtis: "+h_name+" has check customer  "+p_name);
        System.out.println("With Services Bleaching Hair & Curly already done!");
    }

}