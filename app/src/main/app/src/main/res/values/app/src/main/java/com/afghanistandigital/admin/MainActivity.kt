package com.afghanistandigital.admin

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    private val dark = Color.rgb(16, 24, 32)
    private val red = Color.rgb(190, 25, 35)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(28, 28, 28, 28)
        layout.setBackgroundColor(dark)

        val title = TextView(this)
        title.text = "🇦🇫 افغانستان دیجیتال ادمین"
        title.textSize = 25f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER
        layout.addView(title)

        val subtitle = TextView(this)
        subtitle.text = "AFGHANISTAN DIGITAL ADMIN"
        subtitle.textSize = 14f
        subtitle.setTextColor(Color.LTGRAY)
        subtitle.gravity = Gravity.CENTER
        layout.addView(subtitle)

        val pin = EditText(this)
        pin.hint = "رمز چهار رقمی"
        pin.inputType = 2
        pin.setTextColor(Color.WHITE)
        pin.gravity = Gravity.CENTER
        layout.addView(pin)

        val login = Button(this)
        login.text = "ورود"
        login.setBackgroundColor(red)
        layout.addView(login)

        val message = TextView(this)
        message.text = ""
        message.textSize = 17f
        message.setTextColor(Color.WHITE)
        message.gravity = Gravity.CENTER
        layout.addView(message)

        login.setOnClickListener {
            if (pin.text.toString() == "1234") {
                message.text = "خوش آمدید"
                showDashboard()
            } else {
                message.text = "رمز اشتباه است"
            }
        }

        setContentView(layout)
    }

    private fun showDashboard() {
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(24, 24, 24, 24)
        layout.setBackgroundColor(dark)

        val title = TextView(this)
        title.text = "صفحه مدیریت افغانستان دیجیتال"
        title.textSize = 23f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER
        layout.addView(title)

        val items = listOf(
            "مدیریت مشتریان",
            "بدهکاران و حساب‌ها",
            "کاربران فعال",
            "اشتراک‌ها",
            "گزارش‌ها",
            "تغییر رمز"
        )

        for (item in items) {
            val button = Button(this)
            button.text = item
            layout.addView(button)
        }

        setContentView(layout)
    }
}
