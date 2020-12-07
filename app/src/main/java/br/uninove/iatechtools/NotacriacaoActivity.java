package br.uninove.iatechtools;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.uninove.iatechtools.pojo.Nota;

public class NotacriacaoActivity extends AppCompatActivity {

        SQLiteDatabase db;
        EditText edTitulo, edTexto;
        Button btExcluir;
        Nota n;
        boolean editando = false;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_notepadcriacao);
            edTitulo = findViewById(R.id.editTituloNota);
            edTexto = findViewById(R.id.editTextNota);

            if (getIntent().getExtras() != null && getIntent().getExtras().size() != 0) {
                Bundle b = getIntent().getExtras();
                n = (Nota) b.getSerializable("nota");
                btExcluir = findViewById(R.id.btDeletarNota);
                btExcluir.setVisibility(View.VISIBLE);

                edTitulo.setText(n.getTitulo());
                edTexto.setText(n.getTexto());
                editando = true;

            }
        }

        public void btSalvarNota(View v) {
            ContentValues values = new ContentValues();
            values.put("titulo", edTitulo.getText().toString());
            values.put("texto", edTexto.getText().toString());
            db = openOrCreateDatabase("db_notas", Context.MODE_PRIVATE, null);

            if (!editando) {
                db.insert("notas", null, values);
            } else {
//            //Se quiser atualizar a data da nota:
//            Date horaAgora = Calendar.getInstance().getTime();
//            n.setDataCriacao(horaAgora);
//            values.put("dataCriacao", n.getDataCriacao().toString());
                db.update("notas", values, "idNota = " + n.getIdNota(), null);
            }

            finish();
        }
    }