package com.example.homwork2l.data.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homwork2l.R
import com.example.homwork2l.data.model.PrefenceHelper
import com.example.homwork2l.databinding.FragmentHomeBinding
import com.example.homwork2l.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListenners()
    }

    private fun setupListenners() = with(binding) {
        val prefenceHelper = PrefenceHelper(requireContext())
        btnSingIn.setOnClickListener {
            prefenceHelper.userName = etUserName.text.toString().trim()
            findNavController().navigate(R.id.action_singUpFragment2_to_homeFragment2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}