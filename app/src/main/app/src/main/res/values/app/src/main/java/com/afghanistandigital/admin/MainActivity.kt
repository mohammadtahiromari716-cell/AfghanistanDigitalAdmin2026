package com.afghanistandigital.admin

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(24, 24, 24, 24)
        layout.setBackgroundColor(Color.rgb(16, 24, 32))

        val title = TextView(this)
        title.text = "🇦🇫 افغانستان دیجیتال"
        title.textSize = 26f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER
        layout.addView(title)

        val subtitle = TextView(this)
        subtitle.text = "AFGHANISTAN DIGITAL ADMIN"
        subtitle.textSize = 16f
        subtitle.setTextColor(Color.LTGRAY)
        subtitle.gravity = Gravity.CENTER
        layout.addView(subtitle)

        val pin = EditText(this)
        pin.hint = "رمز چهار رقمی"
        pin.inputType = 2
        pin.gravity = Gravity.CENTER
        layout.addView(pin)

        val button = Button(this)
        button.text = "ورود"
        layout.addView(button)

        button.setOnClickListener {
            if (pin.text.toString() == "1234") {
                val message = TextView(this)
                message.text = "خوش آمدید"
                message.textSize = 24f
                message.setTextColor(Color.WHITE)
                message.gravity = Gravity.CENTER
                layout.removeAllViews()
                layout.addView(message)
            } else {
                Toast.makeText(this, "رمز اشتباه است", Toast.LENGTH_SHORT).show()
            }
        }

        setContentView(layout)
    }
}
