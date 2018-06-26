package valevans.com.br.valevans.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matheus R Cruz on 6/25/2018.
 */

public class BancoDeDados {

    List<Bairro> bairros = new ArrayList<>();
    List<Instituicao> instituicoes = new ArrayList<>();
    List<Rota> rotas = new ArrayList<>();
    Bairro b1 = new Bairro("Jardim Oriente");
    Bairro b2 = new Bairro("Morumbi");
    Bairro b3 = new Bairro("Jardim América");
    Bairro b4 = new Bairro("Parque Industrial");
    Bairro b5 = new Bairro("Jardim Paraiso");
    Bairro b6 = new Bairro("Jardim do Sul");

    public void addBairros(){
        bairros.add(b1);bairros.add(b2);bairros.add(b3);bairros.add(b4);bairros.add(b5);bairros.add(b6);
    }
    Instituicao i1 = new Instituicao("Fatec / Unifesp");
    Instituicao i2 = new Instituicao("Unip");
    Instituicao i3 = new Instituicao("Univap");
    Instituicao i4 = new Instituicao("Etep");
    public void addInstituicoes(){
        instituicoes.add(i1);instituicoes.add(i2);instituicoes.add(i3);instituicoes.add(i4);
    }
    Rota r1 = new Rota(b1, i1,01,01);
    Rota r2 = new Rota(b2, i1,02,01);
    Rota r3 = new Rota(b3, i1,03,01);
    Rota r4 = new Rota(b4, i1,04,01);
    Rota r5 = new Rota(b5, i1,05,01);
    Rota r6 = new Rota(b6, i1,06,01);
    Rota r7 = new Rota(b1, i2,07,01);
    Rota r8 = new Rota(b2, i2,8,01);
    Rota r9 = new Rota(b3, i2,9,01);
    Rota r10 = new Rota(b4, i2,10,01);
    Rota r11 = new Rota(b5, i3,11,01);
    Rota r12 = new Rota(b6, i3,12,01);
    Rota r13 = new Rota(b1, i3,13,01);
    Rota r14 = new Rota(b2, i3,14,01);
    Rota r15 = new Rota(b3, i4,15,01);
    Rota r16 = new Rota(b4, i4,16,01);
    Rota r17 = new Rota(b5, i4,17,01);
    Rota r18 = new Rota(b6, i4,18,01);
    Rota r19 = new Rota(b1, i1,19,01);
    Rota r20 = new Rota(b2, i1,20,01);
    Rota r21 = new Rota(b3, i1,01,03);
    Rota r22 = new Rota(b4, i1,02,03);
    Rota r23 = new Rota(b5, i2,03,03);
    Rota r24 = new Rota(b6, i2,04,03);
    Rota r25 = new Rota(b1, i2,05,03);
    Rota r26 = new Rota(b2, i2,06,03);
    Rota r27 = new Rota(b3, i3,07,03);
    Rota r28 = new Rota(b4, i3,8,03);
    Rota r29 = new Rota(b5, i3,9,03);
    Rota r30 = new Rota(b6, i3,10,03);
    Rota r31 = new Rota(b1, i4,11,03);
    Rota r32 = new Rota(b2, i4,12,03);
    Rota r33 = new Rota(b3, i4,13,03);
    Rota r34 = new Rota(b4, i4,14,03);
    Rota r35 = new Rota(b5, i1,15,03);
    Rota r36 = new Rota(b6, i1,16,03);
    Rota r37 = new Rota(b6, i2,17,03);
    Rota r38 = new Rota(b1, i1,18,03);
    Rota r39 = new Rota(b2, i1,19,03);
    Rota r40 = new Rota(b3, i2,20,03);

    public void addRotas(){
        rotas.add(r1);
        rotas.add(r2);
        rotas.add(r3);
        rotas.add(r4);
        rotas.add(r5);
        rotas.add(r6);
        rotas.add(r7);
        rotas.add(r8);
        rotas.add(r9);
        rotas.add(r10);
        rotas.add(r11);
        rotas.add(r12);
        rotas.add(r13);
        rotas.add(r14);
        rotas.add(r15);
        rotas.add(r16);
        rotas.add(r17);
        rotas.add(r18);
        rotas.add(r19);
        rotas.add(r20);
        rotas.add(r21);
        rotas.add(r22);
        rotas.add(r23);
        rotas.add(r24);
        rotas.add(r25);
        rotas.add(r26);
        rotas.add(r27);
        rotas.add(r28);
        rotas.add(r29);
        rotas.add(r30);
        rotas.add(r31);
        rotas.add(r32);
        rotas.add(r33);
        rotas.add(r34);
        rotas.add(r35);
        rotas.add(r36);
        rotas.add(r37);
        rotas.add(r38);
        rotas.add(r39);
        rotas.add(r40);
    }

    public List<Rota> buscaRota(String b, String i, int p){
        List<Rota> rotaBusca = new ArrayList<>();
        Bairro bb;
        Instituicao ib;
        int pb;
        for (Rota r :rotas){
            bb = r.getBairro();
            ib = r.getInst();
            pb = r.getPeriodo();
            if(b.equals(bb.getNome()) && i.equals(ib.getNome()) && p == pb ){
                rotaBusca.add(r);
            }
        }
        return rotaBusca;

    }

}
