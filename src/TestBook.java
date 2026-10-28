public class TestBook {
    public static void main(String[] args) {
       Book books[] = new Book[5];

        Author jose = new Author("Jose Gimeno Roca", "josegimenoroca@gmail.com", 'm');
        Author maria = new Author("Maria Santa Llevadera", "mariasantallevadera@gmail.com", 'f');
        Author paco = new Author("Paco Natillas Vainillas", "paconatillasvainillas@gmail.com", 'm');
        Author lorenzo = new Author("Lorenzo Paco Seguro", "lorenzopacosegurocontacto@gmail.es", 'm');
        Author zacarias = new Author("Zacarias Dietista Caries", "zacariasdietistacaries@gmail.com", 'm');

        books[0] = new Book("Que pedazo de piedras", jose, 25, 400);
        books[1] = new Book("Como relajarse en situacion de estres", maria, 15.99, 500);
        books[2] = new Book("La receta perfecta para una natilla", paco, 20.99, 1500);
        books[3] = new Book("Libro de aprendizaje para abogados III", lorenzo, 95.99, 20);
        books[4] = new Book("Porque la ensalada es una mentira para las dietas", zacarias, 10.50, 100000);
        for (int i = 0; i < books.length; i++){
            System.out.println(books[i]);
        }
    }
}
