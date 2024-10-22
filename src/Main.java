public class Main {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAOImpl();

        // Crear libros
        Libro libro1 = new Libro(1, "El Principito", "Antoine de Saint-Exupéry", 1943);
        Libro libro2 = new Libro(2, "1984", "George Orwell", 1949);
        Libro libro3 = new Libro(3, "Cien Años de Soledad", "Gabriel García Márquez", 1967);

        // Agregar libros
        libroDAO.agregarLibro(libro1);
        libroDAO.agregarLibro(libro2);
        libroDAO.agregarLibro(libro3);

        // Mostrar todos los libros
        System.out.println("\nLista de libros:");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }

        // Actualizar un libro
        libro1.setAutor("A. de Saint-Exupéry");
        libroDAO.actualizarLibro(libro1);

        // Obtener un libro por ID
        System.out.println("\nLibro con ID 1:");
        System.out.println(libroDAO.obtenerLibroPorId(1));

        // Eliminar un libro
        libroDAO.eliminarLibro(2);

        // Mostrar todos los libros después de la eliminación
        System.out.println("\nLista de libros después de la eliminación:");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }
    }
}