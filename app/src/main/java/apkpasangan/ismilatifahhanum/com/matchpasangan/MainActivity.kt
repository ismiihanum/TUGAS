package apkpasangan.ismilatifahhanum.com.matchpasangan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener { aduPasangan()}
    }

     fun aduPasangan() {
         val randomcowok = Random().nextInt (5)+1
         val randomcewek = Random().nextInt (5)+1
         val drawableRescewek = when (randomcewek){
            1 -> R.drawable.hanum
             2 -> R.drawable.fuji
             3 -> R.drawable.mela
             4 -> R.drawable.umikhotimatuss
             else -> R.drawable.ayulest

             }
         val drawableRescowok = when (randomcowok){
             1 -> R.drawable.edi
             2 -> R.drawable.rggy
             3 -> R.drawable.deni
             4 -> R.drawable.huda_mobile
             else -> R.drawable.odiba
         }

        ivcowok.setImageResource(drawableRescewek)
         ivcewek.setImageResource (drawableRescowok)
    }
}
