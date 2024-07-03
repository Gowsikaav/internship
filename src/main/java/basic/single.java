package basic;
class bank
{
    public void bank()
    {
        String bankname ="SIB";
        String bankbranch ="panamarathupatty";
        System.out.println("bankname is:"+bankname);
        System.out.println("bankname is:"+bankbranch);
    }
}
class customerdetails extends bank
{
  public void customerdetails ()
    {
        String customername ="gowsika";
        String customerid ="22cs081";
        System.out.println("customer deails is:"+customername);
        System.out.println("customer details is:"+customerid);
    }
}
public class single {
    public static void main(String[] args)
{
bank c1 = new bank();
    c1.bank();
    }
}
