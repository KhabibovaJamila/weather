package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.weather.databinding.ActivityMainBinding

const val API_KEY = "0f0736698dce4ceaae8191553231610&q"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.GET.setOnClickListener {
            getResult("London")

        }

    }
    private fun getResult(name: String) {
      val  url = "https://api.weatherapi.com/v1/current.json" +
              "?key=$API_KEY=$name=no"
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(Request.Method.GET,
         url,
            {
                    response->
                Log.d("MyLog", "Response $response")

            },
            {
                 Log.d("MyLog", "Volley error $it")
            }
        )
        queue.add(stringRequest)
    }
}