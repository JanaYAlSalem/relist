package com.example.relist.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.relist.model.af // need to import af class
import com.example.relist.R

class ItemAdapter(private val context: Context,
                  private val dataset: List<af>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
{ // Start ItemAdapter abstract class with 3 funs ->hava a ItemViewHolder class


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title) // place of text on list item
        val imgView: ImageView = view.findViewById(R.id.item_image) // place of img on list item



    } // end ItemViewHolder :in line on ItemAdapter class


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view:ItemViewHolder and return it on ****
        // view called a adapterLayout which is get from parent to list_item layout
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // item is a af(the type of list) datatype
        // the holder is will be show on the screen
        val item = dataset[position]
        // textView -> initializes on ItemViewHolder class, stringResourceId is a constructor on af class
        holder.textView.setText( context.resources.getString(item.stringResourceId))
        // imgView -> initializes on ItemViewHolder class, imgResourceId is a constructor on af class
        holder.imgView.setImageResource(item.imgResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size // dataset is initializes on ItemAdapter(constructor:type)
    }

} // end class ItemAdapter