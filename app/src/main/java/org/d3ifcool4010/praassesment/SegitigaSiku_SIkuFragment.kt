package org.d3ifcool4010.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3ifcool4010.praassesment.databinding.FragmentPersegiPanjangBinding
import org.d3ifcool4010.praassesment.databinding.FragmentSegitigaSikuSikuBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaSiku_SIkuFragment : Fragment() {
    private var luas = 0.0
    private var keliling = 0.0
    private  var miring = 0.0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSegitigaSikuSikuBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_segitiga_siku__siku, container, false
        )
        binding.hitung.setOnClickListener {
            var alas = binding.pAlas.text.toString().toDouble()
            var tinggi = binding.ptinggi.text.toString().toDouble()

            luas = (alas * tinggi)/2.0
            keliling =alas + tinggi +miring
            miring = Math.sqrt(Math.pow(alas,2.0) + Math.pow(tinggi,2.0))

            binding.Hasil1.text = luas.toString()
            binding.Hasil2.text = keliling.toString()

        }

        return binding.root

    }
}
