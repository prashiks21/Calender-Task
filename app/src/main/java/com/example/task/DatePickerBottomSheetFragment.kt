package com.example.task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.task.databinding.FragmentDatePickerBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class DatePickerBottomSheetFragment : BottomSheetDialogFragment() {

    lateinit var datePickerBottomSheetBinding: FragmentDatePickerBottomSheetBinding
    lateinit var view1: View

    fun newInstance(): DatePickerBottomSheetFragment {
        return DatePickerBottomSheetFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        datePickerBottomSheetBinding =FragmentDatePickerBottomSheetBinding.inflate(layoutInflater)
        view1 = datePickerBottomSheetBinding.root

        datePickerBottomSheetBinding.relMonth.setOnClickListener {
            datePickerBottomSheetBinding.tabIncatorMonth.visibility = View.VISIBLE
            datePickerBottomSheetBinding.tabIncatorYear.visibility = View.GONE


            datePickerBottomSheetBinding.relDatePicker.visibility = View.VISIBLE
        }

        datePickerBottomSheetBinding.relYear.setOnClickListener {
            datePickerBottomSheetBinding.tabIncatorYear.visibility = View.VISIBLE
            datePickerBottomSheetBinding.tabIncatorMonth.visibility = View.GONE

//            datePickerBottomSheetBinding.relDatePicker.visibility = View.GONE

        }




        return view1
    }

}