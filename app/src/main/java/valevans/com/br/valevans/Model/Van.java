package valevans.com.br.valevans.Model;

/**
 * Created by Matheus R Cruz on 6/25/2018.
 */

public class Van extends Id{

    private int lugares;
    private String placa;
    private String nomeEmpresa;


    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}
