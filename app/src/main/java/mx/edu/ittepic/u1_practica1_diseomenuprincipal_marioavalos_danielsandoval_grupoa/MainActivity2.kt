package mx.edu.ittepic.u1_practica1_diseomenuprincipal_marioavalos_danielsandoval_grupoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main3.regresar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        regresar.setOnClickListener {
            finish()
        }

        login.setOnClickListener {
            if (usuario.text.isNotEmpty() && contraseña.text.isNotEmpty()){
                usuario.setText("")
                contraseña.setText("")
                Toast.makeText(this,"Se inició sesión, favor de regresar al menú",Toast.LENGTH_LONG).show()
            }
        }
    }
}