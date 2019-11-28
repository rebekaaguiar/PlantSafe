package br.com.kitkaty.ps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FaleConoscoActivity extends AppCompatActivity {

    private Button btnEnviar;
    private Button btnVoltarFC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fale_conosco);

        Button btn_site = (Button)findViewById(R.id.btn_site);
        Button btn_email = (Button )findViewById(R.id.btn_email);

        btn_site.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("http://twitter.com/grupoccrv"));
                startActivity (intent);
            }
        });

        btn_email.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View v) {
                Intent intent = new Intent (Intent.ACTION_SEND);
                intent.setType (" plain / text ");
                intent.putExtra(Intent.EXTRA_EMAIL ,
                        new String [] { "grupoccrv@gmail.com"});
                startActivity (Intent.createChooser(intent, "Enviar email"));
            }
        });

        /*btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                *//*Intent intent = new Intent(FaleConoscoActivity.this, FaleConoscoActivity.class );
                startActivity(intent);*//*
                Toast.makeText(getApplicationContext(), "Mensagem Enviada", Toast.LENGTH_SHORT).show();
                *//*finish();*//*
            }
        });*/

        btnVoltarFC = findViewById(R.id.btnVoltarFC);

        btnVoltarFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FaleConoscoActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Menu Principal", Toast.LENGTH_SHORT).show();
                finish();
            }
        });



    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(FaleConoscoActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Menu Principal", Toast.LENGTH_SHORT).show();
        finish();
    }

}
