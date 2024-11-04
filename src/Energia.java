public class Energia {
    public String tipo;
    public Double produccionH;
    public Double consumoH;

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

    public Double getProduccionH() {
        return produccionH;
    }

    public void setProduccionH(Double produccionH) {
        this.produccionH = produccionH;
    }

    public Double getConsumoH() {
        return consumoH;
    }

    public void setConsumo(Double consumoH) {
        this.consumoH = consumoH;
    }

    //METODOS

    public void consumoEnergia(int horas, Double consumoH){
        double totalConsumo = horas * consumoH;
        if (totalConsumo==0){
            System.out.println("no tuvo consumo: " + totalConsumo);
        } else {
        System.out.println("El consumo total de energia es " + totalConsumo);
        }
    }

    public void produccionEnergia(int horas, double produccionH) {
        double totalProduccion = horas * produccionH;
        if (totalProduccion==0){
            System.out.println("no tuvo produccion: " + totalProduccion);
        } else {
            System.out.println("La produccion total de energia es: " + totalProduccion);
        }

    }


}
