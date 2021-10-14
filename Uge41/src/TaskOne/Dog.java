package TaskOne;

import java.util.ArrayList;

public class Dog {

    private boolean isHungry = true;
    private ArrayList<Dog> offSpring;
    private Owner owner;
    private String name;

    public Dog(String name, boolean isHungry){
        this.name = name;
        this.isHungry = isHungry;
        offSpring = new ArrayList<>();
    }
    public String feedDog(){
        String s;
        if(isHungry){
            s = "Dog is fed";
            isHungry = false;
        } else {
            s = "Dog is not hungry";
        }
        return s;
    }
    public void setOffSpring(Dog d) {
        offSpring.add(d);

    }

    public ArrayList<Dog> getOffSpring() {
        return offSpring;
    }

    public String getDogName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return name;
    }
}