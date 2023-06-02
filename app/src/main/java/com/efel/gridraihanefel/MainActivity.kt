package com.efel.gridraihanefel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() { private lateinit var gridView: GridView
    private lateinit var gridMobilList: List<GridModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridView= findViewById(R.id.gridCar)
        gridMobilList= ArrayList<GridModel>()
        gridMobilList=gridMobilList+GridModel("Mazda mx-5",R.drawable.foto1,"Rp. 1.000.000.000","Honda Padang")
        gridMobilList= gridMobilList+ GridModel("Toyota Supra", R.drawable.foto2,"Rp. 500.000.000","Mitsubishi Production")
        gridMobilList= gridMobilList+ GridModel("BMW C200", R.drawable.foto3,"Rp. 2.000.000.000","Deni Motor")
        gridMobilList= gridMobilList+ GridModel("Mazda cx-8", R.drawable.foto4,"Rp. 600.000.000","Raihan Motor")
        gridMobilList= gridMobilList+ GridModel("Mobilio", R.drawable.foto5,"Rp. 1.200.000.000","Toyota Sumbar")
        gridMobilList= gridMobilList+ GridModel("Pajero", R.drawable.foto6,"Rp. 1.600.000.000","X Toyota")
        gridMobilList= gridMobilList+ GridModel("X Pander", R.drawable.foto7,"Rp. 800.000.000","Toyota Bukittinggi")
        gridMobilList= gridMobilList+ GridModel("BMW", R.drawable.foto8,"Rp. 3.000.000.000","Bagus Dealer")
        gridMobilList= gridMobilList+ GridModel("Mezzanti", R.drawable.foto9,"Rp. 600.000.000","Efel Dealer")
        gridMobilList= gridMobilList+ GridModel("Toyota", R.drawable.foto10,"Rp. 5000.000.000","Bisa Dealer")

        val gridMobilAdapter= GridAdapter(gridMobilList,this )
        gridView.adapter= gridMobilAdapter
        gridView.onItemClickListener= AdapterView.OnItemClickListener{ adapterView, view, i, l ->
            Toast.makeText(applicationContext, "Pilihan Mobil Anda : "+gridMobilList[i].name,
                Toast.LENGTH_LONG).show()
        }
    }
}