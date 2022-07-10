package com.example.tweeterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tweeterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweet()
    }
    fun displayTweet(){
        var tweet1 = Tweets("", "121212", "ver@gmail.com", "AB1", "")
        var tweet2 = Tweets("", "232323", "rea@gmail.com", "AB2", "")
        var tweet3 = Tweets("", "343434", "pur@gmail.com", "AB3", "")
        var tweet4 = Tweets("", "454545", "tri@gmail.com", "AB4", "")
        var tweet5 = Tweets("", "565656", "pol@gmail.com", "AB5", "")
        var tweet6 = Tweets("", "565656", "pol@gmail.com", "AB5", "")
        var tweet7 = Tweets("", "565656", "pol@gmail.com", "AB5", "")
        var tweet8 = Tweets("", "565656", "pol@gmail.com", "AB5", "")
        var tweet9 = Tweets("", "565656", "pol@gmail.com", "AB5", "")
        var tweet10 = Tweets("", "565656", "pol@gmail.com", "AB5", "")
        var tweetList = listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9,tweet10)
        var tweetAdapter = TweeterRvAdapter(tweetList)
        binding.rvTweet.layoutManager = LinearLayoutManager(this)
        binding.rvTweet.adapter = tweetAdapter
    }
}