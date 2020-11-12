package br.uninove.iatechtools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ToDoListActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editToDo;
    Button btAdicionarToDo, btLimpaListaToDo;
    ListView listaToDo;
    ArrayList<String> lista;
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist);

        editToDo = findViewById(R.id.editToDo);
        btAdicionarToDo = findViewById(R.id.btAdicionarToDo);
        btLimpaListaToDo = findViewById(R.id.btLimparListaToDo);
        listaToDo = findViewById(R.id.listaToDo);

        lista = new ArrayList<>();

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        listaToDo.setAdapter(adaptador);

        btAdicionarToDo.setOnClickListener(this);
        btLimpaListaToDo.setOnClickListener(this);

        //Faltam os listeners de click da listview
    }

    @Override
    public void onClick(View v){
        if(v == btAdicionarToDo){
            String textoAdicionado = editToDo.getText().toString();

            if(!textoAdicionado.isEmpty()) {
                lista.add(textoAdicionado);
                adaptador.notifyDataSetChanged();
                editToDo.setText("");
                editToDo.requestFocus();
            }else{
                Toast.makeText(getApplicationContext(),
                        "Campo vazio, digite algo!", Toast.LENGTH_LONG).show();
            }
        }

        if(v == btLimpaListaToDo){
            lista.clear();
            adaptador.notifyDataSetChanged();
            editToDo.setText("");
            editToDo.requestFocus(); //enviar o FOCO para o campo de digitação
        }
    }
}
