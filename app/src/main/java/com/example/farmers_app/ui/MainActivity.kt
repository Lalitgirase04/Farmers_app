package com.example.farmers_app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.farmers_app.R
import com.example.farmers_app.databinding.ActivityMainBinding
import com.example.farmers_app.post
import com.example.farmers_app.postAdapter
import com.example.farmers_app.ui.Fragments.ChatForum
import com.example.farmers_app.ui.Fragments.CreatePost
import com.example.farmers_app.ui.Fragments.MainFeed
import com.example.farmers_app.ui.Fragments.ProblemDiscussion
import com.example.farmers_app.ui.Fragments.UserProfile


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(MainFeed())
        binding.bottomNavigationView.setOnItemReselectedListener {
            when(it.itemId){

                R.id.mainFe -> replaceFragment(MainFeed())
                R.id.userpro -> replaceFragment(UserProfile())
                R.id.problemdis -> replaceFragment(ProblemDiscussion())
                R.id.creatpo -> replaceFragment(CreatePost())
                R.id.chatfor -> replaceFragment(ChatForum())

                else ->{

                }
            }
            true
        }

        /*   val postObject : MutableList<post> = mutableListOf<post>()
          postObject.add(post(1,"Ajit pawar","Farmer","A \"post\" for a farmer could refer to an announcement or update shared on a farming community forum, discussing crop yields or agricultural techniques.",R.drawable.preccrop))
          postObject.add(post(2,"Ajit gokhle","Farmer","n agricultural social media platforms, a \"post\" by a farmer might showcase photos of their livestock or recent harvest, along with insights into their farming practices.",R.drawable.preccrop))
          postObject.add(post(3,"Ajit shinde","Farmer","Within a farming app, a \"post\" could be a message from a farmer seeking advice on pest control methods or seeking to buy/sell agricultural equipment.",R.drawable.preccrop))
          postObject.add(post(4,"Ajit rao","Farmer","On a farming blog, a \"post\" authored by a farmer may detail their experiences with sustainable farming practices or document challenges faced in rural life.",R.drawable.preccrop))

                  val Recycler = findViewById<RecyclerView>(R.id.recycler)
                  Recycler.adapter = postAdapter(postObject)
                  Recycler.layoutManager = LinearLayoutManager(this)
               */
    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelay,fragment)
        fragmentTransaction.commit()
    }
}