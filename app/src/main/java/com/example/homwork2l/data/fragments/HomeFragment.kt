package com.example.homwork2l.data.fragments
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.homwork2l.R
import com.example.homwork2l.data.model.Lakcross
import com.example.homwork2l.databinding.FragmentHomeBinding
import com.example.presentation.adapters.LakcrossAdapters

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding
        get() = _binding!!
    private val soccerAdapter = LakcrossAdapters()
    private val safeList = mutableListOf<Lakcross>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fillSoccerList()
        initialize()
        goToItem()
    }

    private fun fillSoccerList() {
        safeList.apply {
            add(Lakcross(R.drawable.lakcross, "Реал мадрид"))
            add(Lakcross(R.drawable.lakcross, "Барселона"))
        }
    }

    private fun initialize() {
        binding.recyclerViewHome.adapter = soccerAdapter
        soccerAdapter.setSoccerList(safeList)
    }

    private fun goToItem() {
        binding.buttonHome.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_addItemFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}