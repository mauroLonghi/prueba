package com.example.myapplication.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.R;

 class RecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

     private var items = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent.context.inflate(R.layout.items_card))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var listItems = items[position]
        holder.

    }

    override fun getItemCount() = items.size

     fun setList(listOfNumber: List<String>) {
         this.items = listOfNumber
         notifyDataSetChanged()
     }
        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


            fun bind(item: String, listener: (String) -> Unit) = with(itemView) {
                //itemTitle.text = item.title
                //itemImage.loadUrl(item.url)
                setOnClickListener { listener(item) }
            }
        }

}
