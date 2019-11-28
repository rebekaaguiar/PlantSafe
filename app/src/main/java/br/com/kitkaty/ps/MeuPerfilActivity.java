package br.com.kitkaty.ps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MeuPerfilActivity extends AppCompatActivity {

    private Button btnVoltarMenuMP;
    private Button btnAlterarPerfil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meu_perfil);

        btnVoltarMenuMP = findViewById(R.id.btnVoltarMenuMP);

        btnVoltarMenuMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MeuPerfilActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Menu Principal", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnAlterarPerfil = findViewById(R.id.btnAlterarPerfil);

        btnAlterarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeuPerfilActivity.this, EditarPerfilActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Editar Perfil", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(MeuPerfilActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Menu Principal", Toast.LENGTH_SHORT).show();
        finish();
    }

}
