package com.cekepek.adv160420021week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //kalau versi electric eel harus val btnStart = view.findViewById<Button>(R.id.btnStart) dulu

        btnStart.setOnClickListener{
            val action = MainFragmentDirections.actionGameFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}