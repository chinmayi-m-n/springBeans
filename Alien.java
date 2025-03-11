package org.ivoyant;

public class Alien {
    private int age;
    private Laptop lap;
    public Alien(){
        System.out.println("Alien object is created");
    }

    //this setter is called from spring.xml

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;//
    }

    public void setLap(Laptop obj){
        lap=obj;//
    }

    public void code(){
        System.out.println("coding");
        //compile is the method inside Laptop class
        // to call that we need a object of Laptop class
        //if u create Laptop reference variable as instance variable and create property to set value for lap variable
        //at time of bean creation itself lap variable vl be assigned vth laptop object
        //we can use that reference to call compile() of laptop
        lap.compile();
    }

}
