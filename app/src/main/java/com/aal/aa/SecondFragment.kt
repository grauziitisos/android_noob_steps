package com.aal.aa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aal.aa.databinding.FragmentSecondBinding
import java.util.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    fun p(what: String){
        //TODO: would be nice to dynamically add a scrollable (if needed @avaliable screen space)
        //HACK: text
        //FIXME: hmm why a hack-saw is not a key-word?
        binding.textViewConsole.text = "${binding.textViewConsole.text}\n$what"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
val s ="abs"
        p("$s.length is ${s.length}")
        p("123123123$s$s$s")
        p("")
        p("")
        p("123123123$s$s$s")
        var pets = arrayOf("dogs", "cats", "snakes", "birds")
        // var numberOfBooks: Int? = null
        // bet iesaka neizmantot nulls un turēties pie unimutable types (val).
        // numberOfBooks?.dec()
        // numberOfBooks?.dec() ?: 0 (ja nav null tad liek dec() ja ir tad liek 0.
        p(Arrays.toString(pets))
        var newPets = pets.toList().map{" new "+it}
        newPets.forEach{ a: String -> println(a)}
        for (pet in pets) {
            p("Cool, I got a ${pet.trimEnd{it=='s'}} at home")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}