package co.cantina.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import co.cantina.coderswag.Adapters.CategoryAdapter
import co.cantina.coderswag.Adapters.CategoryRecycleAdapter
import co.cantina.coderswag.R
import co.cantina.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager

        //optimization for when cells dont change size
        categoryListView.setHasFixedSize(true)


//        //doesn't work for recycler view
////        categoryListView.setOnItemClickListener { parent, view, position, id ->
////            val category = DataService.categories[position]
////            Toast.makeText(this, "You clicked on the ${category.title}", Toast.LENGTH_SHORT).show()
////
//       }
    }
}
