package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * @author Alejandro López
     * @version 1.0
     * </br> Aplicación que muestra el típico ejemplo de Hola Mundo
     * <ol>
     *       <li>He visto como se crean recursos en XML</li>
     *       <li>He instanciado en Java un objeto TextView</li>
     *       <li>Se ha personalizado la imagen de la aplicación</i>
     * </ol>*/

    private TextView tvMessageStart;
    private  TextView tvMessageEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessageStart=findViewById(R.id.tvMessageStart);

        tvMessageEnd= findViewById(R.id.tvMessageEnd);

        tvMessageStart.setTextColor(getColor(R.color.green));
        tvMessageEnd.setText(R.string.tvMesageOptimist);
    }
}