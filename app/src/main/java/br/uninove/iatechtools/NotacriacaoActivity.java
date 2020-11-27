package br.uninove.iatechtools;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NotacriacaoActivity extends AppCompatActivity {

    SQLiteDatabase db;
    EditText edTitulo, edTexto;
    Button btSalvarNota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notepadcriacao);

        edTitulo = findViewById(R.id.editTituloNota);
        edTexto = findViewById(R.id.editTextNota);
        btSalvarNota = findViewById(R.id.btSalvarNota);

        btSalvarNota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues valores = new ContentValues();
                valores.put("Titulo", edTitulo.toString());
                valores.put("Texto", edTexto.toString());
                db = openOrCreateDatabase("db_notas", Context.MODE_PRIVATE, null);
                db.insert("notas", null, valores);
            }
        });
    }
}