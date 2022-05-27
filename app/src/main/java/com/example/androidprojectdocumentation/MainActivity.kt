package com.example.androidprojectdocumentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * This is main entrance of application
 *
 * @author Shubham Agarwal
 */
class MainActivity : AppCompatActivity() {

    /**
     * onCreate() function of this screen, responsible for view creation
     * @param savedInstanceState
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun functionWithoutDoc() {}

    /**
     * This is documentation for this function
     */
    fun functionWithDoc() {}
}