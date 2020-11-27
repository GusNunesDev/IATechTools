package br.uninove.iatechtools;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;

public class NotaActivity extends AppCompatActivity {

    SQLiteDatabase db;
    EditText edTitulo, edTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notepadcriacao);

        edTitulo.findViewById(R.id.editTituloNota);
        edTexto.findViewById(R.id.editTextNota);
    }

    public void btSalvarNota(){
        ContentValues valores = new ContentValues();
        valores.put("Titulo", edTitulo.toString());
        valores.put("Texto", edTexto.toString());
        db = openOrCreateDatabase("db_notas", Context.MODE_PRIVATE, null);
        db.insert("notas", null, valores);
    }
}