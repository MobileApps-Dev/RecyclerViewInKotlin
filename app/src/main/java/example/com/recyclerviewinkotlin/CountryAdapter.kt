package example.com.recyclerviewinkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.country_adapter.view.*

class CountryAdapter(context: Context, dataList: List<String>) : RecyclerView.Adapter<CountryAdapter.ViewHolder>() {
    var context = context
    var dataList = dataList


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        //Declare View of .xml
        var view = LayoutInflater.from(context).inflate(R.layout.country_adapter, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.countryName?.text = dataList.get(position) // Set Data to TextView
    }

    override fun getItemCount(): Int {
        return dataList.size //arrayList Size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var countryName = view.txt_country_name //declare TextView

    }


}
