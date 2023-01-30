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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        var school: String = "vidusskola"
        // update
        school = "RTU"
        println("Hello  there at $school")
        val a=5
        val b: Int =2
        var c=a*b
        println("$a * $b == $c")
        c++
        c+= 2
        println("c is now $c")
        binding.textviewFirst.text = "nooo not the barbaristic bararians!!!!!!! Rome has fallen."
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}