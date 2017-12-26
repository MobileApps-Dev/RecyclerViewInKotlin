package example.com.recyclerviewinkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycler_view: RecyclerView
    var dataList: MutableList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData() // Load data to array List
        //Declare RecyclerView
        recycler_view = findViewById(R.id.recycler_view) as RecyclerView
        //Declare  vertical(List) RecyclerView
        recycler_view.layoutManager = LinearLayoutManager(this)
        //Declare GridLayout in RecyclerView
//        recycler_view.layoutManager = GridLayoutManager(this,2)
        //adapter set to recyclerView
        recycler_view.adapter = CountryAdapter(this, dataList)


    }

    //Load Data in arrayList
    fun loadData() {
        dataList.add("Afghanistan")
        dataList.add("Albania")
        dataList.add("Algeria")
        dataList.add("Andorra")
        dataList.add("Australia")
        dataList.add("Austria")
        dataList.add("Bangladesh")
        dataList.add("Belgium")
        dataList.add("Bermuda")
        dataList.add("Canada")
        dataList.add("China")
        dataList.add("Colombia")
        dataList.add("Denmark")
        dataList.add("Mexico")
        dataList.add("New Zealand")
        dataList.add("Pakistan")
        dataList.add("India")
        dataList.add("Indonesia")
        dataList.add("Tunisia")
        dataList.add("Turkey")
        dataList.add("United States of America (USA)")
        dataList.add("Zimbabwe")

    }
}
