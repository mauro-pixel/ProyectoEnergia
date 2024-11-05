public class TipoEnergia extends Energia{

    public String nombreTipoEnergia;

    //CONSTRUCTOR

    public TipoEnergia(String nombreTipoEnergia, Double produccionH, String tipo, Double consumoH) {
        super(produccionH, tipo, consumoH);
        this.nombreTipoEnergia = nombreTipoEnergia;
    }

    // GETTER/SETTER


    public String getNombreTipoEnergia() {
        return nombreTipoEnergia;
    }

    public void setNombreTipoEnergia(String nombreTipoEnergia) {
        this.nombreTipoEnergia = nombreTipoEnergia;
    }


}
