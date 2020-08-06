package by.HW1JavaGuru.bean;

import java.util.Objects;

public class Person {
    private String mame;
    private int age;

    public Person() {
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(mame, person.mame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mame, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "mame='" + mame + '\'' +
                ", age=" + age +
                '}';
    }
}
