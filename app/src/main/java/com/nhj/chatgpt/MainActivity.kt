package com.nhj.chatgpt

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.nhj.chatgpt.R
import com.nhj.chatgpt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }















    /*
    public fun test(){
        if (i%2==0){
            val comparator1 = compareBy<UserBean>({it.age},{-it.height})
            (users as MutableList<UserBean>).sortWith(comparator1)
            LogUtils.iTag("MainActivity","comparator1 = ${JSON.toJSONString(users)}");
            val comparator2 = compareByDescending<UserBean>({it.age}).thenBy{-it.height}
            (users as MutableList<UserBean>).sortWith(comparator2)
            LogUtils.iTag("MainActivity","comparator1 = ${JSON.toJSONString(users)}");
        }else{
//                val comparator1 = compareBy<UserBean>({it.height},{it.name})
//                users.sortedWith(comparator1)
//                LogUtils.iTag("MainActivity","he comparator1 = ${JSON.toJSONString(users)}");
//                val comparator2 = compareByDescending<UserBean>({it.age}).thenBy{it.name}
//                users.sortedWith(comparator2)
//                LogUtils.iTag("MainActivity","he comparator1 = ${JSON.toJSONString(users)}");
            val comparator1 = compareBy<UserBean>({it.age},{it.name})
            (users as MutableList<UserBean>).sortWith(comparator1)
            LogUtils.iTag("MainActivity","comparator1 = ${JSON.toJSONString(users)}");
            val comparator2 = compareByDescending<UserBean>({it.age}).thenBy{it.name}
            (users as MutableList<UserBean>).sortWith(comparator2)
            LogUtils.iTag("MainActivity","comparator1 = ${JSON.toJSONString(users)}");
        }
        i++;

    }*/

    data class UserBean(val age:Int,var name:String,var height:Int){}
}