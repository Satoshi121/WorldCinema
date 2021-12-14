package com.example.worldcinema

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.worldcinema.databinding.ImageItemBinding

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ItemHolder>() {
    val itemList = ArrayList<Item>()

    class ItemHolder (image: View) : RecyclerView.ViewHolder(image){
        val binding = ImageItemBinding.bind(image)
        fun bind(item: Item) = with(binding){
            imgItem.setImageResource(item.ImageId)
            tvItem.text = item.title
        }





}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false)
        return ItemHolder(view)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(itemList[position])

    }

    override fun getItemCount(): Int {
        return itemList.size
        fun addAll(list: List<Item>){
            itemList.clear()
            itemList.addAll(list)
            notifyDataSetChanged()
        }
    }

}
