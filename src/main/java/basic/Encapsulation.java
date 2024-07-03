package basic;
class Employee
{
 public int Empid;
 public String Ename;

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee ee= new Employee();
        ee.setEmpid(308);
        ee.setEname("Priya");
        System.out.println(ee.getEmpid()+"\n"+ee.getEname());
    }
}
