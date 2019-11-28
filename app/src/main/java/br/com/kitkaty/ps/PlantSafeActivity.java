package br.com.kitkaty.ps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PlantSafeActivity extends AppCompatActivity {

    private Button btnVoltarMenuPS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plant_safe);

        btnVoltarMenuPS = findViewById(R.id.btnVoltarMenuPS);

        btnVoltarMenuPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlantSafeActivity.this, MainActivity.class );
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Menu Principal", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(PlantSafeActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Menu Principal", Toast.LENGTH_SHORT).show();
        finish();
    }
}
