package br.uninove.iatechtools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btToDoList, btNotepad, btCalculadora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btNotepad = findViewById(R.id.btNotepad);
        btNotepad.setOnClickListener(this);
        btToDoList = findViewById(R.id.btToDoList);
        btToDoList.setOnClickListener(this);
        btCalculadora = findViewById(R.id.btCalculadora);
        btCalculadora.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.btNotepad:
                Intent telaNotepad = new Intent(MainActivity.this, NotepadActivity.class);
                startActivity(telaNotepad);
                break;

            case R.id.btToDoList:
                Intent telaToDoList = new Intent(MainActivity.this, ToDoListActivity.class);
                startActivity(telaToDoList);
                break;

            case R.id.btCalculadora:
                Intent telaCalculadora = new Intent(MainActivity.this, CalculadoraActivity.class);
                startActivity(telaCalculadora);
                break;
        }
    }
}
