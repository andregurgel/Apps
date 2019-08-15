package br.ufrn.institucional;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_empresa, iv_servicos, iv_clientes, iv_contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_empresa = (ImageView) findViewById(R.id.iv_empresa);
        iv_servicos = (ImageView) findViewById(R.id.iv_servicos);
        iv_clientes = (ImageView) findViewById(R.id.iv_clientes);

        iv_empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamarActivity(EmpresaActivity.class);
            }
        });

        iv_servicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamarActivity(ServicoActivity.class);
            }
        });

        iv_clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamarActivity(ClientesActivity.class);
            }
        });
    }

    public void chamarActivity(Class NovaTela){
        Intent intent = new Intent(this, NovaTela);
        startActivity(intent);
    }
}
