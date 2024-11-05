public class Energia {
    public String tipo;
    public double produccionH;
    public double consumoH;

    public Energia(Double produccionH, String tipo, Double consumoH) {
        this.produccionH = produccionH;
        this.tipo = tipo;
        this.consumoH = consumoH;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getProduccionH() {
        return produccionH;
    }

    public void setProduccionH(double produccionH) {
        this.produccionH = produccionH;
    }

    public double getConsumoH() {
        return consumoH;
    }

    public void setConsumo(double consumoH) {
        this.consumoH = consumoH;
    }

    //METODOS

    public void obtenerConsumoEnergia(int horas, double consumoH){
        double totalConsumo = horas * consumoH;
        if (totalConsumo==0){
            System.out.println("no tuvo consumo: " + totalConsumo);
        } else {
            System.out.println("El consumo total de energia es " + totalConsumo);
        }
    }

    public void obtenerProduccionEnergia(int horas, double produccionH) {
        double totalProduccion = horas * produccionH;
        if (totalProduccion==0){
            System.out.println("no tuvo produccion: " + totalProduccion);
        } else {
            System.out.println("La produccion total de energia es: " + totalProduccion);
        }

    }
}
