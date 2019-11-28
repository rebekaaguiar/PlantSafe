package br.com.kitkaty.ps;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.List;

public class MeusRegistros extends AppCompatActivity {
    private UsuarioResource usuarioResource;
    private List<Usuario> usuarios;

    private TextView user;
    private ProgressDialog load;

    private Button btnVoltarInicioMR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meus_registros);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy
                .Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        user = (TextView) findViewById(R.id.textView2);
        usuarioResource = new UsuarioResource();
        atualizaInterface();


        btnVoltarInicioMR = findViewById(R.id.btnVoltarInicioMR);

        btnVoltarInicioMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeusRegistros.this, InicialActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Inicio", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(MeusRegistros.this, InicialActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Minha Horta", Toast.LENGTH_SHORT).show();
        finish();
    }
    public void atualizaInterface() {
        try {
            usuarios = usuarioResource.getUsuarios();
            String texto = "";
            for (Usuario usuario : usuarios) {
                texto += usuario.toString() + "\n";
            }
            user.setText(texto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

