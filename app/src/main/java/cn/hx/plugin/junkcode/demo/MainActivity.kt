package cn.hx.plugin.junkcode.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RelativeLayout
import android.widget.TableLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private val tx =  TextView(this)

    private val text: TextView ?= null


    private val viewPager2: Byte?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 每个activity都会有一个window，window.decorView则是在activity布局之上的布局
        (window.decorView as ViewGroup).addView(tx)
        tx.text = "123132165464"


        text?.findViewById<TextView>(R.id.tv_1)
        text?.text = "123165"
    }



    fun aaa(){

    }
}


