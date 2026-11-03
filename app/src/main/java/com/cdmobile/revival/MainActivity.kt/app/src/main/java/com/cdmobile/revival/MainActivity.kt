package com.cdmobile.revival

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.EditText
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(32, 32, 32, 32)
        layout.setBackgroundColor(Color.rgb(15, 23, 42))

        val title = TextView(this)
        title.text = "CD MOBILE REVIVAL"
        title.textSize = 27f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val username = EditText(this)
        username.hint = "Username"

        val password = EditText(this)
        password.hint = "Password"

        val login = Button(this)
        login.text = "LOGIN"

        val status = TextView(this)
        status.text = "Your own server"
        status.setTextColor(Color.LTGRAY)

        layout.addView(title)
        layout.addView(username)
        layout.addView(password)
        layout.addView(login)
        layout.addView(status)

        setContentView(layout)
    }
}
