package TaskOne;

import java.util.ArrayList;
public class DogKennel {
    public static void main(String[] args) {
        //TODO:
        // lav en ny hund
        Dog myDog = new Dog("woodie", true);
        // sæt en ejer
        Owner owner = new Owner("Henning");
        myDog.setOwner(owner);
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        myDog.setOffSpring(new Dog("woodiesnoopie", true));
        myDog.setOffSpring(new Dog("woodiesfido", false));

        // print alle hvalpe
        ArrayList<Dog> myOff = myDog.getOffSpring();
        for (Dog myD: myOff) {
            System.out.println(myD);
        }

        // print ejeren
        System.out.println("hunden " + myDog.getDogName() + " er ejet af " + myDog.getOwner());

        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        String resString = myDog.feedDog();
        System.out.println(resString);
    }

}