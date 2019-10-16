package buu.informatics.c59160130.miniproject02


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.informatics.c59160130.miniproject02.databinding.FragmentHerbsBinding
import buu.informatics.c59160130.miniproject02.databinding.FragmentHerbsHomeBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class herbsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHerbsBinding>(inflater,R.layout.fragment_herbs,container,false)
        binding.diseaseTypeButton03.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_herbsFragment_to_herbsHomeFragment)
        }

        binding.backButton.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_herbsFragment_to_diseaseTypeFragment)
        }
        return binding.root
    }


}
