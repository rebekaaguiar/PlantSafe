package br.com.kitkaty.ps;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastrarActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPrefsFile";

    private Button btnCadastrar;
    private EditText edtUsuario;
    private EditText edtEmail;
    private EditText edtNovoSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrar);

        btnCadastrar = findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CadastrarActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Cadastro Salvo", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(CadastrarActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Menu Principal", Toast.LENGTH_SHORT).show();
        finish();
    }


}
