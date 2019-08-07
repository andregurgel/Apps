package br.ufrn.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_input;
    private Button bt_descobrir;
    private TextView tv_resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_input = (EditText) findViewById(R.id.et_input);
        bt_descobrir = (Button) findViewById(R.id.bt_descobrir);
        tv_resposta = (TextView) findViewById(R.id.tv_resposta);

        bt_descobrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_input.getText().length() == 0){
                    Toast.makeText(MainActivity.this, "Insira uma idade válida.", Toast.LENGTH_LONG).show();
                }else{
                    int idade;
                    idade = Integer.parseInt(et_input.getText().toString());
                    idade = idade * 7;
                    tv_resposta.setText("A idade em anos humanos é: " + idade);
                }
            }
        });
    }
}
