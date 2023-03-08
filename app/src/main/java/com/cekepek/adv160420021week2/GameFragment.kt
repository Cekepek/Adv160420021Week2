package com.cekepek.adv160420021week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_game.*
import kotlin.random.Random

class GameFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val firstNum = Random.nextInt(0,50)
        val secNum = Random.nextInt(0,50)
        txtFirstNum.text = "$firstNum"
        txtSecNum.text = "$secNum"

        if(arguments != null){
            val playerName = GameFragmentArgs.fromBundle(requireArguments()).playerName
            txtTurn.text = "$playerName's Turn"
        }
        btnAnswer.setOnClickListener {
            val answer = firstNum + secNum
            var score = 0
            if (Integer.parseInt(txtAnswer.text.toString()) == answer){
                score = 1
            }
            val action = GameFragmentDirections.actionResultFragment(score)
            Navigation.findNavController(it).navigate(action)
        }
    }
}