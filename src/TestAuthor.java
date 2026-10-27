public class TestAuthor {
    public static void main(String[] args) {
        Author anAuthor = new Author("Jose Manolo", "jejesoyuncrack@hotmail.es", 'm');
        System.out.println(anAuthor);
        anAuthor.setEmail("josemanoloprofesional@gmail.com");
        System.out.println(anAuthor);
    }
}
