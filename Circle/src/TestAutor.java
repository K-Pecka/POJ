public class TestAutor {
    public static void main(String[] args) {
        System.out.println("\n\n===========================================================\n");
        // zad 3.2 d)
        Author author_1 = new Author("Bolesław", "Prus", 55);
        Author author_2 = new Author("Eliza", "Orzeszkowa", 34);
        author_1.toString();
        author_1.setSurname("Leśmian");
        author_1.toString();
        author_2.toString();
        System.out.println(
                "Name: " + author_2.getName() + ", age: " + author_2.getAge() + ", surname: " + author_2.getSurname());

    }
}
