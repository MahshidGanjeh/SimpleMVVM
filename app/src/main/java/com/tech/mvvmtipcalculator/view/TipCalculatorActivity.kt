package com.tech.mvvmtipcalculator.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import com.tech.mvvmtipcalculator.R
import com.tech.mvvmtipcalculator.viewmodel.TipCalculatorViewModel

import kotlinx.android.synthetic.main.activity_tip_calculator.*

class TipCalculatorActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: com.tech.mvvmtipcalculator.databinding.ActivityTipCalculatorBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_tip_calculator)


        binding.vm = TipCalculatorViewModel()

        setSupportActionBar(binding.toolbar)

        /*fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }*/
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
