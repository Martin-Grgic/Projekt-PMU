package com.example.projectpmu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.projectpmu.databinding.ActivityMainBinding
import com.example.projectpmu.databinding.ActivitySilaElPoljaBinding

class SilaElPolja : AppCompatActivity() {
    lateinit var binding: ActivitySilaElPoljaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sila_el_polja)

        binding=ActivitySilaElPoljaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Izracunaj.setOnClickListener {
            val q1 = binding.Naboj1Unos.text.toString().toDouble()
            val q2 = binding.Naboj2Unos.text.toString().toDouble()
            val r = binding.UdaljenostUnos.text.toString().toDouble()
            val k = 9 * Math.pow(10.0, 9.0)

            val rez = k * ((q1 * q2) / Math.pow(r, 2.0))

            binding.RezultatSilaIspis.setText(rez.toString())
        }

        binding.Natrag.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}