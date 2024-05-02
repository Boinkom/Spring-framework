package org.example;

public class Person {

   public final String time;

   public String name;
   public String surname;
   public String gender;

   public String distance;

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Person(String name, String surname, String gender, String distance, String time) {
        this.time = time;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "time='" + time + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", distance=" + distance +
                '}';
    }
}
