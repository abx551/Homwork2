package com.example.homwork2l.data.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.homwork2l.R
import com.example.homwork2l.data.model.Lakcross
import com.example.homwork2l.databinding.FragmentAddItemBinding

class AddItemFragment : Fragment() {
    private var _binding: FragmentAddItemBinding? = null
    private val binding: FragmentAddItemBinding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddItemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()

    }

    private fun setupListeners() = with(binding) {
        button1.setOnClickListener {
            val SafeList = Lakcross(2, "")
            findNavController().navigate(
                addItemFragmentDirections.actionAddItemFragment2ToHomeFragment2(
                    SafeList
                )
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}