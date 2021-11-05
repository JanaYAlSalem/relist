package com.example.relist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.relist.adapter.ItemAdapter
import com.example.relist.data.Datasource
import com.example.relist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var LinkXML: ActivityMainBinding // to initializes LinkXML in future time
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LinkXML = ActivityMainBinding.inflate(layoutInflater)  // initializes the binding object
        setContentView(LinkXML.root) // get root of XML

//        var x = Datasource().loadAffirmations().size
//        LinkXML.Show.setText(x) // to print size of list


        // Initialize data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

    }
}