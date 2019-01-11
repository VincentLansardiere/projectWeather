package com.example.vince.projectweather


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Humidite : Fragment() {

    val TAG = "Humidite"
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_humidite, container, false)
    }

    override fun onAttach(context: Context?) {
        Log.d(TAG,"OnAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"OnCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG,"OnActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"OnStart")
        super.onStart()
    }

    override fun onPause() {
        Log.d(TAG,"OnPause")
        super.onPause()
    }

    override fun onResume() {
        Log.d(TAG,"OnResume")
        super.onResume()
    }

    override fun onStop() {
        Log.d(TAG,"OnStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG,"OnDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG,"OnDestroy")
        super.onDestroy()
    }


    override fun onDetach() {
        Log.d(TAG,"OnDetach")
        super.onDetach()
    }



}
