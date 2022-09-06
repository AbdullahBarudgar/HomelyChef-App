package com.abdullah_barudgar.HomelyChef.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.widget.Toolbar
import com.abdullah_barudgar.HomelyChef.R

class ChefActivity : AppCompatActivity() {

    lateinit var txtChefName1 : TextView
    lateinit var txtChefDescription : TextView
    lateinit var imgChefImage1: ImageView
    lateinit var progressLayout1: RelativeLayout
    lateinit var progressBar1: ProgressBar
    lateinit var toolBarChef: Toolbar

    var chef_id : String = "0"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chef)

        txtChefName1 =findViewById(R.id.txtChefName1)
        imgChefImage1=findViewById(R.id.imgChefImage1)
        txtChefDescription =findViewById(R.id.txtChefDescription)

        progressBar1= findViewById(R.id.progressBar1)
        progressBar1.visibility= View.VISIBLE
        progressLayout1= findViewById(R.id.progressLayout1)
        progressLayout1.visibility= View.VISIBLE

        toolBarChef =findViewById(R.id.toolbarChef)
        setSupportActionBar(toolBarChef)
        supportActionBar?.title ="Chef Description"


          if(intent != null){
              progressLayout1.visibility = View.GONE
              chef_id = intent.getStringExtra("chef_id").toString()
          }
          else{
              finish()
              Toast.makeText(this@ChefActivity , " Some Error is Occured" , Toast.LENGTH_SHORT).show()

          }

        if(chef_id == "0"){
            finish()
            Toast.makeText(this@ChefActivity, " Some Error is Occured" , Toast.LENGTH_SHORT).show()
        }

         when(chef_id){

         "1" -> {
             txtChefName1.text = "Huzaif Akhtar"
             imgChefImage1.setImageResource(R.drawable.chef1)
             txtChefDescription.text = getString(R.string.huzaif_akhtar)

         }

             "2" -> {
                 txtChefName1.text = "Firoz Ansari"
                 imgChefImage1.setImageResource(R.drawable.chef2)
                 txtChefDescription.text = getString(R.string.firoz_ansari)

             }

             "3" -> {
                 txtChefName1.text = "Aryan Parashar"
                 imgChefImage1.setImageResource(R.drawable.chef3)
                 txtChefDescription.text = getString(R.string.aryan_parashar)

             }

             "4" -> {
                 txtChefName1.text = "Sahil Kumar"
                 imgChefImage1.setImageResource(R.drawable.chef4)
                 txtChefDescription.text = getString(R.string.sahil_kumar)

             }

             "5" -> {
                 txtChefName1.text = "Gayatri"
                 imgChefImage1.setImageResource(R.drawable.chef5)
                 txtChefDescription.text = getString(R.string.gayatri)

             }

             "6" -> {
                 txtChefName1.text = "Arushi Gupta"
                 imgChefImage1.setImageResource(R.drawable.chef6)
                 txtChefDescription.text = getString(R.string.arushi_gupta)

             }

             "7" -> {
                 txtChefName1.text = "Fiza Khan"
                 imgChefImage1.setImageResource(R.drawable.chef7)
                 txtChefDescription.text = getString(R.string.fiza_khan)

             }

             "8" -> {
                 txtChefName1.text = "Arif Rasul Khan"
                 imgChefImage1.setImageResource(R.drawable.chef8)
                 txtChefDescription.text = getString(R.string.arif_rasul_khan)

             }

             "9" -> {
                 txtChefName1.text = "Faisal Ahmed Khan"
                 imgChefImage1.setImageResource(R.drawable.chef9)
                 txtChefDescription.text = getString(R.string.faisal_ahmed_khan)

             }

             "10" -> {
                 txtChefName1.text = "Alina Raza"
                 imgChefImage1.setImageResource(R.drawable.chef10)
                 txtChefDescription.text = getString(R.string.alina_raza)

             }

             "11" -> {
                 txtChefName1.text = "Khushi Gupta"
                 imgChefImage1.setImageResource(R.drawable.chef11)
                 txtChefDescription.text = getString(R.string.khushi_gupta)

             }

             "12" -> {
                 txtChefName1.text = "Abdullah Shahid"
                 imgChefImage1.setImageResource(R.drawable.chef12)
                 txtChefDescription.text = getString(R.string.abdullah_shahid)

             }

             "13" -> {
                 txtChefName1.text = "Ali Zafar"
                 imgChefImage1.setImageResource(R.drawable.chef13)
                 txtChefDescription.text = getString(R.string.ali_zafar)

             }

             "14" -> {
                 txtChefName1.text = "Iram Nagmi"
                 imgChefImage1.setImageResource(R.drawable.chef14)
                 txtChefDescription.text = getString(R.string.iram_nagmi)

             }

             "15" -> {
                 txtChefName1.text = "Riya Sharma"
                 imgChefImage1.setImageResource(R.drawable.chef15)
                 txtChefDescription.text = getString(R.string.riya_sharma)

             }

             "16" -> {
                 txtChefName1.text = "Faraz Ahmed"
                 imgChefImage1.setImageResource(R.drawable.chef16)
                 txtChefDescription.text = getString(R.string.faraz_ahmed)

             }


             "17" -> {
                 txtChefName1.text = "Faraz Nasir"
                 imgChefImage1.setImageResource(R.drawable.chef17)
                 txtChefDescription.text = getString(R.string.faraz_nasir)

             }

         }

         }
    }
