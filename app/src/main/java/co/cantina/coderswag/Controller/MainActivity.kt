package co.cantina.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import co.cantina.coderswag.Adapters.CategoryAdapter
import co.cantina.coderswag.Adapters.CategoryRecycleAdapter
import co.cantina.coderswag.R
import co.cantina.coderswag.Services.DataService
import co.cantina.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
        val productsIntent = Intent(this, ProductsActivity::class.java)
            productsIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productsIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager

        //optimization for when cells dont change size
        categoryListView.setHasFixedSize(true)



    }
}
