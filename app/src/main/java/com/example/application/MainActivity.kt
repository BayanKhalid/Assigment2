package com.example.application


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = FirstFragement()
        val secondFragment = SecondFragment()
        val fragment1: Button = findViewById(R.id.fragment1)
        val fragment2: Button = findViewById(R.id.fragment2)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainframe1, firstFragment)
            commit()
        }
        fragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainframe1, firstFragment)
                commit()
            }
        }
        fragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainframe1, secondFragment)
                commit()
            }
        }}
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.first_menu, menu)
        return super.onCreateOptionsMenu(menu)}
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.item1 -> Toast.makeText(this, "item 1 selected", Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this, "item 2 selected", Toast.LENGTH_SHORT).show()
            R.id.item3 -> Toast.makeText(this, "Sub-item 1 selected", Toast.LENGTH_SHORT).show()
            R.id.item4-> Toast.makeText(this, "Bus", Toast.LENGTH_SHORT).show()
            R.id.item5-> Toast.makeText(this, "Box", Toast.LENGTH_SHORT).show()
        }
        return true;
    }


}