package buu.informatics.c59160130.miniproject02


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.informatics.c59160130.miniproject02.databinding.FragmentDiseaseTypeBinding
import buu.informatics.c59160130.miniproject02.databinding.FragmentHerbsHomeBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class diseaseTypeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentDiseaseTypeBinding>(inflater,R.layout.fragment_disease_type,container,false)
        binding.diseaseTypeButton02.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_diseaseTypeFragment_to_herbsFragment)
        }
        binding.homeHerbButton02.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_diseaseTypeFragment_to_herbsHomeFragment)
        }
        return binding.root
    }


}
