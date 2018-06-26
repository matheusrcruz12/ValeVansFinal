package valevans.com.br.valevans;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class BuscaInstActivity extends AppCompatActivity {


    private Button btnBuscar;
    private Spinner spnCidade;
    private Spinner spnBairro;
    private Spinner spnInst;
    private Spinner spnPeriodo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_inst);


        btnBuscar = findViewById(R.id.btnBuscarId);
        spnCidade = findViewById(R.id.spnCidadeId);
        spnBairro = findViewById(R.id.spnBairroId);
        spnInst = findViewById(R.id.spnInstId);
        spnPeriodo = findViewById(R.id.spnPeriodoId);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

    }
}
