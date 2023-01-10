package com.example.imageproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0
        val listOfPict = mutableListOf<String>(
            "https://picfiles.alphacoders.com/340/340634.jpg",
            "https://mobimg.b-cdn.net/v3/fetch/15/1518db9e8ea14417912075eab35b87ea.jpeg",
            "https://i.pinimg.com/originals/f9/6d/1f/f96d1ff46bf1b1466bcf805e5fa461bd.jpg",
            "https://phonoteka.org/uploads/posts/2021-07/1625190533_38-phonoteka-org-p-zastavka-rossiya-krasivie-zastavki-43.jpg",
            "https://cdn41.picsart.com/169492486000202.jpeg",
            "https://www.freejupiter.com/wp-content/uploads/2015/03/Funny-Easter-bunny-Pictures-and-Images-26.jpg",
            "https://images6.alphacoders.com/111/thumb-1920-1114513.jpg",
            "https://cdn.fishki.net/upload/post/201508/03/1617182/6_22.jpg",
            "https://mir-s3-cdn-cf.behance.net/project_modules/fs/1fcfe2114831943.6042731e5ca4e.png",
            "https://phonoteka.org/uploads/posts/2021-06/1624295172_39-phonoteka_org-p-oboi-vodopad-krasivo-47.jpg"
        )
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Glide.with(this)
                .load(listOfPict[count])
                .into(findViewById(R.id.image))
            count = if (count < 9) count + 1 else 0
        }
    }
}