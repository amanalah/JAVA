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
        myZoo.nbrCages=;*/
        Zoo myZoo = new Zoo("Friguia", "Sousse",50);

        Animal lion = new Animal ("félidés", "Simba" ,5,true);
        Animal lion1 = new Animal ("félidés", "Nola" ,6,true);
        Animal zebra = new Animal ("Equidae", "Marty" ,12,true);
        Animal elephant1 = new Animal ("Eléphantidés", "Tembo" ,32,true);
        Animal elephant = new Animal("Eléphantidés","Maya",10,true );
        Animal crocodile = new Animal ("Crocodylidae","Louis",10,false );
        Animal tiger       = new Animal("Felidae", "Raja", 9, true);
        Animal tiger1      = new Animal("Felidae", "Raja", 6, true);
        Animal tiger2      = new Animal("Felidae", "Raja", 6, true);
        Animal chimpanzee  = new Animal("Hominidae", "Coco", 24, true);
        Animal chimpanzee1 = new Animal("Hominidae", "Cheeta", 17, true);
        Animal camel       = new Animal("Camelidae", "Sahara", 12, true);
        Animal camel1      = new Animal("Camelidae", "Jamal", 9, true);
        Animal giraffe     = new Animal("Giraffidae", "Zuri", 11, true);
        Animal giraffe1    = new Animal("Giraffidae", "Melman", 8, true);
        Animal hippo       = new Animal("Hippopotamidae", "Gloria", 20, true);
        Animal hippo1      = new Animal("Hippopotamidae", "Hugo", 26, true);
        Animal rhino       = new Animal("Rhinocerotidae", "Bhima", 15, true);
        Animal rhino1      = new Animal("Rhinocerotidae", "Kalu", 19, true);
        Animal polarBear   = new Animal("Ursidae", "Nanuk", 13, true);
        Animal polarBear1  = new Animal("Ursidae", "Aurora", 7, true);
        Animal quokka      = new Animal("Macropodidae", "Kiki", 5, true);
        Animal quokka1     = new Animal("Macropodidae", "Mochi", 3, true);
        Animal gorilla     = new Animal("Hominidae", "Kongo", 19, true);
        Animal squirrel    = new Animal("Sciuridae", "Nuts", 3, true);
        Animal jaguar     = new Animal("Felidae", "Diego", 12, true);
        Animal tortoise    = new Animal("Testudinidae", "Methuselah", 70, false);


        myZoo.displayZoo();
        System.out.println(myZoo); //Zoo@7ef20235
        System.out.println(myZoo.toString()); //Zoo@7ef20235
        System.out.println(lion.toString());
        System.out.println(lion);

        System.out.println(myZoo.addAAnimal(lion));
        System.out.println(myZoo.addAAnimal(elephant));
        System.out.println(myZoo.addAAnimal(crocodile));
        System.out.println(myZoo.addAAnimal(lion1));
        System.out.println(myZoo.addAAnimal(zebra));
        System.out.println(myZoo.addAAnimal(elephant1));
        System.out.println(myZoo.addAAnimal(tiger));
        System.out.println(myZoo.addAAnimal(tiger1));
        System.out.println(myZoo.addAAnimal(chimpanzee));
        System.out.println(myZoo.addAAnimal(chimpanzee1));
        System.out.println(myZoo.addAAnimal(camel));
        System.out.println(myZoo.addAAnimal(camel1));
        System.out.println(myZoo.addAAnimal(giraffe));
        System.out.println(myZoo.addAAnimal(giraffe1));
        System.out.println(myZoo.addAAnimal(hippo));
        System.out.println(myZoo.addAAnimal(hippo1));
        System.out.println(myZoo.addAAnimal(rhino));
        System.out.println(myZoo.addAAnimal(rhino1));
        System.out.println(myZoo.addAAnimal(polarBear));
        System.out.println(myZoo.addAAnimal(polarBear1));
        System.out.println(myZoo.addAAnimal(quokka));
        System.out.println(myZoo.addAAnimal(quokka1));
        System.out.println(myZoo.addAAnimal(gorilla));
        System.out.println(myZoo.addAAnimal(squirrel));
        System.out.println(myZoo.addAAnimal(jaguar));
        System.out.println(myZoo.addAAnimal(tortoise));

        myZoo.showAnimals();

        System.out.println(myZoo.searchAnimal(tiger));





    }
}