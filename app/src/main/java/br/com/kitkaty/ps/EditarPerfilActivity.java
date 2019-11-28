package br.com.kitkaty.ps;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditarPerfilActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPrefsFile";
    private EditText edtNovoUsuario;
    private EditText edtNovoSenha;
    private CheckBox chkSalvar;
    private EditText edtNovoEmail;
    private Button btnSalvarPerfil;
    private Button btnVoltarEP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editar_perfil);

        btnSalvarPerfil = findViewById(R.id.btnSalvarPerfil);
        btnSalvarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditarPerfilActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Informações alteradas com sucesso", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnVoltarEP = findViewById(R.id.btnVoltarEP);
        btnVoltarEP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditarPerfilActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Menu Principal", Toast.LENGTH_SHORT).show();
                finish();
            }
        });




    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(EditarPerfilActivity.this, MeuPerfilActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Meu Perfil", Toast.LENGTH_SHORT).show();
        finish();
    }
}