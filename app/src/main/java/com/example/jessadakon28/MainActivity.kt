package com.example.wanwisa023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //ซ่อน Title bar
        supportActionBar?.hide()

        //การดักจับ
        btn_cc.setOnClickListener(View.OnClickListener {

            img_img.setImageDrawable(getDrawable(R.drawable.chiangmai_img))
            tv_header.setText("จังหวัด "+getString(R.string.btn_cc))
            tv_vi.setText(getString(R.string.content_cc))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_cc),Toast.LENGTH_LONG).show()

        })

        //การดักจับ
        btn_na.setOnClickListener(View.OnClickListener {

            img_img.setImageDrawable(getDrawable(R.drawable.nam_img))
            tv_header.setText("จังหวัด "+getString(R.string.btn_na))
            tv_vi.setText(getString(R.string.content_na))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_na),Toast.LENGTH_LONG).show()

        })

        //การดักจับ
        btn_cr.setOnClickListener(View.OnClickListener {

            img_img.setImageDrawable(getDrawable(R.drawable.chaingrai_img))
            tv_header.setText("จังหวัด "+getString(R.string.btn_cr))
            tv_vi.setText(getString(R.string.content_cr))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_cr),Toast.LENGTH_LONG).show()
        })

        //การดักจับ
        btn_ph.setOnClickListener(View.OnClickListener {

            img_img.setImageDrawable(getDrawable(R.drawable.phrae_img))
            tv_header.setText("จังหวัด "+getString(R.string.btn_ph))
            tv_vi.setText(getString(R.string.content_ph))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_ph),Toast.LENGTH_LONG).show()

        })

    }
}
