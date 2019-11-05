package com.example.tapcontestpractise.ui.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.tapcontestpractise.BR
import com.example.tapcontestpractise.data.ContestModel
import com.example.tapcontestpractise.data.CustomViewModel


class CustomAdapter(private val listContest: List<CustomViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getBinding().setVariable(BR.group, listContest[position])
        holder.getBinding().executePendingBindings()
    }


    class ViewHolder(private val bind: ViewDataBinding) : RecyclerView.ViewHolder(bind.root) {

        fun getBinding(): ViewDataBinding {
            return bind
        }
    }

    override fun getItemViewType(position: Int): Int {
        return listContest[position].layoutIdentifier
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val bind = DataBindingUtil.inflate<ViewDataBinding>(LayoutInflater.from(parent.context),viewType,parent,false)
        return ViewHolder(bind)
    }

    override fun getItemCount(): Int {
        return listContest.size
    }



}
