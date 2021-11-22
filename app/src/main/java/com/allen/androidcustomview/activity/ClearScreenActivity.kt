package com.allen.androidcustomview.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.allen.androidcustomview.R
import com.allen.androidcustomview.widget.ClearScreenMode
import com.allen.androidcustomview.widget.ClearScreenView
import kotlinx.android.synthetic.main.activity_clear_screen.*

/**
 * <pre>
 *      author  : Allen
 *      e-mail  : yagang.li@yintech.cn
 *      date    : 2021/1/28
 *      desc    :
 * </pre>
 */
class ClearScreenActivity : AppCompatActivity(), ClearScreenView.OnClearScreenListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clear_screen)

        clear_screen_container.addClearView(iv_clear_content)

        clear_screen_container.setOnClearScreenListener(this)

        btn_quick_clear.setOnClickListener { clear_screen_container.clearScreenMode = ClearScreenMode.QUICK_SCROLL }
        btn_slow_clear.setOnClickListener { clear_screen_container.clearScreenMode = ClearScreenMode.SLOW_SCROLL }
    }

    override fun onCleared() {
        Toast.makeText(this, "清屏了", Toast.LENGTH_SHORT).show()
    }

    override fun onRestored() {
        Toast.makeText(this, "恢复了", Toast.LENGTH_SHORT).show()
    }
}