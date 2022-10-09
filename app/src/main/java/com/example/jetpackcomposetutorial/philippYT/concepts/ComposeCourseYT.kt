package com.example.jetpackcomposetutorial.philippYT.concepts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpackcomposetutorial.philippYT.AnimatedCircularProgressBar

class ComposeCourseYT : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ImageCardView()
//            StylingText()
//            State()
//            SimpleTextFieldButtonSnackBar()
//            SimpleList()
//            ConstraintLayoutTutorial()
//            SimpleAnimation()
            AnimatedCircularProgressBar()
        }
    }
}