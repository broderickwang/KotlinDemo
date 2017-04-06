package marc.com.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import marc.com.kotlindemo.util.shortToast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val  tv : TextView = findViewById(R.id.abc) as TextView

        tv.setText(sum(4,5).toString())*/

        activity_main.abc.setText(sum(4,5).toString())

        activity_main.abc.setOnClickListener {
            shortToast(this,"点击了测试textview")
            cases(1)
        }
    }

    fun cases(obj: Any) {
        when (obj) {
            1 -> shortToast(this,"1")
            "hello" -> print("Greeting")
            is Long -> print("Long")
            !is Long -> print("Not a string")
            else -> print("Unknown")
        }
    }


    fun sum(a:Int,b:Int):Int{
        return a+b;
    }
}
