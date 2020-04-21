package com.example.randotracker.adapter

import android.content.Context
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.randotracker.COLUMNS
import com.example.randotracker.R
import com.example.randotracker.data.Trackable
import com.example.randotracker.data.TrackableMode
import kotlinx.android.synthetic.main.image_item.view.*

class TrackerAdapter(private val dataset: ArrayList<Trackable>, val context: Context) : RecyclerView.Adapter<TrackerAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imageButton = view.image_item
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        // create a new view
        val imageButton = LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false)
        return ViewHolder(imageButton)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val img = holder.imageButton
        img.setImageDrawable(ContextCompat.getDrawable(context, dataset[position].drawable))
        val matrix = ColorMatrix()
        matrix.setSaturation(0f)
        val filter = ColorMatrixColorFilter(matrix)
        img.colorFilter = filter
//        img.layoutParams = ConstraintLayout.LayoutParams(15, 0)
        img.layoutParams.width = calculateSizeOfView(context)
        img.setOnClickListener{
            when(dataset[position].mode) {
                TrackableMode.TOGGLE -> if (img.colorFilter === null)  img.colorFilter = filter else img.clearColorFilter()
                TrackableMode.PROGRESSIVE -> if (img.colorFilter != null)  img.clearColorFilter() else img.setImageDrawable(ContextCompat.getDrawable(context, dataset[position].getNextProgressive()))
            }

        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataset.size

    fun calculateSizeOfView(context: Context): Int {

        val displayMetrics = context.resources.displayMetrics
        val dpWidth = displayMetrics.widthPixels
        return ((dpWidth / COLUMNS) - 20)
    }
}