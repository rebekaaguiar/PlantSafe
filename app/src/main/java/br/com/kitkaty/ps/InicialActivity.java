package br.com.kitkaty.ps;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InicialActivity extends AppCompatActivity {

    private Button btnregistros;
    private Button btnRegarAgora;
    private Button btnVoltarMenuI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicial);

        btnregistros= findViewById(R.id.btnregistros);

        btnregistros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicialActivity.this, MeusRegistros.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Verificando Registros", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnRegarAgora = findViewById(R.id.btnRegarAgora);
        btnRegarAgora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Regar Agora", Toast.LENGTH_SHORT).show();
            }
        });

        btnVoltarMenuI = findViewById(R.id.btnVoltarMenuI);
        btnVoltarMenuI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InicialActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Menu Principal", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(InicialActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Menu Principal", Toast.LENGTH_SHORT).show();
        finish();
    }
}

/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicial);

        btnregistros= findViewById(R.id.btnregistros);

        btnregistros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicialActivity.this, MeusRegistros.class);
                startActivity(intent);
                finish();
            }
        });

        btnRegarAgora = findViewById(R.id.btnRegarAgora);
        btnRegarAgora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Regar Agora", Toast.LENGTH_SHORT).show();
            }
        });

    }*/
