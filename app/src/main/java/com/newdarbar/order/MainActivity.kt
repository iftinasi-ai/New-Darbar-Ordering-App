
package com.newdarbar.order

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*
import android.graphics.Typeface

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(20, 24, 20, 20)
        layout.setBackgroundColor(Color.rgb(245, 243, 250))

        val title = TextView(this)
        title.text = "NEW DARBAR"
        title.textSize = 28f
        title.setTextColor(Color.rgb(91, 44, 145))
        title.typeface = Typeface.DEFAULT_BOLD
        title.gravity = Gravity.CENTER
        layout.addView(title)

        val subtitle = TextView(this)
        subtitle.text = "Restaurant Ordering System"
        subtitle.textSize = 16f
        subtitle.gravity = Gravity.CENTER
        layout.addView(subtitle)

        val heading = TextView(this)
        heading.text = "SELECT TABLE"
        heading.textSize = 20f
        heading.setTextColor(Color.BLACK)
        heading.setPadding(0, 30, 0, 15)
        layout.addView(heading)

        val grid = GridLayout(this)
        grid.columnCount = 2

        for (i in 1..16) {
            val button = Button(this)
            button.text = "TABLE $i"
            button.textSize = 16f

            button.setOnClickListener {
                Toast.makeText(
                    this,
                    "Table $i Selected",
                    Toast.LENGTH_SHORT
                ).show()
            }

            val params = GridLayout.LayoutParams()
            params.width = 0
            params.height = 100
            params.columnSpec =
                GridLayout.spec(GridLayout.UNDEFINED, 1f)
            params.setMargins(5, 5, 5, 5)

            grid.addView(button, params)
        }

        layout.addView(grid)

        setContentView(layout)
    }
}
