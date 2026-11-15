
package com.afghanistandigital.admin

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            val layout = LinearLayout(this)
            layout.orientation = LinearLayout.VERTICAL
            layout.gravity = Gravity.CENTER
            layout.setPadding(30, 30, 30, 30)
            layout.setBackgroundColor(Color.rgb(16, 24, 32))

            val title = TextView(this)
            title.text = "🇦🇫 افغانستان حساب"
            title.textSize = 28f
            title.setTextColor(Color.WHITE)
            title.gravity = Gravity.CENTER
            layout.addView(title)

            val subtitle = TextView(this)
            subtitle.text = "AFGHANISTAN HISAB"
            subtitle.textSize = 16f
            subtitle.setTextColor(Color.LTGRAY)
            subtitle.gravity = Gravity.CENTER
            layout.addView(subtitle)

            val pin = EditText(this)
            pin.hint = "رمز چهار رقمی"
            pin.inputType = 2
            pin.gravity = Gravity.CENTER
            pin.setTextColor(Color.WHITE)
            pin.setHintTextColor(Color.LTGRAY)

            layout.addView(pin)

            val button = Button(this)
            button.text = "ورود"
            layout.addView(button)

            button.setOnClickListener {
                if (pin.text.toString() == "1234") {
                    layout.removeAllViews()

                    val welcome = TextView(this)
                    welcome.text = "خوش آمدید"
                    welcome.textSize = 28f
                    welcome.setTextColor(Color.WHITE)
                    welcome.gravity = Gravity.CENTER

                    layout.addView(welcome)
                } else {
                    Toast.makeText(
                        this,
                        "رمز اشتباه است",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            setContentView(layout)

        } catch (e: Exception) {
            Toast.makeText(
                this,
                "خطا در اجرای برنامه",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
