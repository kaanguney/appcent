package com.example.appcent2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.speaker_layout.view.*
import kotlin.collections.ArrayList

class SpeakerRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val TAG: String = "AppDebug"

    private var items: List<Speaker> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SpeakerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.speaker_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is SpeakerViewHolder -> {
                holder.bind(items.get(position))
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(speakerList: List<Speaker>){
        items = speakerList
    }

    class SpeakerViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val speaker_image = itemView.speaker_image
        val speaker_name = itemView.speaker_name

        fun bind(Speaker: Speaker){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(Speaker.image)
                .into(speaker_image)
            speaker_name.setText(Speaker.username)
        }

    }

}