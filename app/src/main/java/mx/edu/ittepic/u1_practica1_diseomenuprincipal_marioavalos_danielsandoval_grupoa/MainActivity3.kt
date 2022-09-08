package mx.edu.ittepic.u1_practica1_diseomenuprincipal_marioavalos_danielsandoval_grupoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        regresar.setOnClickListener {
            finish()
        }
    }
}