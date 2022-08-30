package company;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<DayOfWeeks, String> schedule;
    private Family family;


    public Human(String name, String surname, int year) {
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
    }

    public Human() {

    }

    public Human(String name, String surname, int year, int iq, Map <DayOfWeeks, String> schedule,Family family) {
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
        this.setIq(iq);
        this.setSchedule(schedule);
        this.setFamily(family);
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);

    }


    public void greetPet() {
        System.out.println("Hello");
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public Map<DayOfWeeks, String> getSchedule() {
        return schedule;
    }

    public void setSchedule( Map<DayOfWeeks, String> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                ", family=" + family +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);

        return result;

    }

    @Override
    protected void finalize()  {

        System.out.printf("%s %s is deleted\n",name, surname);
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}