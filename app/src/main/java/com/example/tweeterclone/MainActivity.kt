package com.example.tweeterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
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
        var tweet1 = Tweets("", "Verite", "@vee", "1 m", "I love Kotlin","13","20","40","28")
        var tweet2 = Tweets("", "Judy", "@judy", "13 m", "I love Kotlin","13","22","30","18")
        var tweet3 = Tweets("", "Benadate", "@bena", "21 m", "I love Kotlin","13","20","30","18")
        var tweet4 = Tweets("", "Zipporah", "@zippy", "1 m", "I love Kotlin","13","20","4","18")
        var tweet5 = Tweets("", "Shamim", "@shamzo", "31 m", "I love Kotlin","13","20","30","18")
        var tweet6 = Tweets("", "Salma", "@soul", "14 m", "I love Kotlin","13","8","30","18")
        var tweet7 = Tweets("", "Kirigo", "@Kiki", "10 m", "I love Kotlin","23","20","30","18")
        var tweet8 = Tweets("", "Rosemary", "@rose", "8 m", "I love Kotlin","13","23","30","18")
        var tweet9 = Tweets("", "Zuena", "@zurich", "12 m", "I love Kotlin","13","20","32","18")
        var tweet10 = Tweets("", "Pascaline", "@paccy", "23 m", "I love Kotlin","13","20","30","18")
        var tweetList = listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9,tweet10)
        var tweetAdapter = TweeterRvAdapter(tweetList)
        binding.rvTweet.layoutManager = LinearLayoutManager(this)
        binding.rvTweet.adapter = tweetAdapter
    }
}