package com.example.didact.ejercicioview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvEtiquetaSuperior, tvEtiquetaInferior; //En la misma linea si son del mismo tipo
    ImageView ivImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificar la vista
        tvEtiquetaSuperior = (TextView)findViewById(R.id.mainActivityTextViewSuperior);
        tvEtiquetaInferior = (TextView)findViewById(R.id.mainActivityTextViewInferior);
        ivImagen = (ImageView)findViewById(R.id.mainActivityImageView2);

        /*
        //Evento click para la imagen
        ivImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEtiquetaInferior.setText("Has pultado el boton");
            }
        });
        */

        //Editar el texto de un TextView
        tvEtiquetaSuperior.setText("Hola mundo");
        String textoRecogido = tvEtiquetaSuperior.getText().toString();

        tvEtiquetaInferior.setText(textoRecogido);

    } //FIN onCreate

    //Resultado d e una accion

    public void escribirTextView(View view){
        tvEtiquetaInferior.setText("Has pultado el boton");
    }


} //FIN MainActivity
