package premcc.batch138.juandaniel.barbershop;

public class Payment{

    private int p_no=1;
    private int p_amt=60000;
    private int p_culry =150000;
    //private int
    Customer P = new Customer();
    String p_name =P.getP_name();
    int p_id = P.getP_id();
    public String getP_name() {
        return p_name;
    }
    public int getB_no() {
        return p_no;
    }
    public int getB_amt() {
        return p_amt;
    }

    public int getP_id() {
        return p_id;
    }

    public  int getP_culry(){
        return p_culry;
    }


}