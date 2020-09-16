package com.johnqualls.layoutexamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animateButton = findViewById<MaterialButton>(R.id.animate_action_button)
        val motionLayout = findViewById<MotionLayout>(R.id.layout)
        animateButton.setOnClickListener {
            motionLayout.run {
                when(currentState) {
                    startState -> transitionToEnd()
                    endState -> transitionToStart()
                }
            }
        }
    }
}