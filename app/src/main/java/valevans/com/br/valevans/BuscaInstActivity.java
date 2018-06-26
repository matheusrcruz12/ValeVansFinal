package valevans.com.br.valevans;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import valevans.com.br.valevans.Model.BancoDeDados;
import valevans.com.br.valevans.Model.Rota;

public class BuscaInstActivity extends AppCompatActivity {


    private Button btnBuscar;
    private Spinner spnBairro;
    private Spinner spnInst;
    private Spinner spnPeriodo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_inst);


        btnBuscar = findViewById(R.id.btnBuscarId);

        spnBairro = findViewById(R.id.spnBairroId);
        spnInst = findViewById(R.id.spnInstId);
        spnPeriodo = findViewById(R.id.spnPeriodoId);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bairro = spnBairro.toString();
                String inst = spnInst.toString();
                String periodo = spnPeriodo.toString();
                int pp = 0;
                if (periodo.equals("Manha")){
                    pp = 01;
                }else if(periodo.equals("Tarde")){
                    pp = 02;
                }else if(periodo.equals("Noite")){
                    pp = 03;
                }
                

                if(bairro != null && inst != null && periodo!= null){
                    BancoDeDados bd2 = new BancoDeDados();

                    List<Rota> rotas = new ArrayList<>();

                     rotas = bd2.buscaRota(bairro,inst,pp);
                }
            }
        });

    }
}
