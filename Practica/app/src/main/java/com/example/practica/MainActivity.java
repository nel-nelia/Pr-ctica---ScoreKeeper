package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


  int contador = 0;
  Button btn1;
  Button btn2;
  Button btn3;
  Button btn4;
  TextView score1;
  TextView score2;
  TextView resultado;
  Button reiniciar;
  Button ganador;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
   btn1 = (Button)findViewById(R.id.btn_1);
    btn2 = (Button)findViewById(R.id.btn2);
    btn3 = (Button)findViewById(R.id.btn3);
    btn4 = (Button)findViewById(R.id.btn4);
    score1 = (TextView)findViewById(R.id.score1);
    score2 = (TextView)findViewById(R.id.score2);
    resultado = (TextView)findViewById(R.id.txtresultado);
    reiniciar = (Button)findViewById(R.id.btn_reiniciar);
    ganador = (Button)findViewById(R.id.btn_ganador);

    btn1.setTextColor(Color.parseColor("#9E9E9E"));


    btn2.setTextColor(Color.parseColor("#9E9E9E"));


    btn1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        contador ++;
        score1.setText("La cuenta va en: " + contador);

      }
    });

btn2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {


    if (contador>0){
      contador -- ;
    };

    score1.setText("La cuenta va en: " + contador);
  }
});

reiniciar.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    contador = 0;
    score1.setText("La cuenta va en: " + contador);
    score2.setText("La cuenta va en: " + contador);
    resultado.setText("");
  }
});

    btn3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        contador ++;
        score2.setText("La cuenta va en: " + contador);
      }
    });

    btn4.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (contador>0){
          contador -- ;
        };

        score2.setText("La cuenta va en: " + contador);

      }
    });

    ganador.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
       // int resultado1 = Integer.parseInt(score1.getText().toString());
      //  int resultado2 = Integer.parseInt(score2.getText().toString());
       // String resul = "Equipo ganador: ";
      //  if(resultado1 > resultado2){
      //    resul = resul + "E1";
       // }else if(resultado1 > resultado2){
       //   resul = resul + "E2";
      //  }

     //   Toast.makeText(MainActivity.this, resul, Toast.LENGTH_SHORT).show();
resultado.setText("El ganador es: " + contador);
      }
    });
  }
}
