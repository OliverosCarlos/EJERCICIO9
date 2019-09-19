package mx.edu.ittepic.tpdm_u1_ejercicio9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    var txtN : EditText ?= null
    var txtM : EditText ?= null
    var n = 0
    var m = 0
    var btnCalcular : Button ?= null

    var layTabla : LinearLayout ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtN = findViewById(R.id.n)
        txtM = findViewById(R.id.m)

        btnCalcular = findViewById(R.id.btn)

        layTabla = findViewById(R.id.layoutTabla)

        btnCalcular?.setOnClickListener {
            calcular()
        }
    }

    fun calcular(){
        layTabla?.removeAllViews()
        n = txtN?.text.toString().toInt()
        m = txtM?.text.toString().toInt()
        Toast.makeText(this,"datos $n, $m",Toast.LENGTH_LONG).show()
        (1..m).forEach {
            var r = n*it
            var etiqueta = TextView(this)
            etiqueta.setText("$n x $it = $r")
            layTabla?.addView(etiqueta)
        }
    }
}
