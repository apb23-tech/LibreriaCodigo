public class main {
    public static void main(String[] args) {
        libreria.libros libro1 = new libreria().new libros("El Quijote", "Miguel de Cervantes", 863);
        libreria.libros libro2 = new libreria().new libros("Cien Años de Soledad", "Gabriel García Márquez", 417);
        libreria.libros libro3 = new libreria().new libros("Metamorfosis", "Franz Kafka", 201);
        libreria.libros libro4 = new libreria().new libros("La Divina Comedia", "Dante Alighieri", 798);
        libreria.libros libro5 = new libreria().new libros("La ciudad y los perros", "Mario Vargas Llosa", 416);
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Páginas: " + libro1.getPaginas());
    }
    
}
