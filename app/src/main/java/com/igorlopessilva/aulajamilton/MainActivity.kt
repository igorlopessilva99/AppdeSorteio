package com.igorlopessilva.aulajamilton

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


    }

    fun sortear(view: View){
        val textoResultado = findViewById<TextView>(R.id.text_resultado)
        val numero = Random().nextInt(11)//0...10
        textoResultado.setText("número gerado: $numero")
    }


}