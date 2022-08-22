package com.example.lab6moviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_nav)

        bottomNav = findViewById(R.id.bottomNavigationView)
        setCurrentFragment(HomeFragment())
        setListeners()
    }

    private fun setListeners() {
        bottomNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.item_home -> setCurrentFragment(HomeFragment())
                R.id.item_search -> setCurrentFragment(SearchFragment())
                R.id.item_library -> setCurrentFragment(LibraryFragment())
            }
            true
        }
    }

    /**
     * Función que reemplaza el fragment actual. No usamos backstack porque
     * para este tipo de navegación, no es el comportamiento esperado.
     */
    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.frameLayout, fragment)
        }
    }
}