package co.cantina.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import co.cantina.coderswag.Adapters.ProductsAdapter
import co.cantina.coderswag.R
import co.cantina.coderswag.Services.DataService
import co.cantina.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        val layoutManager = GridLayoutManager(this, 2)
        productListView.layoutManager = layoutManager as RecyclerView.LayoutManager?
        productListView.adapter = adapter
    }
}
