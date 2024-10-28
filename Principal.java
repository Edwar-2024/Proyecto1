import java.util.*;
class Principal
{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Cliente objeto1=new Cliente(100, "Ana");
        Cliente objeto2=new Cliente(200, "Luis");
        System.out.println(objeto1.getCodigo());
        System.out.println(objeto2.getCodigo());
        int a;
        a=sc.nextInt();

    }

}