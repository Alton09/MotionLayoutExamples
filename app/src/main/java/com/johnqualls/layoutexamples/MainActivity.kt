package com.johnqualls.layoutexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animateButton = findViewById<MaterialButton>(R.id.animate_action_button)
        val motionLayout = findViewById<MotionLayout>(R.id.layout)
        val handler = Handler(Looper.getMainLooper())
        animateButton.setOnClickListener {
            motionLayout.run {
                when(currentState) {
                    startState -> transitionToEnd()
                    endState -> transitionToStart()
                }
            }
        }
//
//        motionLayout.addTransitionListener(object: MotionLayout.TransitionListener {
//            override fun onTransitionCompleted(layout: MotionLayout?, p1: Int) {
//                if (layout.transition == layout.getTransition(R.id.blink))
//            }
//
//            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {}
//
//            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {}
//
//            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {}
//        } )
    }
}