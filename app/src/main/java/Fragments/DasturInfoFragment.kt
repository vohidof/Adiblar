package Fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vohidov.adiblar.R
import com.vohidov.adiblar.databinding.FragmentDasturInfoBinding
import kotlinx.android.synthetic.main.fragment_dastur_info.*


class DasturInfoFragment : Fragment() {

    lateinit var binding: FragmentDasturInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDasturInfoBinding.inflate(layoutInflater)

        binding.telefon.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_DIAL,
                Uri.parse("tel:" + Uri.encode("+998970402005"))
            )
            startActivity(intent)
        }

        binding.telegram.setOnClickListener {
            val url = "https://t.me/vhdvm"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }


        // Inflate the layout for this fragment
        return binding.root
    }
}