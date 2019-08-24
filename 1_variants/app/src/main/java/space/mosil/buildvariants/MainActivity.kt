package space.mosil.buildvariants

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var TAG = MainActivity::class.java.name;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_main_content.setText(R.string.gradle_main_string);

        Log.d(TAG, "" + resources.getString(R.string.gradle_string))
        Log.d(TAG, "" + resources.getInteger(R.integer.gradle_integer))
        Log.d(TAG, "" + resources.getBoolean(R.bool.gradle_bool))
    }
}
