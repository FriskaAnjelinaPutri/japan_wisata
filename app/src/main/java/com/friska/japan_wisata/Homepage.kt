package com.friska.japan_wisata

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.friska.japan_wisata.Adapter.DestinationAdapter
import com.friska.japan_wisata.Model.DestinationModel

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)

        val recyclerViewDestination = findViewById<RecyclerView>(R.id.recyclerViewDestination)

        val destinations = listOf(
            DestinationModel("Sensoji Temple", "Asakusa", R.drawable.image2, "24 Agustus 2024"),
            DestinationModel("Temple", "Tokyo", R.drawable.image1, "25 Agustus 2024"),
            DestinationModel("Sensoji Temple", "GunungFuji", R.drawable.gunungfuji, "26 Agustus 2024"),
            DestinationModel("Temple", "TokyoTower", R.drawable.tokyotower, "27 Agustus 2024"),
            DestinationModel("Sensoji Temple", "Honshu", R.drawable.honshu, "28 Agustus 2024"),
            DestinationModel("Temple", "Hakone", R.drawable.hakone, "29 Agustus 2024")

        )

        recyclerViewDestination.layoutManager = GridLayoutManager(this, 2)
        recyclerViewDestination.adapter = DestinationAdapter(destinations)
    }

}

