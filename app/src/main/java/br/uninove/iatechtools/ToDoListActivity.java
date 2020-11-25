package br.uninove.iatechtools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ToDoListActivity extends AppCompatActivity implements View.OnClickListener{
    //Definição das variáveis locais
    EditText editToDo;
    Button btAdicionarToDo, btLimpaListaToDo;
    ListView listaToDo;
    ArrayList<String> lista;
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist);

        //Atribuindo valores dos botões ás variáveis locais
        editToDo = findViewById(R.id.editToDo);
        btAdicionarToDo = findViewById(R.id.btAdicionarToDo);
        btLimpaListaToDo = findViewById(R.id.btLimparListaToDo);
        listaToDo = findViewById(R.id.listaToDo);

        //Array que armazena as strings
        lista = new ArrayList<>();

        //Array adaptador que busca o layout da lista Array atualizado
        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        listaToDo.setAdapter(adaptador);

        //Listener que recebe o conteudo da EditText
        btAdicionarToDo.setOnClickListener(this);
        btLimpaListaToDo.setOnClickListener(this);

        //Função para apagar os itens dentro do listView segurando o item da lista
        listaToDo.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View v, int pos, long id) {

                lista.remove(pos);
                adaptador.notifyDataSetChanged();

                return false;
            }
        });
    }

    //Adiciona os textos no array lista
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
                Toast.makeText(getApplicationContext(), "Campo vazio, digite algo!", Toast.LENGTH_LONG).show();
            }
        }

        //Botão limpar a lista, exclui limpa o array
        if(v == btLimpaListaToDo){
            lista.clear();
            adaptador.notifyDataSetChanged();
            editToDo.setText("");
            editToDo.requestFocus();
        }
    }
}