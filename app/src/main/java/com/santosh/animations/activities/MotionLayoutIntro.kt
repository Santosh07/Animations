package com.santosh.animations.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.santosh.animations.R

class MotionLayoutIntro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_layout_intro)

        findViewById<Button>(R.id.button_next).setOnClickListener {
            startActivity(Intent(this, KeyFramesActivity::class.java))
        }
    }
}
