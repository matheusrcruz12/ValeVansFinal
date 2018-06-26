package valevans.com.br.valevans.Model;

/**
 * Created by Matheus R Cruz on 6/26/2018.
 */

public class Instituicao {
    public Instituicao(String nome) {
        this.nome = nome;
    }

    private String nome;
   // private String campus;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
