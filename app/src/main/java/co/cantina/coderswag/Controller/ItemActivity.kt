package co.cantina.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.cantina.coderswag.Model.Product
import co.cantina.coderswag.R
import co.cantina.coderswag.Utilities.EXTRA_PRODUCT

class ItemActivity : AppCompatActivity() {

    lateinit var product : Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        product = intent.getParcelableExtra(EXTRA_PRODUCT)
        println(product.title)
    }
}
