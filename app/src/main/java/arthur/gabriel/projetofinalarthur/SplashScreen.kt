package arthur.gabriel.projetofinalarthur

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val imgLogo = findViewById<ImageView>(R.id.imgLogoSS)
        imgLogo.animation = AnimationUtils.loadAnimation(this, R.anim.shakeanimation)

        supportActionBar!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        Handler().postDelayed(Runnable {
            startActivity(Intent(baseContext, LoginAndRegister::class.java))
            // Intent it = new Intent(main..this, tela2.class);
            // startActivity(it)
            finish()
        }, 3000) // segundos
    }
}