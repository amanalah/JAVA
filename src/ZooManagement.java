import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        /*Animal lion = new Animal();
        Zoo myZoo = new Zoo();
        lion.family= "félidés";
        lion.name="Simba";
        lion.age= 5;
        lion.isMammal=true;

        myZoo.name="Friguia";
        myZoo.city="Tunis";
        myZoo.nbrCages=20;*/

        Animal lion = new Animal ("félidés", "Simba" ,5,true);
        Zoo myZoo = new Zoo("Friguia", "Sousse",20);
        Animal elephant = new Animal("Eléphantidés","Maya",10,true );
        Animal crocodile = new Animal ("Crocodylidae","Louis",10,false );
        myZoo.displayZoo();
        System.out.println(myZoo); //Zoo@7ef20235
        System.out.println(myZoo.toString()); //Zoo@7ef20235
        System.out.println(lion.toString());
        System.out.println(lion);

    }
}