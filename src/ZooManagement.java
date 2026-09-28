import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner user= new Scanner(System.in);
        String zooName;
        int nbrCages;
        do{
            System.out.println("Nom du zoo:");
            zooName=user.next();
        }while(zooName.isEmpty() );
        do{
            System.out.println("Nombre des cages:");
            nbrCages=user.nextInt();
        }while(nbrCages<0);



        System.out.println(zooName +" comporte "+ nbrCages +" cages");
        user.close();
    }
}