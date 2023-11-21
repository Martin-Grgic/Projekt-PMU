package com.example.projectpmu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectpmu.databinding.ActivityMainBinding
import com.example.projectpmu.databinding.ActivityPotencijalnaEnergijaBinding

class PotencijalnaEnergija : AppCompatActivity() {
    lateinit var binding: ActivityPotencijalnaEnergijaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_potencijalna_energija)

        binding = ActivityPotencijalnaEnergijaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.IzracunajPotenc.setOnClickListener {

            val m = binding.MasaUnos.text.toString().toDouble()
            val h = binding.VisinaUnos.text.toString().toDouble()
            val g = 9.81

            val rez =m * g * h

            binding.RezultatPotencIspis.setText(rez.toString())
        }

        binding.NatragPotenc.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}