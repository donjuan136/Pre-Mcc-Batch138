package premcc.batch138.juandaniel.barbershop;

import java.util.Scanner;

public class Services extends Customer {

    private int r_id;
    private String r_name;

    public void Choice(){
        System.out.println("Enter your choice: \n1.Appoint \n2.GenerateBill \n3.Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        switch(choice){
            case 1: GiveAppoint();
                break;
            case 2: GenerateBill();
                break;
            case 3:  main(null);
        }




    }
    public void GenerateBill(){

        Payment P = new Payment();
        int b_no =P.getB_no();
        String p_name =P.getP_name();
        int p_id = P.getP_id();
        int b_amt = P.getB_amt();
        int p_curly = P.getP_culry();
        int total = b_amt+p_curly;
        System.out.println("Bill NO: "+b_no +"\nCustomer ID: "+p_id+"\nCustomer Name: "+p_name+"\nBleachingHair: "+b_amt +"\nCurlyHair: " +p_curly +"\nTotal Layanan " + p_name+" : "+total);

    }

    public void GiveAppoint(){

        Customer C = new Customer();
        String p_name =C.getP_name();
        int p_id = C.getP_id();
        HairArtist H = new HairArtist();
        int d_id = H.getD_id();
        String d_name = H.getD_name();
        System.out.println("\n Customer ID: "+p_id+"\nCustomer Name: "+p_name+"\nAppointment with Hair Artist \nHair Artist ID: "+d_id+
                "\nHair Artist Name "+d_name);

    }

}
