package br.com.kitkaty.ps;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static br.com.kitkaty.ps.EditarPerfilActivity.PREFS_NAME;

public class ConfiguracoesActivity  extends AppCompatActivity {

    private Button btnSalvarP;
    private Button btnVoltarC;


    private CheckBox ckSoloSeco;
    private Spinner spTempEs;
    private CheckBox ckTodosDias;
    private CheckBox SegundaFeira;
    private CheckBox TercaFeira;
    private CheckBox QuartaFeira;
    private CheckBox QuintaFeira;
    private CheckBox SextaFeira;
    private CheckBox Sabado;
    private CheckBox Domingo;

   /* private SharedPreferences sharedPreferences;
    public static final String PREFS_NAME = "MyPrefsFile";*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracoes);

        /*spTempEs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object obj = parent.getItemAtPosition(pos);
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this.getClass(ConfiguracoesActivity););
                SharedPreferences.Editor prefsEditor = prefs.edit();
                prefsEditor.putString("object", obj.toString());
                prefsEditor.commit();
            }
            public void onNothingSelected(AdapterView<?> parent) { }
        });
*/
        SegundaFeira = (CheckBox) findViewById(R.id.SegundaFeira);
        boolean Check = getBooleanFromPreferences("Check");
        Log.i("start", "" + Check);
        SegundaFeira.setChecked(Check);
        SegundaFeira.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean Check) {
                Log.i("boolean", "" + Check);
                ConfiguracoesActivity.this.putBooleanInPreferences(Check, "Check");
            }
        });

        TercaFeira = (CheckBox) findViewById(R.id.TercaFeira);
        boolean Ch = getBooleanFromPreferences("Ch");
        Log.i("start", "" + Ch);
        TercaFeira.setChecked(Ch);
        TercaFeira.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean Ch) {
                Log.i("boolean", "" + Ch);
                ConfiguracoesActivity.this.putBooleanInPreferences(Ch, "Ch");
            }
        });

        QuartaFeira = (CheckBox) findViewById(R.id.QuartaFeira);
        boolean C = getBooleanFromPreferences("C");
        Log.i("start", "" + C);
        QuartaFeira.setChecked(C);
        QuartaFeira.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean C) {
                Log.i("boolean", "" + C);
                ConfiguracoesActivity.this.putBooleanInPreferences(C, "C");
            }
        });

        QuintaFeira = (CheckBox) findViewById(R.id.QuintaFeira);
        boolean Ck = getBooleanFromPreferences("Ck");
        Log.i("start", "" + Ck);
        QuintaFeira.setChecked(Ck);
        QuintaFeira.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean Ck) {
                Log.i("boolean", "" + Ck);
                ConfiguracoesActivity.this.putBooleanInPreferences(Ck, "Ck");
            }
        });

        SextaFeira = (CheckBox) findViewById(R.id.SextaFeira);
        boolean Ce = getBooleanFromPreferences("Ce");
        Log.i("start", "" + Ce);
        SextaFeira.setChecked(Ce);
        SextaFeira.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean Ce) {
                Log.i("boolean", "" + Ce);
                ConfiguracoesActivity.this.putBooleanInPreferences(Ce, "Ce");
            }
        });

        Sabado = (CheckBox) findViewById(R.id.Sabado);
        boolean Ked = getBooleanFromPreferences("Ked");
        Log.i("start", "" + Ked);
        Sabado.setChecked(Ked);
        Sabado.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean Ked) {
                Log.i("boolean", "" + Ked);
                ConfiguracoesActivity.this.putBooleanInPreferences(Ked, "Ked");
            }
        });

        Domingo = (CheckBox) findViewById(R.id.Domingo);
        boolean Cked = getBooleanFromPreferences("Cked");
        Log.i("start", "" + Cked);
        Domingo.setChecked(Cked);
        Domingo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean Cked) {
                Log.i("boolean", "" + Cked);
                ConfiguracoesActivity.this.putBooleanInPreferences(Cked, "Cked");
            }
        });


        ckTodosDias = (CheckBox) findViewById(R.id.ckTodosDias);
        boolean Checked = getBooleanFromPreferences("Checked");
        Log.i("start", "" + Checked);
        ckTodosDias.setChecked(Checked);
        ckTodosDias.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean Checked) {
                Log.i("boolean", "" + Checked);
                ConfiguracoesActivity.this.putBooleanInPreferences(Checked, "Checked");
            }
        });

        ckSoloSeco = (CheckBox) findViewById(R.id.ckSoloSeco);
        boolean isChecked = getBooleanFromPreferences("isChecked");
        Log.i("start", "" + isChecked);
        ckSoloSeco.setChecked(isChecked);
        ckSoloSeco.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton view, boolean isChecked) {
                Log.i("boolean", "" + isChecked);
                ConfiguracoesActivity.this.putBooleanInPreferences(isChecked, "isChecked");
            }
        });


        btnSalvarP = findViewById(R.id.btnSalvarP);

        btnSalvarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfiguracoesActivity.this, InicialActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Configurações Salvas", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnVoltarC = findViewById(R.id.btnVoltarC);

        btnVoltarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfiguracoesActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Menu Principal", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(ConfiguracoesActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Menu Principal", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void putBooleanInPreferences(boolean isChecked, String key) {
        SharedPreferences sharedPreferences = this.getPreferences(Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, isChecked);
        editor.commit();
    }

    public boolean getBooleanFromPreferences(String key) {
        SharedPreferences sharedPreferences = this.getPreferences(Activity.MODE_PRIVATE);
        Boolean isChecked = sharedPreferences.getBoolean(key, false);
        return isChecked;
    }
}


