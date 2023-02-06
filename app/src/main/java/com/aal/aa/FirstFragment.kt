package com.aal.aa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aal.aa.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    fun p(what: String){
        //TODO: would be nice to dynamically add a scrollable (if needed @avaliable screen space)
        //HACK: text
        //FIXME: hmm why a hack-saw is not a key-word?
        binding.textviewConsole.text = "${binding.textviewConsole.text}\n$what"
    }
/*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        var school: String = "vidusskola"
        // update
        school = "RTU"
//        println("Hello  there at $school")
        p("Hello  there at $school")
        val a=5
        val b: Int =2
        var c=a*b
        //println("$a * $b == $c")
        p("$a * $b == $c")
        c++
        c+= 2
//        lets leave this for the beautiful view of a nature scene sake
        println("c is now $c")
        p("c is now $c")
        binding.textviewFirst.text = "nooo not the barbaristic bararians!!!!!!! Rome has fallen."
    }
*/
override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.buttonFirst.setOnClickListener {
        findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
    }
    p("1+1="+(1+1))
    p("-8%3="+(-8%3))
    p("2.times(3)"+2.times(3))
    p("0.1+0.2"+(0.1+0.2))
    p("0.1.toFloat()+0.2.toFloat() "+(0.1.toFloat()+0.2.toFloat()))
    val a: Int=300
    val b = a.toByte()
    p("val b ir : $b")
    binding.textviewFirst.text = "answer:"
}
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}