package br.uninove.iatechtools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

import br.uninove.iatechtools.adapters.RecyclerNotasAdapter;
import br.uninove.iatechtools.pojo.Nota;

public class NotalistaActivity extends AppCompatActivity {

    ArrayList<Nota> listaNotas;
    SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notepadlista);

    }

    public void fabNovaNotaClick(View v){
        startActivity(new Intent(getApplicationContext(), NotacriacaoActivity.class));
    }

    private void prepararLista() {
        listaNotas = new ArrayList<>();

        db = openOrCreateDatabase("db_notas", Context.MODE_PRIVATE, null);

        db.execSQL("CREATE TABLE IF NOT EXISTS notas( " +
                "idNota INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "titulo VARCHAR(100) NOT NULL, " +
                "texto CLOB );");

        Cursor c = db.rawQuery("SELECT * FROM notas", null);

            Nota n = new Nota(c.getInt(0), c.getString(1), c.getString(2));
            listaNotas.add(n);

            RecyclerView r = findViewById(R.id.recycler_notas);
            RecyclerNotasAdapter adapter = new RecyclerNotasAdapter(getApplicationContext(), listaNotas);
            r.setAdapter(adapter);
    }
}