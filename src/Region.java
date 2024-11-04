public class Region {

    String nombre;
    String localizacion;
    String datos;
    int year;

    // CONSTRUCTOR

    public Region(String nombre, String localizacion, String datos, int year) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.datos = datos;
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

}


