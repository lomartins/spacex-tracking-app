package br.com.hackerman.spacextracking

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import br.com.hackerman.spacextracking.domain.model.Launch
import br.com.hackerman.spacextracking.network.data.repository.api.LaunchesApiHelper
import com.bumptech.glide.Glide
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        imageView = findViewById(R.id.imageView)
        button.setOnClickListener {
            getLaunch()
        }


    }

    fun getLaunch() {
        GlobalScope.launch(Dispatchers.IO) {
            val request = LaunchesApiHelper.getLatest().execute()
            if (request.isSuccessful) {
                val launch = request.body() as Launch
                val url = launch.links.flickr.original[0]
                withContext(Dispatchers.Main) {
                    setImage(url)
                }
            }

        }
    }

    private fun setImage(url: String) {
        Glide.with(this).load(url).into(imageView)
    }
}