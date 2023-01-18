package com.example.lebenszyklusundlogging

import android.content.Context
import android.os.Bundle
import android.util.Config.LOGD
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lebenszyklusundlogging.databinding.FragmentInfoBinding

class InfoFragment: Fragment() {

    lateinit var binding: FragmentInfoBinding
    val TAG = InfoFragment::class.java.simpleName

    override fun onAttach(context: Context) {
        super.onAttach(context)
         Log.d(TAG, "onAttach: Fragment wird an Activity gebunden")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: Das Fragment wird erstellt")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView: View des Fragments wird erstellt")
        binding = FragmentInfoBinding.inflate(inflater,container,false)
        return binding.root
    }

    @Suppress("DEPRECATION")
    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "onActivityCreated: Jetzt kann man die Activity nutzen")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated: View ist erstellt und Activity kann verwendet werden")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: Fragment wird vorbereitet")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: Fragment sichtbar und zur Interaktion bereit")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: Fragment im Hintergrund aber noch sichtbar")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: Fragment im Hintergrund")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView: View wird zerstört")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: Fragment wird zerstört")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach: Fragment wird von der Activity getrennt")
    }


}