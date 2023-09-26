package edu.temple.simplerecyclerview

import android.app.ActionBar.LayoutParams
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()/* Step 3a: Provide Adapter Parent */ {

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        TODO()
    }


    override fun getItemCount(): Int {
        TODO()
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        TODO()
    }

    //Step 3b: Complete function definitions for adapter


}