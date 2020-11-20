package br.uninove.iatechtools;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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

        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limparVariaveis();
                limparTexto();
            }
        });

        //todo aparentemente a substring ta de brinks / arrumar essa bagaça depois
        btApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edCalc = (edCalculo.getText() + "");
                edCalc.substring(0, edCalc.length() - 1);
                edCalculo.setText(edCalc + "");
            }
        });

//        btPonto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (deci) {
//
//                } else {
//                    edCalculo.setText(edCalculo.getText() + ".");
//                    deci = true;
//                }
//            }
//        });
    }
    public void limparVariaveis(){
        num1 = 0.0;
        num2 = 0.0;
    }
    public void limparTexto(){
        edCalculo.setText("");
        tvResultado.setText("");
    }
}