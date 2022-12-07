package blatt6;

import static jsTools.Input.*;
class Person {
    long pnr;
    String name;
    long zip;
    String ort;


}


public class aufgabe43 {



    public static void main (String [] args) {
        Person personObjekt =new Person();
        personObjekt.pnr=readInt("Personennummer eingeben");
        personObjekt.name=readString("Name eingeben");
        personObjekt.zip=readInt("Postleitzahl eingeben");
        personObjekt.ort=readString("Wohnort eingeben");


        Person personObjekt2 =new Person();
        personObjekt2.pnr=readInt("Personennummer eingeben");
        personObjekt2.name=readString("Name eingeben");
        personObjekt2.zip=readInt("Postleitzahl eingeben");
        personObjekt2.ort=readString("Wohnort eingeben");



        System.out.println(personObjekt.pnr);
        System.out.println(personObjekt.name);
        System.out.println(personObjekt.zip);
        System.out.println(personObjekt.ort);

        System.out.println(personObjekt2.pnr);
        System.out.println(personObjekt2.name);
        System.out.println(personObjekt2.zip);
        System.out.println(personObjekt2.ort);

    }



}
