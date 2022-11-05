package com.keycod.bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭되었다는 것을 알아야 합니다! (프로그램이)
        val image1 = findViewById<ImageView>(R.id.btsImage1)
        //1번이미지를 클릭시
        image1.setOnClickListener{

            //1번이미지를 클릭하면 "1번클릭완료 메시지를 출력"
            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()
            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌!
            //변수를 설정후
            val intent = Intent(this, Bts1Activity::class.java)
            //변수를 실행
            startActivity(intent)

        }

        var image2 = findViewById<ImageView>(R.id.btsImage2)

        image2.setOnClickListener {
            Toast.makeText(this,"2번 클릭 완료",Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }


        var image3 = findViewById<ImageView>(R.id.btsImage3)
        var image4 = findViewById<ImageView>(R.id.btsImage4)
        var image5 = findViewById<ImageView>(R.id.btsImage5)
        var image6 = findViewById<ImageView>(R.id.btsImage6)
        var image7 = findViewById<ImageView>(R.id.btsImage7)

        image3.setOnClickListener {
            Toast.makeText(this,"3번 클릭 완료",Toast.LENGTH_SHORT).show()
            intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            Toast.makeText(this,"4번 클릭 완료",Toast.LENGTH_SHORT).show()
            intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {
            Toast.makeText(this,"5번 클릭 완료", Toast.LENGTH_SHORT).show()
            intent = Intent(this,Bts5Activity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener {
            Toast.makeText(this,"6번 클릭 완료", Toast.LENGTH_SHORT).show()
            intent = Intent(this,Bts6Activity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener {
            Toast.makeText(this,"7번 클릭 완료", Toast.LENGTH_SHORT).show()
            intent = Intent(this,Bts7Activity::class.java)
            startActivity(intent)
        }


    }
}