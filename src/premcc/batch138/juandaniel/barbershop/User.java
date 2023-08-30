package premcc.batch138.juandaniel.barbershop;

import java.io.*;
import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        System.out.println("Welcome to BarberShop Pre-Mcc Batch138");
        System.out.println("Enter your choice:  \n1.Customer \n2.HairArtist \n3.Services");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        //sc.nex

        do{
            switch(choice){
                case 1:
                    Customer C = new Customer();
                    C.Choice();
                    break;
                case 2: HairArtist H = new HairArtist();
                    H.Choice();
                    break;
                case 3: Services S = new Services();
                    S.Choice();
                    break;
            }
        }while(choice!=4);
    }

}