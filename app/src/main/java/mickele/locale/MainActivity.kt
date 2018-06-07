package mickele.locale

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reopen.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        createWebView.setOnClickListener {
            WebView(this)
        }
    }

    override fun onResume() {
        super.onResume()
        title = getString(R.string.app_current, Locale.getDefault())
    }

}
