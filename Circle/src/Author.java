public class Author {
    // zad 3.2 a)
    private String name;
    private String surname;
    private int age;

    Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // zad 3.2 b)
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    // zad 3.2 c)
    public String toString() {
        System.out.println(
                "Author name = " + this.getName() + ", surname = " + this.getSurname() + ", age = " + this.getAge());
        return "";
    }
}
