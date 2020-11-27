package br.uninove.iatechtools;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class CalculadoraActivity extends AppCompatActivity {
    char opcao;
    String edCalc;
    Double num1, num2, res;
    Button btNum1, btNum2, btNum3, btNum4, btNum5, btNum6, btNum7, btNum8, btNum9, btNum0,
            btNum00, btApagar, btLimpar, btIgual, btPonto, btSoma, btSub,  btDiv, btMult, btMod;
    EditText edCalculo;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        //Atribui às variáveis locais o valor dos botões
        btNum1 = findViewById(R.id.btNum1);
        btNum2 = findViewById(R.id.btNum2);
        btNum3 = findViewById(R.id.btNum3);
        btNum4 = findViewById(R.id.btNum4);
        btNum5 = findViewById(R.id.btNum5);
        btNum6 = findViewById(R.id.btNum6);
        btNum7 = findViewById(R.id.btNum7);
        btNum8 = findViewById(R.id.btNum8);
        btNum9 = findViewById(R.id.btNum9);
        btNum0 = findViewById(R.id.btNum0);
        btNum00 = findViewById(R.id.btNum00);

        btSoma = findViewById(R.id.btSoma);
        btSub = findViewById(R.id.btSub);
        btMult = findViewById(R.id.btMult);
        btDiv = findViewById(R.id.btDiv);
        btMod = findViewById(R.id.btMod);

        btApagar = findViewById(R.id.btApagar);
        btLimpar = findViewById(R.id.btLimpar);
        btIgual = findViewById(R.id.btIgual);
        btPonto = findViewById(R.id.btPonto);

        edCalculo = findViewById(R.id.edCalculo);
        tvResultado = findViewById(R.id.tvResultado);

        //Listener que envia o input do botão para o edit Text edCalculo
        btNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalculo.setText(edCalculo.getText() + "1");
            }
        });

        btNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalculo.setText(edCalculo.getText() + "2");
            }
        });

        btNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalculo.setText(edCalculo.getText() + "3");
            }
        });

        btNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalculo.setText(edCalculo.getText() + "4");
            }
        });

        btNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalculo.setText(edCalculo.getText() + "5");
            }
        });

        btNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalculo.setText(edCalculo.getText() + "6");
            }
        });

        btNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalculo.setText(edCalculo.getText() + "7");
            }
        });

        btNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalculo.setText(edCalculo.getText() + "8");
            }
        });

        btNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalculo.setText(edCalculo.getText() + "9");
            }
        });

        btNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalculo.setText(edCalculo.getText() + "0");
            }
        });

        btNum00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalculo.setText(edCalculo.getText() + "00");
            }
        });

        //todo Criar array para armazenar os valores num1 e num2
        //todo Toda vez que o botão de numero for apertado, somar os valores em uma na variável
        btSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edCalculo.getText().length() != 0) {
                    num1 = (Double.parseDouble(edCalculo.getText() + ""));
                    opcao = '+';
                    edCalculo.setText(null);
                }
            }
        });

        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edCalculo.getText().length() != 0) {
                    num1 = (Double.parseDouble(edCalculo.getText() + ""));
                    opcao = '-';
                    edCalculo.setText(null);
                }
            }
        });

        btMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edCalculo.getText().length() != 0) {
                    num1 = (Double.parseDouble(edCalculo.getText() + ""));
                    opcao = 'x';
                    edCalculo.setText(null);
                }
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edCalculo.getText().length() != 0) {
                    num1 = (Double.parseDouble(edCalculo.getText() + ""));
                    opcao = '/';
                    edCalculo.setText(null);
                }
            }
        });

        btMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edCalculo.getText().length() != 0) {
                    num1 = (Double.parseDouble(edCalculo.getText() + ""));
                    opcao = '%';
                    edCalculo.setText(null);
                }
            }
        });

        btIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(opcao){
                    case '+':
                        if (edCalculo.getText().length() != 0) {
                                num2 = (Double.parseDouble(edCalculo.getText() + ""));
                                edCalculo.setText(null);
                                res = num1 + num2;
                                tvResultado.setText(num1 + " + " + num2  + " = " + (res));
                                limparVariaveis();
                                break;
                        }

                    case '-':
                        if (edCalculo.getText().length() != 0) {
                            num2 = (Double.parseDouble(edCalculo.getText() + ""));
                            res = num1 - num2;
                            tvResultado.setText(num1 + " - " + num2  + " = " + (res));
                            limparVariaveis();
                            break;
                        }

                    case 'x':
                        if (edCalculo.getText().length() != 0) {
                            num2 = (Double.parseDouble(edCalculo.getText() + ""));
                            res = num1 * num2;
                            tvResultado.setText(num1 + " x " + num2  + " = " + (res));
                            limparVariaveis();
                            break;
                        }

                    case '/':
                        if (edCalculo.getText().length() != 0) {
                            num2 = (Double.parseDouble(edCalculo.getText() + ""));
                            res = num1 / num2;
                            tvResultado.setText(num1 + " ÷ " + num2  + " = " + (res));
                            limparVariaveis();
                            break;
                        }

                    case '%':
                        if (edCalculo.getText().length() != 0) {
                            num2 = (Double.parseDouble(edCalculo.getText() + ""));
                            res = num1 % num2;
                            tvResultado.setText(num1 + " % " + num2  + " = " + (res));
                            limparVariaveis();
                            break;
                        }
                }
            }
        });

        //Limpa tudos os campo e as variáveis que armazenam os valores a serem calculados
        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limparVariaveis();
                limparTexto();
            }
        });

        //Botão que exclui 1 character da string dentro do editText edCalculo
        btApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int charLength;
                    edCalc = edCalculo.getText().toString();
                    charLength = edCalc.length();
                    if(charLength > 0){
                        edCalculo.setText(edCalc.substring(0, edCalc.length() - 1));
                    }else{

                    }
            }
        });

        //Funcão para adicionar um ponto e calcular valor decimal
        btPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalc = edCalculo.getText().toString();
                if(edCalc.contains(".") == true) {

                }else{
                    edCalculo.setText(edCalculo.getText() + ".");
                }
            }
        });
    }

    //Função para limpeza de variáveis
    public void limparVariaveis(){
        num1 = 0.0;
        num2 = 0.0;
        res = 0.0;
    }

    //Função para limpeza do edCalculo e tvResultado
    public void limparTexto(){
        edCalculo.setText("");
        tvResultado.setText("");
    }
}