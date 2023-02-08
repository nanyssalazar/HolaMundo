package edu.iest.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var tvGreeting: TextView? = null  ///lateinit solo para global de Vistas       el signo de interrogación es para permitir que la variable pueda ser null o no

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvGreeting = findViewById(R.id.txt_HolaMundo)
        cambiarMensaje()
        cambiarMensaje(1)
        //tvGreeting.text = getString(R.string.despedida)
    }

    private fun cambiarMensaje(){
        val mensaje_original:String
        mensaje_original = tvGreeting?.text.toString()
        Toast.makeText(this, "Tu mensaje original era "+ mensaje_original+" :)", Toast.LENGTH_LONG).show()
    }

    private fun cambiarMensaje(tipo:Int){
        if (tipo == 1){
            tvGreeting!!.text = getString(R.string.despedida) ///Los dos signos de admiración va a agarrar el valor asi sea nulo y si es nulo va a tronar
        }else{
            Toast.makeText(this, "El tipo es $tipo", Toast.LENGTH_LONG).show()
        }
    }
}