package mx.edu.ittepic.u1_practica1_diseomenuprincipal_marioavalos_danielsandoval_grupoa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var carro= 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        platano.setOnClickListener {
            compra("Platanos","¿Cuántos plátanos deseas comprar?",1,4)
        }
        manzana.setOnClickListener {
            compra("Manzanas","¿Cuántas mazanas deseas comprar?",1,4)
        }
        uvas.setOnClickListener {
            compra("Uvas","¿Cuántos racimos de uvas deseas comprar?",1,4)
        }
        aguacate.setOnClickListener {
            compra("Aguacate","¿Cuántos aguacates deseas comprar?",1,4)
        }
        zanahoria.setOnClickListener {
            compra("Zanahorias","¿Cuántas zanahorias deseas comprar?",1,4)
        }
        jitomate.setOnClickListener {
            compra("Jitomates","¿Cuántos jitomates deseas comprar?",1,4)
        }

        nosotros.setOnClickListener {
            AlertDialog.Builder(this).setTitle("Acerca de...")
                .setMessage("Mario Alberto Avalos Rodríguez\nDaniel Sandoval Alvarez")
                .setNeutralButton("OK") {d,i ->
                    d.dismiss()
                }
                .show()
        }

        perfil.setOnClickListener {
            val iniciosesion = Intent(this,MainActivity2::class.java)
            startActivity(iniciosesion)
        }

        ajustes.setOnClickListener {
            val ventanaAjustes = Intent(this,MainActivity3::class.java)
            startActivity(ventanaAjustes)
        }
    }

    fun agregarCarrito(p: Int){
        carro = carro + p
        productos.setText("(  ${carro.toString()}  )")
        Toast.makeText(this,"Se aregaron productos al carrito",Toast.LENGTH_LONG).show()
    }

    fun compra(t:String, m: String, n:Int, p:Int){
        AlertDialog.Builder(this)
            .setTitle(t)
            .setMessage(m)
            .setNegativeButton(n.toString(),{d,i->agregarCarrito(n)})
            .setPositiveButton(p.toString(),{d,i->agregarCarrito(p)})
            .setNeutralButton("Cancelar",{d,i->d.dismiss()})
            .show()
    }

}