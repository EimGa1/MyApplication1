package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView

class MainActivity4 : AppCompatActivity() {
    lateinit var tb: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val qert1:RecyclerView=findViewById(R.id.res2)
        qert1.adapter=Content_adapter1(this, contentList1().list1)
        val qwert:RecyclerView=findViewById(R.id.res1)
        qwert.adapter=Content_adapter(this, contentList().list)
        tb = findViewById(R.id.toolbar)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Кино"

        val video:VideoView=findViewById(R.id.videoView)
        val mediaController=MediaController(this)
        mediaController.setAnchorView(video)
        val onLineurl= Uri.parse ("https://rr3---sn-25ge7nzd.googlevideo.com/videoplayback?e\n" +
                "xpire=1671038319&ei=D7GZY42gGo6L6dsP_7GxuAk&ip=185.147.21\n" +
                "2.18&id=o-ALB2_2a8QS1d8guABM4x1RCFL78MzCMu-BPyym2nZFmM&it\n" +
                "ag=18&source=youtube&requiressl=yes&mh=pm&mm=31%2C26&mn=s\n" +
                "n-25ge7nzd%2Csn-h5qzened&ms=au%2Conr&mv=m&mvi=3&pl=24&ini\n" +
                "tcwndbps=702500&spc=zIddbCVt1AqOUpQt9mWJGT01jjnMcws&vprv=\n" +
                "1&mime=video%2Fmp4&ns=H7pnqCuW5loMz_b62l6hRTwK&cnr=14&rat\n" +
                "ebypass=yes&dur=165.720&lmt=1664315358357458&mt=167101592\n" +
                "2&fvip=1&fexp=24001373%2C24007246&c=WEB&txp=5538434&n=Uwr\n" +
                "f6OHMHatKEQ&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource\n" +
                "%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass\n" +
                "%2Cdur%2Clmt&sig=AOq0QJ8wRAIgXryJbfZstp62DU1bSqDeOvqjy7eM\n" +
                "LxfzjxcFF_xb1tYCIAD7M7OucMuCqmBG7fvCsgkRcST46b1UaTia8SaUj\n" +
                "Ous&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwnd\n" +
                "bps&lsig=AG3C_xAwRAIgGD7WKFXwscjZbqKPXvkal3NE-lvzPplJGZfS\n" +
                "h_JUqbACIDH5N2KxxcpQ99q2S-fUP78mVR1Q7uZ9kyIjbyj8RsTu")
        video.setMediaController(mediaController)
        video.setVideoURI(onLineurl)
        video.requestFocus()


        val video2:VideoView=findViewById(R.id.videoView)
        val mediaController2=MediaController(this)
        mediaController.setAnchorView(video)
        val onlie2= Uri.parse ("https://rr3---sn-25ge7nzd.googlevideo.com/videoplayback?e\n" +
                "xpire=1671038319&ei=D7GZY42gGo6L6dsP_7GxuAk&ip=185.147.21\n" +
                "2.18&id=o-ALB2_2a8QS1d8guABM4x1RCFL78MzCMu-BPyym2nZFmM&it\n" +
                "ag=18&source=youtube&requiressl=yes&mh=pm&mm=31%2C26&mn=s\n" +
                "n-25ge7nzd%2Csn-h5qzened&ms=au%2Conr&mv=m&mvi=3&pl=24&ini\n" +
                "tcwndbps=702500&spc=zIddbCVt1AqOUpQt9mWJGT01jjnMcws&vprv=\n" +
                "1&mime=video%2Fmp4&ns=H7pnqCuW5loMz_b62l6hRTwK&cnr=14&rat\n" +
                "ebypass=yes&dur=165.720&lmt=1664315358357458&mt=167101592\n" +
                "2&fvip=1&fexp=24001373%2C24007246&c=WEB&txp=5538434&n=Uwr\n" +
                "f6OHMHatKEQ&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource\n" +
                "%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass\n" +
                "%2Cdur%2Clmt&sig=AOq0QJ8wRAIgXryJbfZstp62DU1bSqDeOvqjy7eM\n" +
                "LxfzjxcFF_xb1tYCIAD7M7OucMuCqmBG7fvCsgkRcST46b1UaTia8SaUj\n" +
                "Ous&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwnd\n" +
                "bps&lsig=AG3C_xAwRAIgGD7WKFXwscjZbqKPXvkal3NE-lvzPplJGZfS\n" +
                "h_JUqbACIDH5N2KxxcpQ99q2S-fUP78mVR1Q7uZ9kyIjbyj8RsTu")
        val offl=Uri.parse("android.resource://$packageName/${R.raw.klaus2}")
        video2.setMediaController(mediaController2)
        video2.setVideoURI(offl)
        video2.requestFocus()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home -> {
            val inte = Intent(this, MainActivity3::class.java)
            startActivity(inte)
            finish()
        }

                R.id.it -> {
                Toast.makeText(this, "Работает", Toast.LENGTH_SHORT).show()
            }

            R.id.it1 -> {
                val intent = Intent (this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }


            R.id.it2 -> {
                val intent = Intent (this, MainActivity5::class.java)
                startActivity(intent)
                finish()
            }

        }
        return true
    }





    }


