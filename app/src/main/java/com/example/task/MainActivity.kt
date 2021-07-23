package com.example.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.txtBirthDate.setOnClickListener {
            val datePickerBottomSheetFragment = DatePickerBottomSheetFragment().newInstance()

            datePickerBottomSheetFragment.show(
                supportFragmentManager,
                "mobile_or_addd_bottomsheet"
            )
        }


    }
}