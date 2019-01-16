package com.santosh.animations.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.motion.MotionLayout
import com.santosh.animations.R
import kotlinx.android.synthetic.main.activity_key_frames.*

class KeyFramesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_key_frames)

        motionlayout_container.setTransitionListener(
            object : MotionLayout.TransitionListener {
                override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {

                }

                override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {

                }

                override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {

                }

                override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                    if (p1 == R.id.end) {
                        motionlayout_container.transitionToStart()
                    } else {
                        motionlayout_container.transitionToEnd()
                    }
                }
            })
    }

    override fun onResume() {
        super.onResume()
        motionlayout_container.transitionToEnd()
    }
}
