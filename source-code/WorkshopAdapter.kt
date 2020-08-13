package com.example.appcent2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.workshops_layout.view.*
import kotlin.collections.ArrayList

class WorkshopsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val TAG: String = "AppDebug"

    private var items: List<Workshops> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return WorkshopsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.workshops_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is WorkshopsViewHolder -> {
                holder.bind(items.get(position))
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitWorkshop(WorkshopsList: List<Workshops>){
        items = WorkshopsList
    }

    class WorkshopsViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val person_image = itemView.person_image
        val workshop_name = itemView.workshop_name

        fun bind(Workshops: Workshops){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(Workshops.person_image)
                .into(person_image)
            workshop_name.setText(Workshops.workshop_name)
        }

    }
}
