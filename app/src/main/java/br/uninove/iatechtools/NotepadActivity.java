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
import java.util.Date;

public class NotepadActivity extends AppCompatActivity {

    ArrayList<Nota> listaNotas;//Lista que armazenara as notas
    SQLiteDatabase db;//Variável que faz a conexão com banco de dados

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notepad);
    }

    //Função que faz o envio dos dados da nota para o banco de dados
    private void prepararLista() {
        listaNotas = new ArrayList<>();

        db = openOrCreateDatabase("db_notas", Context.MODE_PRIVATE, null);

        db.execSQL("CREATE TABLE IF NOT EXISTS notas(" +
                "idNota INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "titulo VARCHAR(100) NOT NULL, " +
                "texto CLOB, " +
                "dataCriacao DATE);");

        Cursor c = db.rawQuery("SELECT * FROM notas ORDER BY dataCriacao", null);

        if(c != null && c.getCount() > 0) {
            while (c.moveToNext()){
                Date data = new Date(c.getLong(3)*1000);
                Nota n = new Nota(c.getInt(0), c.getString(1), c.getString(2), data);
            }
        }else{
            //a lista está vazia
        }

        //RecyclerView r = fin //paramos aqui. A energia do prof. caiu
    }
}