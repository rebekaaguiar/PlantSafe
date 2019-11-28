package br.com.kitkaty.ps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*Alunos: Carlos Henrique Dias Ribeiro, Catarina Magalhães Rebouças,
Rebeka Ramos de Aguiar Silva e Vitor Manoel Carneiro dos Santos
Professor: Renan Costa Alencar
Data: 25/11/2019 */


public class MainActivity extends AppCompatActivity {

    private Button btnInicial;
    private Button btnConfiguracoes;
    private Button btnMeuPerfil;
    private Button btnPlantSafe;
    private Button btnCadastrar;
    private Button btnFaleConosco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



     /*   OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {

            }
        });
        MainActivity().getOnBackPressedDispatcher().addCallback(this, callback);

        // The callback can be enabled or disabled here or in handleOnBackPressed()}
*/


        btnInicial = findViewById(R.id.btnInicial);
        btnConfiguracoes = findViewById(R.id.btnConfiguracoes);
        btnMeuPerfil = findViewById(R.id.btnMeuPerfil);
        btnPlantSafe = findViewById(R.id.btnPlantSafe);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnFaleConosco = findViewById(R.id.btnFaleConosco);

        btnInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InicialActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Inicio", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnConfiguracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ConfiguracoesActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Configurações", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnMeuPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MeuPerfilActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Meu Perfil", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnPlantSafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlantSafeActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Plant Safe", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CadastrarActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Cadastrar", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnFaleConosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FaleConoscoActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Fale Conosco", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
}

