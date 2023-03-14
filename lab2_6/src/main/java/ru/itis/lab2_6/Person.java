package ru.itis.lab2_6;

public class Person {

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String lastName;
    public String firstName;

/*
@Override
public boolean equals(Object p2) {

    if (!(p2 instanceof Person)) return false;

    if (this == p2) return true;

    if (this.lastName.toLowerCase().equals(((Person)p2).lastName.toLowerCase()) &&
            this.firstName.toLowerCase().equals(((Person)p2).firstName.toLowerCase())) return true;

    return false;
}
*/

    @Override
    public boolean equals(Object o) {

        return (this == o);

/*
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!lastName.equals(person.lastName)) return false;
        return firstName.equals(person.firstName);
*/
    }

    @Override
    public int hashCode() {
        int result = lastName.hashCode();
        result = 31 * result + firstName.hashCode();
        return result;
    }
}
