package org.d3ifcool4010.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3ifcool4010.praassesment.databinding.FragmentHomeBinding
import org.d3ifcool4010.praassesment.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {

    private var luas = 0
    private  var keliling = 0
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
            val binding: FragmentPersegiPanjangBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_persegi_panjang, container, false
        )
       if (savedInstanceState !=null){
           luas = savedInstanceState.getInt("luas")
           keliling = savedInstanceState.getInt("keliling")
       }
          binding.hitung.setOnClickListener {
              var panjang = binding.ppanjang.text.toString().toInt()
              var lebar = binding.plebar.text.toString().toInt()

              luas = panjang * lebar
              keliling = 2*(panjang + lebar)
              binding.Hasil1.text = luas.toString()
              binding.Hasil2.text = keliling.toString()
      }
       binding.luasP = luas
       binding.kelilingp = keliling
        return binding.root
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("luas",luas)
        outState.putInt("keliling",keliling)
    }
}