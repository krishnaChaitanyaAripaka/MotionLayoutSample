package com.chaitu.motionlayoutsample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.Guideline
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    private lateinit var alert: AppCompatTextView
    private lateinit var guideLineToolbar: Guideline

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alert = findViewById(R.id.alert)
        guideLineToolbar = findViewById(R.id.guideline_toolbar)


        findViewById<AppCompatTextView>(R.id.item_1).setOnClickListener {
            if (alert.isVisible) {
                alert.visibility = View.GONE
                guideLineToolbar.setGuidelineBegin(resources.getDimensionPixelSize(R.dimen.dimen_160))
            } else {
                alert.visibility = View.VISIBLE
                guideLineToolbar.setGuidelineBegin(resources.getDimensionPixelSize(R.dimen.dimen_290))
            }
        }
    }
}