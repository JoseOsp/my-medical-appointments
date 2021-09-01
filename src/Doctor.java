public class Doctor {
    static int id = 0; // Auto increment
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el Objeto Doc");
        id++;
    }

    Doctor( String name ) {
        System.out.println("El nombre del Doctor asignado es: " + name );
    }

    // Comportamientos
    public void showName() {
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
