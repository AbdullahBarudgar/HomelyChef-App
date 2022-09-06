package com.abdullah_barudgar.HomelyChef.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abdullah_barudgar.HomelyChef.R
import com.abdullah_barudgar.HomelyChef.activity.ChefActivity
import com.abdullah_barudgar.HomelyChef.model.ChefDetails
import com.squareup.picasso.Picasso

class AllChefAdapter(val context : Context ,val chefList : ArrayList<ChefDetails>) : RecyclerView.Adapter<AllChefAdapter.AllChefViewHolder>() {


    class AllChefViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val txtChefName : TextView =view.findViewById(R.id.txtChefName)
        val txtChefRes : TextView =view.findViewById(R.id.txtChefRestaurantName)
        val txtChefMobile : TextView =view.findViewById(R.id.txtChefMobileNumber)
        val txtChefAddress : TextView = view.findViewById(R.id.txtChefAddress)
        val imgChef : ImageView =view.findViewById(R.id.imgChefImage)
        val linearLayout : LinearLayout = view.findViewById(R.id.linearLayoutChef)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllChefViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.chefs_custom_single_row,parent,false)
        return AllChefViewHolder(view)
    }

    override fun onBindViewHolder(holder: AllChefViewHolder, position: Int) {

    val chef = chefList[position]
    holder.txtChefName.text= chef.chefName
        holder.txtChefRes.text= chef.chefResName
        holder.txtChefMobile.text= chef.mobileNum
        holder.txtChefAddress.text=chef.chefAddress

        Picasso.get().load(chef.chefImage).error(R.drawable.homely_chef_logo_img).into(holder.imgChef)

        holder.linearLayout.setOnClickListener {

        val intent = Intent(context,ChefActivity::class.java)
            intent.putExtra("chef_id" ,chef.chefId)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {

        return chefList.size
    }



}

