package co.cantina.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.cantina.coderswag.R
import co.cantina.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
