package br.ufrn.gasolinaoualcool;

import android.service.autofill.FillEventHistory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv_resultado;
    private EditText et_gasolina, et_alcool;
    private Button bt_verificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_gasolina = (EditText) findViewById(R.id.et_gasolina);
        et_alcool = (EditText) findViewById(R.id.et_alcool);
        bt_verificar = (Button) findViewById(R.id.bt_verificar);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);

        bt_verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_alcool.getText().length() == 0 || et_gasolina.getText().length() == 0){
                    Toast.makeText(MainActivity.this, "Preencha os campos corretamente.", Toast.LENGTH_SHORT).show();
                }else{
                    double gasolina, alcool, teste;
                    gasolina = Double.parseDouble(et_gasolina.getText().toString());
                    alcool = Double.parseDouble(et_alcool.getText().toString());
                    teste = alcool / gasolina;

                    if (teste < 0.7){
                        tv_resultado.setText("É melhor abastecer com Alcool");
                    }else{
                        tv_resultado.setText("É melhor abastecer com Gasolina");
                    }
                }
            }
        });
    }
}
