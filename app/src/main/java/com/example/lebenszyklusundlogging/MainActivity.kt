package com.example.lebenszyklusundlogging


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dummy.Person
import com.example.lebenszyklusundlogging.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG: String?= MainActivity::class.java.simpleName
    lateinit var binding: ActivityMainBinding
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        if(savedInstanceState != null){
//            counter = savedInstanceState.getInt("counter")
//            binding.tvOutput.text = counter.toString()
//        }

        binding.btnCount.setOnClickListener {
            counter++
            binding.tvOutput.text = counter.toString()
            // counter an Fragment übergeben
            (supportFragmentManager.fragments[0] as InfoFragment).binding.tvFragmentOutput.text = counter.toString()
        }

//        try {
//            throw java.lang.Exception()
//        }catch (e:java.lang.Exception){
//            Log.e(TAG,"Fehler im try Block",e)
//        }
//        Log.v(TAG, "Verbose ")
//        Log.d(TAG, "Debug ")
//        Log.i(TAG, "Info")
//        Log.w(TAG, " Warning ")
//        Log.e(TAG, "Error " )
//        Log.wtf(TAG, "WTF" )
        Log.d(TAG, "onCreate: Activity ist fertig initialisiert")
        var person = Person("Frank")
        Log.d(TAG, "onCreate: Person erzeugt")
        binding.tvOutput.text = person.name
        Log.d(TAG, "onCreate: ${person.name}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: kurz vor Sichtbarkeit")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: sichtbar und bereit für Interaktionen")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: keine Interaktion möglich, aber noch sichtbar")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: angehalten und im Hintergrund")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: vollständig zerstört")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: Neustart und Aufruf von Start")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState: Zustand wird gespeichert")
        outState.putInt("counter", counter)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState: Zustand wird wieder hergestellt")
        counter = savedInstanceState.getInt("counter",0)
        binding.tvOutput.text = counter.toString()
    }
}