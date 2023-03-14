package com.example.databasesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var _cocktailId = -1
    private var _cocktailName = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lvCocktail = findViewById<ListView>(R.id.lvCocktail)
        lvCocktail.onItemClickListener = ListenItemClickListener()
    }

    fun onSaveButtonClick(view: View){
        val etNote = findViewById<EditText>(R.id.etNote)
        etNote.setText("")
        val tvCocktailName = findViewById<TextView>(R.id.tvCocktailName)
        tvCocktailName.text = getString(R.string.tv_name)
        val btnSave = findViewById<Button>(R.id.btnSave)
        btnSave.isEnabled = false
    }
}