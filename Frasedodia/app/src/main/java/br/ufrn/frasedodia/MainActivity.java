package br.ufrn.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tv_frase;
    private Button bt_frase;

    private String[] frases = {"Enfrente os problemas e leve a melhor!", "Nem todos os dias são bons, mas há algo bom em cada dia.", "Toda manhã você tem duas escolhas: continuar dormindo com seus sonhos ou acordar e persegui-los!", "Preste atenção nas oportunidades que estão à sua frente!", "A sua irritação não solucionará problema algum. O seu mau humor não modifica a vida. Não estrague o seu dia.", "Vamos inventar o amanhã no lugar de se preocupar com o que aconteceu ontem."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_frase = (TextView) findViewById(R.id.tv_frase);
        bt_frase = (Button) findViewById(R.id.bt_frase);

        tv_frase.setText(frases[5]);

        bt_frase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random;
                Random gerador = new Random();
                random = gerador.nextInt(5);

                tv_frase.setText(frases[random]);
            }
        });
    }
}
