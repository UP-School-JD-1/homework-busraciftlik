package com.busraciftlik.main;

import com.busraciftlik.model.Address;
import com.busraciftlik.model.Person;


import java.util.TreeSet;

public class Driver {
    public static void main(String[] args) {
        TreeSet<Person> people = createPersonList();
        for(Person person : people){
            System.out.println(person.toString());
        }
        System.out.println();

    }

    public static TreeSet<Person> createPersonList(){
        TreeSet<Person> persons = new TreeSet<Person>();
        Person person = new Person("Büşra","Çiftlik",new Address("Kocaeli","Türkiye","41100",2),"05111111");
        Person person1 = new Person("İkram","Dağcı",new Address("Kocaeli","Türkiye","41700",3),"05222222");
        Person person2 = new Person("Ayşe","Yıldız",new Address("İstanbul","Türkiye","34053",58),"05333333");
        Person person3 = new Person("Zeynep","Ak",new Address("Eskisehir","Türkiye","26538",57),"05444444");
        Person person4 = new Person("Ali","Akyıldız",new Address("Ankara","Türkiye","06587",74),"05555555");
        Person person5 = new Person("Büşra","Çam",new Address("Erzurum","Türkiye","25745",26),"05666666");

        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        return persons;
    }
}
