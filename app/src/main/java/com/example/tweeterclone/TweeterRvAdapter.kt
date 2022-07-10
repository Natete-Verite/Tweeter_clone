package com.example.tweeterclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweeterRvAdapter (var tweetList: List<Tweets>):
RecyclerView.Adapter<TweeterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweeterViewHolder {
       var itemView = LayoutInflater.from(parent.context)
           .inflate(R.layout.tweet_item, parent, false)
        return TweeterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweeterViewHolder, position: Int) {
        var currentTweet = tweetList.get(position)
        holder.tvUsername.text = currentTweet.username
        holder.tvTime.text = currentTweet.time
        holder.tvMessage.text = currentTweet.message
        holder.tvComment.text = currentTweet.comment
        holder.tvRetweet.text = currentTweet.retweet
        holder.tvLikes.text = currentTweet.likes
        holder.tvShare.text = currentTweet.share
    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}
class TweeterViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvUsername = itemView.findViewById<TextView>(R.id.tvUsername)
    var tvTime = itemView.findViewById<TextView>(R.id.tvTime)
    var tvComment = itemView.findViewById<TextView>(R.id.tvComment)
    var tvRetweet= itemView.findViewById<TextView>(R.id.tvRetweet)
    var tvLikes = itemView.findViewById<TextView>(R.id.tvLikes)
    var tvShare = itemView.findViewById<TextView>(R.id.tvShare)
    var tvMessage = itemView.findViewById<TextView>(R.id.tvMessage)
    var ivLike = itemView.findViewById<TextView>(R.id.ivLike)
    var ivComment = itemView.findViewById<TextView>(R.id.ivComment)
    var ivRetweet = itemView.findViewById<TextView>(R.id.ivRetweet)
    var ivShare = itemView.findViewById<TextView>(R.id.ivShare)
    var ivPerson = itemView.findViewById<TextView>(R.id.ivPerson)
}