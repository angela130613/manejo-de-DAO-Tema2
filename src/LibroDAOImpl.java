import java.util.ArrayList;
import java.util.List;

public class LibroDAOImpl implements LibroDAO {
    private List<Libro> libros = new ArrayList<>();

    @Override
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro);
    }

    @Override
    public Libro obtenerLibroPorId(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public List<Libro> obtenerTodosLosLibros() {
        return libros;
    }

    @Override
    public void actualizarLibro(Libro libro) {
        Libro existente = obtenerLibroPorId(libro.getId());
        if (existente != null) {
            existente.setTitulo(libro.getTitulo());
            existente.setAutor(libro.getAutor());
            existente.setAñoPublicacion(libro.getAñoPublicacion());
            System.out.println("Libro actualizado: " + existente);
        }
    }

    @Override
    public void eliminarLibro(int id) {
        libros.removeIf(libro -> libro.getId() == id);
        System.out.println("Libro con ID " + id + " eliminado.");
    }
}