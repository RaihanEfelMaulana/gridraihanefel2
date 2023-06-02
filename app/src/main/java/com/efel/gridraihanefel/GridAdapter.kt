package com.efel.gridraihanefel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter (
    private val gridMobilList: List<GridModel>,
    private val context: Context
): BaseAdapter() {
    private lateinit var name: TextView
    private lateinit var image: ImageView
    private lateinit var price: TextView
    private lateinit var toko: TextView
    private var layoutInflater: LayoutInflater?=null
    override fun getCount(): Int {
        return gridMobilList.size
    }
    override fun getItem(p0: Int): Any {
        return p0
    }
    override fun getItemId(p0: Int): Long {
        return 0
    }
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view=p1
        if(layoutInflater==null){
            layoutInflater= context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
                    as LayoutInflater
        }
        if (view==null){
            view= layoutInflater!!.inflate(R.layout.grid_mobil, null)
        }
        image = view!!.findViewById(R.id.carImage)
        name = view!!.findViewById(R.id.carName)
        price = view!!.findViewById(R.id.carHarga)
        toko = view!!.findViewById(R.id.carMerek)

        image.setImageResource(gridMobilList.get(p0).image)
        name.setText(gridMobilList.get(p0).name)
        price.setText(gridMobilList.get(p0).price)
        toko.setText(gridMobilList.get(p0).toko)

        return view
    }
}