package com.example.hotelsapp.fragments

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.hotelsapp.R
import com.example.hotelsapp.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)

        binding.usernameProfileText.text = activity?.intent?.extras?.getString("Name")
        binding.emailProfile.text = activity?.intent?.extras?.getString("Email")
        binding.phoneProfile.text = activity?.intent?.extras?.getString("Phone")

        binding.personalInfoCard.setOnClickListener {}
        binding.passwordProfileCard.setOnClickListener {}
        binding.exitProfileCard.setOnClickListener {}

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
            inflater.inflate(R.menu.profile_navigation, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {

            R.id.exitMenu -> {
                activity?.finish()
                binding.phoneProfile.text = "dfssf"
            }
        }
        return true
    }
}