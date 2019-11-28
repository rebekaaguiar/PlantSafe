package br.com.kitkaty.ps;

import android.util.Log;

import androidx.annotation.NonNull;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class UsuarioResource {
    private static final String BASE_URL = "http://plantsafe.herokuapp.com/temp";

    public List<Usuario> getUsuarios() throws IOException {
        URL url = new URL(BASE_URL);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        Log.i("zzz", "Response Code: " + conn.getResponseCode());

        BufferedInputStream in = new BufferedInputStream(conn.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String corpo = "";
        String linha = br.readLine();
        while (linha != null) {
            corpo += linha + "\n";
            linha = br.readLine();
        }

        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(corpo);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                Usuario usuario = jsonObjectToUsuario(jsonObject);
                usuarios.add(0, usuario);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Log.i("zzz", "Corpo: " + corpo);

        return usuarios;
    }

    @NonNull
    private Usuario jsonObjectToUsuario(JSONObject jsonObject) throws JSONException {
        int id = jsonObject.getInt("id");
        String temperatura = jsonObject.getString("temperatura");
        int umidade = jsonObject.getInt("umidade");
        String datahora = jsonObject.getString("datahora");
        String regada = jsonObject.getString("regada");

        return new Usuario(id, temperatura, umidade, datahora, regada);
    }


}
