package Rental_GUI;

public class CuotaArriendo {
    private int numCuota;
    private int valorCuota;
    private Boolean pagada;

    public CuotaArriendo(int numCuota, int valorCuota, Boolean pagada) {
        this.numCuota = numCuota;
        this.valorCuota = valorCuota;
        this.pagada = pagada;
    }
    public int getNumCuota() {
        return numCuota;
    }
    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }
    public int getValorCuota() {
        return valorCuota;
    }
    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }
    public Boolean getPagada() {
        return pagada;
    }
    public void setPagada(Boolean pagada) {
        this.pagada = pagada;
    }
}
