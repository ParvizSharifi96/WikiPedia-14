package com.example.wikipedia_14

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import cn.pedant.SweetAlert.SweetAlertDialog
import com.example.wikipedia_14.databinding.ActivityMainBinding
import com.example.wikipedia_14.fragments.FragmentExplore
import com.example.wikipedia_14.fragments.FragmentPhotographer
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

                    val dialog = SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                    dialog.titleText = "Alert!"
                    dialog.confirmText = "Confirm"
                    dialog.cancelText = "Cancel"
                    dialog.contentText = "Wanna be a Writer?"
                    dialog.setCancelClickListener {
                        dialog.dismiss()
                    }
                    dialog.setConfirmClickListener {
                        dialog.dismiss()
                       openWebsite("https://www.pixpa.com/blog/how-to-become-a-professional-photographer")
                    }
                    dialog.show()

                }

                R.id.menu_photograph -> {
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)

                    // load fragment =>
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.add(R.id.frame_main_container, FragmentPhotographer())
                    transaction.addToBackStack(null)
                    transaction.commit()

                    // check menu item =>
                    binding.navigationViewMain.menu.getItem(1).isChecked = true

                    // close drawer =>
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)


                }

                R.id.menu_vieo_maker -> {
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)

                    Snackbar
                        .make(binding.root, "No Internet!", Snackbar.LENGTH_LONG)
                        .setAction("Retry") {
                            Toast.makeText(this, "checking network", Toast.LENGTH_SHORT).show()
                        }
                        .setActionTextColor(ContextCompat.getColor(this, R.color.white))
                        .setBackgroundTint(ContextCompat.getColor(this, R.color.blue))
                        .show()


                }

                R.id.menu_translator -> {
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)
                    // open an activity =>
                    val intent = Intent(this, MainActivity3::class.java)
                    startActivity(intent)


                }

                // ---------------------------------

                R.id.menu_open_wikipedia -> {
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)

                    openWebsite("https://www.wikipedia.org/")

                }

                R.id.openWikimedia -> {
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)
                    openWebsite("https://www.wikimedia.org/")


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

    override fun onBackPressed() {
        super.onBackPressed()

        // check menu item off =>
        binding.navigationViewMain.menu.getItem(1).isChecked = false

    }
    private fun openWebsite(url: String) {

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate( R.menu.menu_main , menu )
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_exit -> {
                onBackPressed()
            }
        }
        return true
    }



}
