package marc.com.kotlindemo.util

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by Broderick on 2017/4/6.
 */
fun AppCompatActivity.shortToast(context : Context, msg : String){
    Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
}