package com.example.wikipedia_14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.wikipedia_14.databinding.ActivityMainBinding
import com.example.wikipedia_14.fragments.FragmentExplore
import com.example.wikipedia_14.fragments.FragmentProfile
import com.example.wikipedia_14.fragments.FragmentTrend
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarMain)


        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayoutMain,
            binding.toolbarMain,
            R.string.openDrawer,
            R.string.closeDrawer
        )
        binding.drawerLayoutMain.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()


        binding.navigationViewMain.setNavigationItemSelectedListener {

            when (it.itemId) {

                R.id.menu_writer -> {
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)


                }

                R.id.menu_photograph -> {


                }

                R.id.menu_vieo_maker -> {

                }

                R.id.menu_translator -> {


                }

                // ---------------------------------

                R.id.menu_open_wikipedia -> {



                }

                R.id.openWikimedia -> {

                }

            }

            true
        }

        firstRun()

        binding.bottomNavigationMain.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.menu_explore -> {
                    replaceFragment(FragmentExplore())
                }

                R.id.menu_trend -> {
                    replaceFragment(FragmentTrend())
                }

                R.id.menu_profile -> {
                    replaceFragment(FragmentProfile())
                }
            }

            // check menu item off =>
            binding.navigationViewMain.menu.getItem(1).isChecked = false

            true
        }
        binding.bottomNavigationMain.setOnItemReselectedListener {}


    }
    private fun replaceFragment(fragment: Fragment) {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_main_container, fragment)
        transaction.commit()

    }

    private fun firstRun() {

        replaceFragment(FragmentExplore())
        binding.bottomNavigationMain.selectedItemId = R.id.menu_explore

    }


}
