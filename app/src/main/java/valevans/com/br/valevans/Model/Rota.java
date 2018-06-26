package valevans.com.br.valevans.Model;

/**
 * Created by Matheus R Cruz on 6/26/2018.
 */

public class Rota extends Id {
    private Bairro bairro;
    private Instituicao inst;
    private int vanId;
    private int periodo;

    public Rota(Bairro bairro, Instituicao inst, int vanId,int periodo) {
        this.bairro = bairro;
        this.inst = inst;
        this.vanId = vanId;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public Instituicao getInst() {
        return inst;
    }

    public int getVanId() {
        return vanId;
    }

    public int getPeriodo() {
        return periodo;
    }
}
