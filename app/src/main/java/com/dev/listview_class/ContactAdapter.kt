package com.dev.listview_class


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet

class ContactAdapter(context: Context,contacts: Array<Contact>): ArrayAdapter<Contact>(context,0,contacts) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null){
            listItemView = LayoutInflater.from(context).inflate(R.layout.single_item,parent,false)
        }
        val currentContact = getItem(position)

        val nameTextView = listItemView.findViewById<TextView>(R.id.text_name)
        val phoneTextView = listItemView.findViewById<TextView>(R.id.text_mobile_no)

        nameTextView.text = currentContact?.name

        phoneTextView.text = currentContact?.phone

        return listItemView
    }
}