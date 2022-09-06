package com.abdullah_barudgar.HomelyChef.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abdullah_barudgar.HomelyChef.R
import com.abdullah_barudgar.HomelyChef.adapter.AllChefAdapter
import com.abdullah_barudgar.HomelyChef.model.ChefDetails


class AboutChefs : Fragment() {


    lateinit var chefRecycler : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recylerAdapter: AllChefAdapter



         val chefInfoList = arrayListOf<ChefDetails>(

        ChefDetails("1","Huzaif Akhtar" , "Pind Tadka" ,"9000000001",R.drawable.chef1,"Home-Restaurant@ A-109,Main Road, Kalkaji, Delhi - 110019, Near HDFC Bank"),
        ChefDetails("2","Firoz Ansari" ,  "Garbar Burgers" ,"9000000002",R.drawable.chef2,"Home-Restaurant@ Khasra No.70, Near Pandey Water Supplier,, IGNOU Main Rd,New Delhi-110068"),
        ChefDetails("3","Aryan Parashar" , "Baco Tell" ,"9000000003",R.drawable.chef3,"Home-Restaurant@ Gali No. 6 6/98, 2nd floor, Madangir, DDA Flats, Market, Delhi 110062"),
        ChefDetails("4","Sahil Kumar" , "Heera Mahal" ,"9000000004",R.drawable.chef4,"Home-Restaurant@ Block B, Block E, Malviya Nagar, New Delhi, Delhi 110017"),
        ChefDetails("5","Gayatri" , "Smokin' Chik" ,"9000000005", R.drawable.chef5,"Home-Restaurant@ Landmark 69,opp. HP Petrol Pump, VB, Virender Nagar, Janakpuri, New Delhi,110058"),
        ChefDetails("6","Arushi Gupta" , "Swirley Shack" ,"9000000006",R.drawable.chef6,"Home-Restaurant@ Pramod Mahajan Marg, Block A, Block D, Saket, New Delhi, Delhi 110017"),
        ChefDetails("7","Fiza Khan" , "Dominoe's Bread" ,"9000000007",R.drawable.chef7,"Home-Restaurant@ F-19, Block, F, Connaught Cir, Block F, Connaught Place, New Delhi, Delhi 110001"),
        ChefDetails("8","Arif Rasul Khan" , "Everything But Food" ,"9000000008",R.drawable.chef8,"Home-Restaurant@ 33, School Rd, Khanpur Village, Khanpur, New Delhi, Delhi 110062"),
        ChefDetails("9","Faisal Ahmed Khan" , "LFC" ,"9000000009",R.drawable.chef9,"Home-Restaurant@ Indu Tiffin Service, 15/169, near Virat cinema, Dr.Ambedkar Nagar, Dakshinpuri, New Delhi, 110062"),
        ChefDetails("10","Alina Raza" , "Central Terk" ,"9000000010",R.drawable.chef10,"Home-Restaurant@ A1-8/286, Air India Colony, Indian Air Lines & Air India Estate, Vasant Vihar, New Delhi,110057"),
        ChefDetails("11","Khushi Gupta" , "Mitti Ke Sandwiches" ,"9000000011",R.drawable.chef11,"Home-Restaurant@ G5GV+M33, Campa Cola Gali, Chatri Wala Kuan, Lado Sarai, New Delhi, Delhi 110030"),
        ChefDetails("12","Abdullah Shahid","Pizza Put","9000000012",R.drawable.chef12,"Home-Restaurant@ 47/9 Dr Gupta flat, 3rd floor, flt no 308,kishan garh, vasant kunj delhi, New Delhi, Delhi 110070"),
        ChefDetails("13","Ali Zafar" , "Burger Jack" ,"9000000013",R.drawable.chef13,"Home-Restaurant@ 2596, 2597, Nai Sarak Marg, Raghu Ganj, Roshanpura, Chandni Chowk, New Delhi, Delhi 110006"),
        ChefDetails("14","Iram Nagmi" , "Rotten Tomatoes" ,"9000000014",R.drawable.chef14,"Home-Restaurant@ Tilak Bazar, Fatak, Khari Baoli, Old Delhi, Delhi, 110006"),
        ChefDetails("15","Riya Sharma" , "NcDonald's" ,"9000000015",R.drawable.chef15,"Home-Restaurant@ 1411-1426, Nicholson Rd, Inter State Bus Terminal, Kashmere Gate, New Delhi, Delhi 110006"),
        ChefDetails("16","Faraz Ahmed" , "Askin'Poppins" ,"9000000016",R.drawable.chef16,"Home-Restaurant@ Channa Market, Block A, Rajendra Park, Karol Bagh, New Delhi, Delhi 110005"),
        ChefDetails("17","Faraz Nasir" , "Baasa Menu" ,"9000000017",R.drawable.chef17,"Home-Restaurant@ 4th floor, 2057, Gali Number 6, near Hotel Le Roi, Chuna Mandi, Paharganj, New Delhi, Delhi 110055")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val  view = inflater.inflate(R.layout.fragment_about_chefs, container, false)



        chefRecycler =view.findViewById(R.id.chefRecycler)
        layoutManager = LinearLayoutManager(activity)

        recylerAdapter = AllChefAdapter(activity as Context ,chefInfoList )

        chefRecycler.adapter=recylerAdapter
        chefRecycler.layoutManager= layoutManager


        return view
    }



            }

